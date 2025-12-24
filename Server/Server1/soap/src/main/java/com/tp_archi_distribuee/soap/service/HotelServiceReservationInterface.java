package com.tp_archi_distribuee.soap.service;


import javax.jws.WebMethod;
import javax.jws.WebService;

import java.util.Date;

@WebService
public interface HotelServiceReservationInterface {
    @WebMethod
    public String effectuerReservation(int offerId, int agenceId, String login, String motDePasse );
}
