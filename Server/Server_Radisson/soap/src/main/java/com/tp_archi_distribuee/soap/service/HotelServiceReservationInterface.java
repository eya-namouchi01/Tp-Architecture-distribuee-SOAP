package com.tp_archi_distribuee.soap.service;

import com.tp_archi_distribuee.soap.model.CreditCard;

import javax.jws.WebMethod;
import javax.jws.WebService;

import java.util.Date;

@WebService
public interface HotelServiceReservationInterface {
    @WebMethod
    public String effectuerReservation(int offreId, int agenceId, String login, String motDePasse,String email, String nom, CreditCard creditCard );
}
