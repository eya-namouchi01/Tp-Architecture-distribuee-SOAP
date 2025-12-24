package com.tp_archi_distribuee.soap.service;

import com.tp_archi_distribuee.soap.exception.InvalidAgenceException;
import com.tp_archi_distribuee.soap.exception.LitException;
import com.tp_archi_distribuee.soap.exception.OffreException;
import com.tp_archi_distribuee.soap.model.Hotel;
import com.tp_archi_distribuee.soap.model.Offre;
import com.tp_archi_distribuee.soap.repository.AgenceRepository;
import com.tp_archi_distribuee.soap.repository.HotelRepository;
import com.tp_archi_distribuee.soap.repository.OffreRepository;
import javax.jws.WebMethod;
import javax.jws.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;


@Service
@WebService(endpointInterface="com.tp_archi_distribuee.soap.service.HotelServiceDisponibilite")
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
    public ArrayList<Offre> consulterDisponibilite(int agenceId, String login, String motDePasse, Date dateDebut, Date dateFin, int nbrePersonne)
    {
        ArrayList<Offre>offres= offresPresentes;
        if (((((agenceId != 1) && agenceId != 2)) && agenceId != 3)) {
            throw new InvalidAgenceException("Invalid credentials provided for the agency.");
        }
        if (offresPresentes.isEmpty()) {
            throw new OffreException("No available offers for the specified date range and number of persons.");
        }
        for (Offre offre : offresPresentes) {
            if (dateDebut.before(offre.getDateDebutDisponibilte()) && dateFin.after(offre.getDatefinDisponibilite())) {
                offres.remove(offre);
                throw new OffreException("No available offers for the specified date range");
            }

            if (nbrePersonne <= 0 || nbrePersonne > offre.getChambre().getNbLits()) {
                offres.remove(offre);
                throw new OffreException("Number of persons must be greater than zero or lower than number of Beds. ");
            }
        }
        return offres;
    }
}




