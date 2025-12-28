package com.tp_archi_distribuee.soap.model;

import javax.persistence.*;

import lombok.*;
import lombok.AllArgsConstructor;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Offre {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Getter
    @Setter
    private double prix;
    @Getter
    @Setter
    private Date dateDebutDisponibilte;
    @Getter
    @Setter
    private Date datefinDisponibilite;
    @Getter
    @Setter
    private int nbreLits;
    @Getter
    @Setter
    @OneToOne
    @JoinColumn(name = "hotel_id")
    private Hotel hotel ;
    @Getter
    @Setter
    @OneToOne
    @JoinColumn(name = "chambre_id")
    private Chambre chambre ;
    @Getter
    @Setter
    @OneToOne
    @JoinColumn(name = "agence_id")
    private Agence agence;

    public Offre(String aganeceId, String agency_username, String agency_password, double prix, Date dateDebutDisponibilte, Date datefinDisponibilite, int nbreLits, Hotel hotel) {
        this.prix = prix;
        this.dateDebutDisponibilte = dateDebutDisponibilte;
        this.datefinDisponibilite = datefinDisponibilite;
        this.nbreLits = nbreLits;
        this.hotel = hotel;
    }


}
