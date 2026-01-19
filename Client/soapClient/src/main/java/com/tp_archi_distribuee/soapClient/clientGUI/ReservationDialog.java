package com.tp_archi_distribuee.soapClient.clientGUI;

import com.tp_archi_distribuee.soapClient.SoapServiceClient;
import com.tp_archi_distribuee.soapClient.client.CreditCard;
import com.tp_archi_distribuee.soapClient.client.Offre;

import javax.swing.*;
import java.awt.*;

public class ReservationDialog extends JDialog {

    private JTextField emailField = new JTextField();
    private JTextField nomField = new JTextField();
    private JTextField numeroCarteField = new JTextField();
    private JTextField cvvField = new JTextField();
    private JTextField  dateExperitionField  = new JTextField();

    public ReservationDialog(
            JFrame parent,
            SoapServiceClient serviceClient,
            Offre offre,
            int agenceId,
            String login,
            String password
    ) {

        super(parent, "Réserver l'offre " + offre.getId(), true);
        setSize(400, 300);
        setLocationRelativeTo(parent);
        setLayout(new BorderLayout(10, 10));

        // ===== Formulaire
        JPanel form = new JPanel(new GridLayout(5, 2, 8, 8));
        form.setBorder(BorderFactory.createTitledBorder("Informations Client"));

        form.add(new JLabel("Email"));
        form.add(emailField);

        form.add(new JLabel("Nom"));
        form.add(nomField);

        form.add(new JLabel("Numéro carte"));
        form.add(numeroCarteField);

        form.add(new JLabel("CVV"));
        form.add(cvvField);

        form.add(new JLabel("Date expiration"));
        form.add(dateExperitionField);

        add(form, BorderLayout.CENTER);

        // ===== Boutons
        JButton reserverBtn = new JButton("Confirmer");
        JButton annulerBtn = new JButton("Annuler");

        reserverBtn.addActionListener(e -> {
            try {
                CreditCard card = new CreditCard();
                card.setNumCarte(numeroCarteField.getText());
                card.setCvv(cvvField.getText());
                card.setDateExpiration(dateExperitionField.getText());
System.out.println(card);


                String result = serviceClient.effectuerReservation(
                        offre.getId(),
                        agenceId,
                        login,
                        password,
                        emailField.getText(),
                        nomField.getText(),
                        card
                );

                JOptionPane.showMessageDialog(this,
                        "Réservation effectuée avec succès",
                        "Succès",
                        JOptionPane.INFORMATION_MESSAGE);

                dispose();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this,
                        ex.getMessage(),
                        "Erreur",
                        JOptionPane.ERROR_MESSAGE);
            }
        });

        annulerBtn.addActionListener(e -> dispose());

        JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        btnPanel.add(annulerBtn);
        btnPanel.add(reserverBtn);

        add(btnPanel, BorderLayout.SOUTH);
    }
}
