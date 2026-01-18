package com.tp_archi_distribuee.soap.service;

import com.tp_archi_distribuee.soap.exception.ClientException;
import com.tp_archi_distribuee.soap.exception.InvalidAgenceException;
import com.tp_archi_distribuee.soap.exception.OffreException;
import com.tp_archi_distribuee.soap.model.*;
import com.tp_archi_distribuee.soap.repository.AgenceRepository;
import com.tp_archi_distribuee.soap.repository.ClientRepository;
import com.tp_archi_distribuee.soap.repository.OffreRepository;
import com.tp_archi_distribuee.soap.repository.ReservationRepository;
import javax.jws.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@WebService(endpointInterface="com.tp_archi_distribuee.soap.service.HotelServiceReservationInterface")
public class HotelServiceReservation implements HotelServiceReservationInterface{
    @Autowired
    private OffreRepository offreRepo;
    @Autowired
    private ReservationRepository reservartionRepo;
    @Autowired
    private AgenceRepository agenceRepo;
    @Autowired
    private ClientRepository clientRepo;

    public String effectuerReservation(int offreId, int agenceId, String login, String motDePasse,String email, String nom, CreditCard creditCard )

    {
        Offre offre= offreRepo.findById(offreId)
                .orElseThrow(() -> new OffreException("Aucune offre dont cet identifiant n'est disponible"));
        Agence agence = agenceRepo.findById(agenceId)
                .filter(a -> a.authentifier(login, motDePasse))
                .orElseThrow(() -> new InvalidAgenceException("Les identifiants de l’agence sont incorrects."));


        Client client = clientRepo.findByEmail(email)
                .orElseThrow(() -> new ClientException("Vos identifiants sont incorrects."));
        if (
                !client.getCreditCard().getDateExpiration().equals(creditCard.getDateExpiration()) ||
                        !client.getCreditCard().getCvv().equals(creditCard.getCvv()) ||
                        !client.getCreditCard().getNumCarte().equals(creditCard.getNumCarte())
        ) {
            throw new ClientException("Vos identifiants sont incorrects.");
        }


        Reservation reservation= new Reservation (offre.getHotel().getId(),
                offre,
                offre.getDateDebutDisponibilte(),
                offre.getDatefinDisponibilite(),
                client);
        reservartionRepo.save(reservation);
        return null;
    }

}
