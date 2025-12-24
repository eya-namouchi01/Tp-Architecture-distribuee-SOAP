package com.tp_archi_distribuee.soap.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Entity
public class Agence {
    @Id
    private int id;
    @Getter
    @Setter
    private String nom;
    @Getter
    @Setter
    private String login;
    @Getter
    @Setter
    private String motDePasse;



    public Agence(int agencyId, String nom, String login, String motDePasse) {
        this.id = agencyId;
        this.nom = nom;
        this.login = login;
        this.motDePasse = motDePasse;
    }
    public boolean authentifier(String login, String motDePasse) {
        return this.login.equals(login) && this.motDePasse.equals(motDePasse);
    }

}
