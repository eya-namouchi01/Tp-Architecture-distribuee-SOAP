package com.tp_archi_distribuee.soap.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@AllArgsConstructor
@Entity
public class Adresse {
    @Id
    @Getter
    private int id;
    @Getter
    @Setter
    private String pays ;
    @Getter
    @Setter
    private String cite;
    @Getter
    @Setter
    private String rue;
    @Getter
    @Setter
    private String gpsPosition;

 @Override
    public String toString(){
        return "Adresse:\n"+ "pays: "+ pays
                + "\ncite: "+ cite
                + "\nRue: "+ rue
                + "\nGPS Position: "+ gpsPosition;
    }
}
