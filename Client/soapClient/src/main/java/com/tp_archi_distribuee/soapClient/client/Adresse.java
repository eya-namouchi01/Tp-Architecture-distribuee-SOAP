
package com.tp_archi_distribuee.soapClient.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour adresse complex type.</p>
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.</p>
 * 
 * <pre>
 * &lt;complexType name="adresse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gpsPosition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adresse", propOrder = {
    "cite",
    "gpsPosition",
    "pays",
    "rue"
})
public class Adresse {

    protected String cite;
    protected String gpsPosition;
    protected String pays;
    protected String rue;

    /**
     * Obtient la valeur de la propriété cite.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCite() {
        return cite;
    }

    /**
     * Définit la valeur de la propriété cite.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCite(String value) {
        this.cite = value;
    }

    /**
     * Obtient la valeur de la propriété gpsPosition.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGpsPosition() {
        return gpsPosition;
    }

    /**
     * Définit la valeur de la propriété gpsPosition.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGpsPosition(String value) {
        this.gpsPosition = value;
    }

    /**
     * Obtient la valeur de la propriété pays.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPays() {
        return pays;
    }

    /**
     * Définit la valeur de la propriété pays.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPays(String value) {
        this.pays = value;
    }

    /**
     * Obtient la valeur de la propriété rue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRue() {
        return rue;
    }

    /**
     * Définit la valeur de la propriété rue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRue(String value) {
        this.rue = value;
    }

}
