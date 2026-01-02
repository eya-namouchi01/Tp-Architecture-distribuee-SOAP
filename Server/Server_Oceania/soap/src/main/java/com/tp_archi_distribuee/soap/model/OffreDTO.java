package com.tp_archi_distribuee.soap.model;


import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.*;
import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OffreDTO")
@XmlRootElement
public class OffreDTO {

    @XmlElement
    @Getter
    @Setter

    private int id;

    @XmlElement
    @Getter
    @Setter
    private double prix;
    @Getter
    @Setter
    @XmlElement
    private int nbreLits;

    @XmlElement
    @Getter
    @Setter
    private Date dateDebutDisponibilte;

    @XmlElement
    @Getter
    @Setter
    private Date datefinDisponibilite;

    @XmlElement
    @Getter
    @Setter
    private String hotelNom;

    @XmlElement
    @Getter
    @Setter
    private int agenceId;

}