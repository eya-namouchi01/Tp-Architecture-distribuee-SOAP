package com.tp_archi_distribuee.soap.service;

import com.tp_archi_distribuee.soap.model.Offre;
import com.tp_archi_distribuee.soap.model.Reservation;
import com.tp_archi_distribuee.soap.repository.OffreRepository;
import com.tp_archi_distribuee.soap.repository.ReservationRepository;
import javax.jws.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@WebService(endpointInterface="com.tp_archi_distribuee.soap.service.HotelServiceReservation")
public class HotelServiceReservation implements HotelServiceReservationInterface{
    @Autowired
    private OffreRepository offreRepo;
    @Autowired
    private ReservationRepository reservartionRepo;

    public String effectuerReservation(int offreId, int agenceId, String login, String motDePasse)

    {
        Offre offre= offreRepo.getById(offreId);
        Reservation reservation= new Reservation (offre.getHotel().getId(),
                offre,
                offre.getDateDebutDisponibilte(),
                offre.getDatefinDisponibilite());
        reservartionRepo.save(reservation);

        return null;
    }

}
