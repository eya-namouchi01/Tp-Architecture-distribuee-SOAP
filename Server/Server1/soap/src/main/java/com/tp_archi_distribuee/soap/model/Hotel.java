package com.tp_archi_distribuee.soap.model;

import javax.persistence.Entity;
import javax.persistence.Id;import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.OneToOne;
import javax.persistence.OneToMany;

import javax.persistence.JoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Entity
public class Hotel {
    @Id
    @Getter
    private int id;
    @Getter
    @Setter
    private String nom;
    @OneToMany
    private List<Chambre> chambres = new ArrayList<>();
    @Getter
    @Setter
    @OneToOne
    @JoinColumn(name = "adresse_id")
    private Adresse adresse;
    @Getter
    @Setter
    private Categorie categorie;
    @Getter
    @Setter
    private int nbLits;

    public Hotel (String nom, Adresse adresse, Categorie categorie, int nbLits){
        this.nom= nom;
        this.adresse = adresse;
        this.categorie= categorie;
        this.nbLits=nbLits;
    }
    public ArrayList<Chambre> getChambre(){
        return (ArrayList<Chambre>) Collections.unmodifiableCollection(chambres);
    }


    public void ajouterChambre( Chambre chambre){
        chambres.add( chambre);
        System.out.println("Chambre ajoutee");
    }
    @Override
    public String toString() {
        return "Hotel:" +
                "\nNom='" + nom + '\'' +
                "\nCategorie=" + categorie +
                "\nAdresse=" + adresse +
                "\nNombre de chhambres=" + chambres;
    }

}
