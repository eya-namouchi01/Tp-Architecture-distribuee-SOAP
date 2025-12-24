package com.tp_archi_distribuee.soap.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
@AllArgsConstructor
public class Reservation {
    @Id
    private int id;
    @Getter
    @Setter
    @OneToOne
    @JoinColumn(name = "offre_id")
    private Offre offre;
    @Getter
    @Setter
    private Date dateEntree;
    @Getter
    @Setter
    private Date dateSortie;

}
