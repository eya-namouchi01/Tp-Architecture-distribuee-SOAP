
package com.tp_archi_distribuee.soapClient.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour offre complex type.</p>
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.</p>
 * 
 * <pre>
 * &lt;complexType name="offre"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="agence" type="{http://service.soap.tp_archi_distribuee.com/}agence" minOccurs="0"/&gt;
 *         &lt;element name="chambre" type="{http://service.soap.tp_archi_distribuee.com/}chambre" minOccurs="0"/&gt;
 *         &lt;element name="dateDebutDisponibilte" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="datefinDisponibilite" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="hotel" type="{http://service.soap.tp_archi_distribuee.com/}hotel" minOccurs="0"/&gt;
 *         &lt;element name="nbreLits" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="prix" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "offre", propOrder = {
    "agence",
    "chambre",
    "dateDebutDisponibilte",
    "datefinDisponibilite",
    "hotel",
    "nbreLits",
    "prix"
})
public class Offre {

    protected Agence agence;
    protected Chambre chambre;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateDebutDisponibilte;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datefinDisponibilite;
    protected Hotel hotel;
    protected int nbreLits;
    protected double prix;

    /**
     * Obtient la valeur de la propriété agence.
     * 
     * @return
     *     possible object is
     *     {@link Agence }
     *     
     */
    public Agence getAgence() {
        return agence;
    }

    /**
     * Définit la valeur de la propriété agence.
     * 
     * @param value
     *     allowed object is
     *     {@link Agence }
     *     
     */
    public void setAgence(Agence value) {
        this.agence = value;
    }

    /**
     * Obtient la valeur de la propriété chambre.
     * 
     * @return
     *     possible object is
     *     {@link Chambre }
     *     
     */
    public Chambre getChambre() {
        return chambre;
    }

    /**
     * Définit la valeur de la propriété chambre.
     * 
     * @param value
     *     allowed object is
     *     {@link Chambre }
     *     
     */
    public void setChambre(Chambre value) {
        this.chambre = value;
    }

    /**
     * Obtient la valeur de la propriété dateDebutDisponibilte.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateDebutDisponibilte() {
        return dateDebutDisponibilte;
    }

    /**
     * Définit la valeur de la propriété dateDebutDisponibilte.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateDebutDisponibilte(XMLGregorianCalendar value) {
        this.dateDebutDisponibilte = value;
    }

    /**
     * Obtient la valeur de la propriété datefinDisponibilite.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatefinDisponibilite() {
        return datefinDisponibilite;
    }

    /**
     * Définit la valeur de la propriété datefinDisponibilite.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatefinDisponibilite(XMLGregorianCalendar value) {
        this.datefinDisponibilite = value;
    }

    /**
     * Obtient la valeur de la propriété hotel.
     * 
     * @return
     *     possible object is
     *     {@link Hotel }
     *     
     */
    public Hotel getHotel() {
        return hotel;
    }

    /**
     * Définit la valeur de la propriété hotel.
     * 
     * @param value
     *     allowed object is
     *     {@link Hotel }
     *     
     */
    public void setHotel(Hotel value) {
        this.hotel = value;
    }

    /**
     * Obtient la valeur de la propriété nbreLits.
     * 
     */
    public int getNbreLits() {
        return nbreLits;
    }

    /**
     * Définit la valeur de la propriété nbreLits.
     * 
     */
    public void setNbreLits(int value) {
        this.nbreLits = value;
    }

    /**
     * Obtient la valeur de la propriété prix.
     * 
     */
    public double getPrix() {
        return prix;
    }

    /**
     * Définit la valeur de la propriété prix.
     * 
     */
    public void setPrix(double value) {
        this.prix = value;
    }

}
