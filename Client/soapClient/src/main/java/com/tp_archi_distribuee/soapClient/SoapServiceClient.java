package com.tp_archi_distribuee.soapClient;

import com.tp_archi_distribuee.soapClient.client.*;
import lombok.Getter;

import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class SoapServiceClient {
    @Getter
    private HotelServiceDisponibiliteInterface proxyDisponibilite;
    @Getter
    private HotelServiceReservationInterface proxyReservation;


    public SoapServiceClient() throws Exception {
        URL wsdlUrl1 = new URL("http://localhost:8081/Server_Oceania/Disponibilite?wsdl");
        HotelServiceDisponibiliteService serviceDisponibilite =
                new HotelServiceDisponibiliteService(wsdlUrl1);
        proxyDisponibilite = serviceDisponibilite.getHotelServiceDisponibilitePort();


        URL wsdlUrl2 = new URL("http://localhost:8081/Server_Oceania/Reservation?wsdl");
        HotelServiceReservationService serviceReservation =
                new HotelServiceReservationService(wsdlUrl2);
        proxyReservation = serviceReservation.getHotelServiceReservationPort();

    }

    public Object consulterDisponibilite(
            int agenceId,
            String login,
            String password,
            String dateDebut,
            String dateFin,
            int nbPersonnes
    ) throws Exception {

        XMLGregorianCalendar d1 = toXMLGregorianLocal(dateDebut);
        XMLGregorianCalendar d2 = toXMLGregorianLocal(dateFin);

        return proxyDisponibilite.consulterDisponibilite(
                agenceId, login, password, d1, d2, nbPersonnes
        );
    }

    private XMLGregorianCalendar toXMLGregorianLocal(String dateStr) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(sdf.parse(dateStr));

        return DatatypeFactory.newInstance().newXMLGregorianCalendarDate(
                gc.get(GregorianCalendar.YEAR),
                gc.get(GregorianCalendar.MONTH) + 1,
                gc.get(GregorianCalendar.DAY_OF_MONTH),
                DatatypeConstants.FIELD_UNDEFINED
        );
    }




    public String effectuerReservation(
            int offreId,
            int agenceId,
            String login,
            String password,
            String email,
            String nom,
            CreditCard creditCard
    ) {
        return proxyReservation.effectuerReservation(
                offreId,
                agenceId,
                login,
                password,
                email,
                nom,
                creditCard
        );
    }
}
