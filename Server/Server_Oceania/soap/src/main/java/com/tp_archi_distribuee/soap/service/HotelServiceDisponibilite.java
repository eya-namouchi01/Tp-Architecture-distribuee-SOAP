package com.tp_archi_distribuee.soap.service;

import com.tp_archi_distribuee.soap.exception.InvalidAgenceException;
import com.tp_archi_distribuee.soap.exception.OffreException;
import com.tp_archi_distribuee.soap.model.Agence;
import com.tp_archi_distribuee.soap.model.Offre;
import com.tp_archi_distribuee.soap.repository.AgenceRepository;
import com.tp_archi_distribuee.soap.repository.HotelRepository;
import com.tp_archi_distribuee.soap.repository.OffreRepository;

import javax.jws.WebService;
import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;


@Service
@WebService(endpointInterface="com.tp_archi_distribuee.soap.service.HotelServiceDisponibiliteInterface")
public class HotelServiceDisponibilite implements HotelServiceDisponibiliteInterface {
    private HotelRepository hotelRepo;
    @Autowired
    private OffreRepository offreRepo;
    @Autowired
    private AgenceRepository agenceRepo;
    private ArrayList<Offre> offresPresentes= new ArrayList<>();

  /*  public HotelServiceDisponibilite( int idHotel){
        offresPresentes= offreRepo.findByHotelId(idHotel);
    }*/
    public void loadOffres(int idHotel) {
        offresPresentes = offreRepo.findByHotelId(idHotel);
    }
    public ArrayList<Offre> consulterDisponibilite(int agenceId, String login, String motDePasse, XMLGregorianCalendar dateDebutXML, XMLGregorianCalendar  dateFinXML, int nbrePersonne)
    {
        Date dateDebut = dateDebutXML.toGregorianCalendar().getTime();
        Date dateFin = dateFinXML.toGregorianCalendar().getTime();
        ArrayList<Offre>offres= offresPresentes;

        Agence agence = agenceRepo.findById(agenceId)
                .filter(a -> a.authentifier(login, motDePasse))
                .orElseThrow(() -> new InvalidAgenceException("Les identifiants de l’agence sont incorrects."));


        if (offresPresentes.isEmpty()) {
            throw new OffreException("Aucune offre n’est disponible pour la période et le nombre de personnes indiqués.");
        }

        for (Offre offre : offresPresentes) {
            if (nbrePersonne <= 0 ) {
                offres.remove(offre);
                throw new OffreException("Le nombre de personnes doit être supérieur à zéro.");
            }

            if (dateDebut.before(offre.getDateDebutDisponibilte()) && dateFin.after(offre.getDatefinDisponibilite())) {
                offres.remove(offre);
                throw new OffreException("Aucune offre n’est disponible pour la période sélectionnée.");
            }

            if (nbrePersonne > offre.getNbreLits()){
                offres.remove(offre);
                if (offres.isEmpty()) throw new OffreException("Nombre de personnes élevé. Aucune offre n’est disponible pour ce nombre.");
            }
        }
        return offres;
    }
}




