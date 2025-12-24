package com.tp_archi_distribuee.soap.model;

import javax.persistence.Entity;
import javax.persistence.Id;import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import java.util.Date;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Offre {
    @Id
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
    private int nbrelits;
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

    public Offre(String aganeceId, String agency_username, String agency_password, double prix, Date dateDebutDisponibilte, Date datefinDisponibilite, int nbrelits, Hotel hotel) {
        this.prix = prix;
        this.dateDebutDisponibilte = dateDebutDisponibilte;
        this.datefinDisponibilite = datefinDisponibilite;
        this.nbrelits = nbrelits;
        this.hotel = hotel;
    }


}
