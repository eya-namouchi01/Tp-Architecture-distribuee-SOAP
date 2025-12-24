package com.tp_archi_distribuee.soap.service;

import com.tp_archi_distribuee.soap.model.Offre;
import javax.jws.WebMethod;
import javax.jws.WebService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebService
public interface HotelServiceDisponibiliteInterface {
    @WebMethod
    public List<Offre> consulterDisponibilite(int agenceId, String login, String motDePasse, Date dateDebut, Date dateFin, int nbrePersonne);
}