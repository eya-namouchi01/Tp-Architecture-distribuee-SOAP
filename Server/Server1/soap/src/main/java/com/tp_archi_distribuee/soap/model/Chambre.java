package com.tp_archi_distribuee.soap.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@AllArgsConstructor
public class Chambre {
    @Id
    private int id;
    @Getter
    @Setter
    private int nbLits;
    @Getter
    @Setter
    private double prix;
    @Getter
    @Setter
    private String img;

    @Override
    public String toString(){
        return "Chambre:\n"+ "Nombre de lits: "+ nbLits
                + "\nPrix: "+ prix
                + "\nImage: "+ img;
    }
}
