package com.tp_archi_distribuee.soapClient.clientGUI;
import com.tp_archi_distribuee.soapClient.SoapServiceClient;
import com.tp_archi_distribuee.soapClient.client.Offre;
import javax.swing.*; import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.awt.*; import java.util.Date; import java.util.GregorianCalendar;
import java.util.List;
public class SoapClientGUI extends JFrame
{ private SoapServiceClient serviceClient;
    private JTextField agenceId = new JTextField();
    private JTextField login = new JTextField();
    private JTextField password = new JTextField();
    private JTextField personnes = new JTextField();
    private JSpinner dateDebut;
    private JSpinner dateFin;
    private JPanel offresPanel = new JPanel();
    public SoapClientGUI() throws Exception
    { serviceClient = new SoapServiceClient();
        setTitle("Reservation Hotel");
        setSize(900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); dateDebut =
            new JSpinner(new SpinnerDateModel());
        dateDebut.setEditor(
                new JSpinner.DateEditor(dateDebut, "yyyy-MM-dd"));
        dateFin = new JSpinner(new SpinnerDateModel());
        dateFin.setEditor(
                 new JSpinner.DateEditor(dateFin, "yyyy-MM-dd"));
        //Formulaire
        JPanel form = new JPanel(new GridLayout(7, 2, 8, 8));
        form.setBorder(BorderFactory.createTitledBorder("Recherche"));
        form.add(new JLabel("Agence ID")); form.add(agenceId);
        form.add(new JLabel("Login")); form.add(login);
        form.add(new JLabel("Password")); form.add(password);
        form.add(new JLabel("Date début")); form.add(dateDebut);
        form.add(new JLabel("Date fin")); form.add(dateFin);
        form.add(new JLabel("Nb personnes")); form.add(personnes);
        // Bouton
        JButton callBtn = new JButton("Consulter les offres");
        callBtn.setPreferredSize(new Dimension(180, 30));
        callBtn.addActionListener(e -> callService());
        // Panel Boutton
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(callBtn);
        // Panel des offres
        offresPanel.setLayout(new BoxLayout(offresPanel, BoxLayout.Y_AXIS));
        JScrollPane scroll = new JScrollPane(offresPanel);
        scroll.setBorder(BorderFactory.createTitledBorder("Résultats"));
        JPanel centerPanel = new JPanel(new BorderLayout());
        centerPanel.add(buttonPanel, BorderLayout.NORTH);
        centerPanel.add(scroll, BorderLayout.CENTER);
        // ===== Ajout au JFrame
        add(form, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER); }
    private void callService() { try
    { offresPanel.removeAll();
        XMLGregorianCalendar d1 = toXMLDate((Date) dateDebut.getValue());
        XMLGregorianCalendar d2 = toXMLDate((Date) dateFin.getValue());
        @SuppressWarnings("unchecked")
        List<Offre> offres = (List<Offre>) serviceClient.
                getProxyDisponibilite().
                consulterDisponibilite(
                        Integer.parseInt(agenceId.getText()), login.getText(), password.getText(), d1, d2, Integer.parseInt(personnes.getText()) );
        if (offres.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Aucune offre trouvée.");
            return; }
        for (Offre offre : offres) {
            offresPanel.add(createOffrePanel(offre)); }
        
        offresPanel.revalidate(); offresPanel.repaint(); }
    catch (Exception ex) {
        JOptionPane.showMessageDialog(this, ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace(); } }
// ===== Création d’un panel pour UNE offre
private JPanel createOffrePanel(Offre offre)
{ JPanel panel = new JPanel(new BorderLayout(10, 10));
    panel.setBorder(BorderFactory.createCompoundBorder( BorderFactory.createTitledBorder("Offre"), BorderFactory.createEmptyBorder(10, 10, 10, 10) ));
    // ===== Détails de l'offre
    JTextArea details = new JTextArea();
    details.setEditable(false);
    details.setLineWrap(true);
    details.setWrapStyleWord(true);
    details.setText( "Hôtel : " + offre.getHotel().getNom() + "\n" +
            "Prix : " + offre.getPrix() + "\n" +
            "Nombre de lits : " + offre.getNbreLits() + "\n" +
            "Date début : " + offre.getDateDebutDisponibilte() + "\n" +
            "Date fin : " + offre.getDatefinDisponibilite() );
    panel.add(details, BorderLayout.CENTER);
    if (offre.getChambre() != null && offre.getChambre().getImg() != null && offre.getChambre().getImg().length > 0) {
        try {
            byte[] imgBytes = offre.getChambre().getImg();
            ImageIcon icon = new ImageIcon(imgBytes);
            Image img = icon.getImage().getScaledInstance(150, 100, Image.SCALE_SMOOTH);
            JLabel imageLabel = new JLabel(new ImageIcon(img)); panel.add(imageLabel, BorderLayout.WEST); }
        catch (Exception e) {
            JLabel placeholder = new JLabel("Image non lisible"); panel.add(placeholder, BorderLayout.WEST); } }
else { JLabel placeholder = new JLabel("Pas d'image disponible"); panel.add(placeholder, BorderLayout.WEST); } return panel; }

    private XMLGregorianCalendar toXMLDate(Date date) throws Exception
    { GregorianCalendar gc = new GregorianCalendar(); gc.setTime(date);
        return DatatypeFactory.newInstance().newXMLGregorianCalendarDate( gc.get(GregorianCalendar.YEAR),
                gc.get(GregorianCalendar.MONTH) + 1,
                gc.get(GregorianCalendar.DAY_OF_MONTH), DatatypeConstants.FIELD_UNDEFINED ); }
}