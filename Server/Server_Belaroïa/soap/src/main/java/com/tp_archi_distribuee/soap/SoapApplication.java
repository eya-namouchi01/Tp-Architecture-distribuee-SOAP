package com.tp_archi_distribuee.soap;

import com.tp_archi_distribuee.soap.service.HotelServiceDisponibilite;
import com.tp_archi_distribuee.soap.service.HotelServiceReservation;
import com.tp_archi_distribuee.soap.service.HotelServiceReservationInterface;
//import jakarta.xml.ws.Endpoint;
import javax.xml.ws.Endpoint;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;




@SpringBootApplication(
        scanBasePackages = {
"com.tp_archi_distribuee.soap.exception",
"com.tp_archi_distribuee.soap.model",
"com.tp_archi_distribuee.soap.repository",
"com.tp_archi_distribuee.soap.service"
})

public class SoapApplication {

    public static void main(String[] args)
        throws ClassNotFoundException {
            String SERVICE1_URI =
                    "http://localhost:8082/Server_Belaroia/Disponibilite";
            String SERVICE2_URI =
                    "http://localhost:8082/Server_Belaroia/Reservation";
            var context = SpringApplication.run(SoapApplication.class, args);

        HotelServiceDisponibilite hotelserviceDisponibilite = context.getBean(HotelServiceDisponibilite.class);
            // Publication du service web
        Endpoint.publish(SERVICE1_URI, hotelserviceDisponibilite);
            System.err.println("Web Service 1 successfully published at: " +
                    SERVICE1_URI);
        HotelServiceReservation hotelServiceReservation = context.getBean(HotelServiceReservation.class);

            Endpoint.publish(SERVICE2_URI,hotelServiceReservation);
            System.err.println("Web Service 2 successfully published at: " +
                    SERVICE2_URI);

            System.err.println("Server IS ready!");
		//SpringApplication.run(SoapApplication.class, args);
	}

}
