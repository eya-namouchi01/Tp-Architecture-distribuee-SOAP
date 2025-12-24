package com.tp_archi_distribuee.soap.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Client {
    @Id
    private int id;
    @Getter
    @Setter
    private String nom;
    @Getter
    @Setter
    private String prenom;
    @Getter
    @Setter
    private String telephone;
    @Getter
    @Setter
    private String mail;
   // private CreditCard creditCard;
}
