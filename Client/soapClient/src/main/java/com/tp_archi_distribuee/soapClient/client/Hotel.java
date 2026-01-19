
package com.tp_archi_distribuee.soapClient.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour hotel complex type.</p>
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.</p>
 * 
 * <pre>
 * &lt;complexType name="hotel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adresse" type="{http://service.soap.tp_archi_distribuee.com/}adresse" minOccurs="0"/&gt;
 *         &lt;element name="categorie" type="{http://service.soap.tp_archi_distribuee.com/}categorie" minOccurs="0"/&gt;
 *         &lt;element name="nbLits" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hotel", propOrder = {
    "adresse",
    "categorie",
    "nbLits",
    "nom"
})
public class Hotel {

    protected Adresse adresse;
    @XmlSchemaType(name = "string")
    protected Categorie categorie;
    protected int nbLits;
    protected String nom;

    /**
     * Obtient la valeur de la propriété adresse.
     * 
     * @return
     *     possible object is
     *     {@link Adresse }
     *     
     */
    public Adresse getAdresse() {
        return adresse;
    }

    /**
     * Définit la valeur de la propriété adresse.
     * 
     * @param value
     *     allowed object is
     *     {@link Adresse }
     *     
     */
    public void setAdresse(Adresse value) {
        this.adresse = value;
    }

    /**
     * Obtient la valeur de la propriété categorie.
     * 
     * @return
     *     possible object is
     *     {@link Categorie }
     *     
     */
    public Categorie getCategorie() {
        return categorie;
    }

    /**
     * Définit la valeur de la propriété categorie.
     * 
     * @param value
     *     allowed object is
     *     {@link Categorie }
     *     
     */
    public void setCategorie(Categorie value) {
        this.categorie = value;
    }

    /**
     * Obtient la valeur de la propriété nbLits.
     * 
     */
    public int getNbLits() {
        return nbLits;
    }

    /**
     * Définit la valeur de la propriété nbLits.
     * 
     */
    public void setNbLits(int value) {
        this.nbLits = value;
    }

    /**
     * Obtient la valeur de la propriété nom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNom() {
        return nom;
    }

    /**
     * Définit la valeur de la propriété nom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNom(String value) {
        this.nom = value;
    }

}
