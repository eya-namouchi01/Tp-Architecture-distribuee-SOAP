package com.tp_archi_distribuee.soapClient;

import com.tp_archi_distribuee.soapClient.client.HotelServiceDisponibiliteInterface;
import com.tp_archi_distribuee.soapClient.client.HotelServiceDisponibiliteService;
import com.tp_archi_distribuee.soapClient.clientGUI.SoapClientGUI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

@SpringBootApplication(exclude = {
        org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration.class,
        org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration.class
})
public class SoapClientApplication {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                new SoapClientGUI().setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}