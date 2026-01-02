package com.tp_archi_distribuee.soap.service;

import com.tp_archi_distribuee.soap.model.Offre;
import com.tp_archi_distribuee.soap.model.OffreDTO;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.datatype.XMLGregorianCalendar;

import java.util.ArrayList;
import java.util.List;

@WebService
public interface HotelServiceDisponibiliteInterface {
    @WebMethod
    public ArrayList<Offre> consulterDisponibilite(int agenceId, String login, String motDePasse, XMLGregorianCalendar dateDebut, XMLGregorianCalendar dateFin, int nbrePersonne);
}