
package com.tp_archi_distribuee.soapClient.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour creditCard complex type.</p>
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.</p>
 * 
 * <pre>
 * &lt;complexType name="creditCard"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cvv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateExpiration" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="numCarte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creditCard", propOrder = {
    "cvv",
    "dateExpiration",
    "numCarte"
})
public class CreditCard {

    protected String cvv;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateExpiration;
    protected String numCarte;

    /**
     * Obtient la valeur de la propriété cvv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvv() {
        return cvv;
    }

    /**
     * Définit la valeur de la propriété cvv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvv(String value) {
        this.cvv = value;
    }

    /**
     * Obtient la valeur de la propriété dateExpiration.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateExpiration() {
        return dateExpiration;
    }

    /**
     * Définit la valeur de la propriété dateExpiration.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateExpiration(XMLGregorianCalendar value) {
        this.dateExpiration = value;
    }

    /**
     * Obtient la valeur de la propriété numCarte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumCarte() {
        return numCarte;
    }

    /**
     * Définit la valeur de la propriété numCarte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumCarte(String value) {
        this.numCarte = value;
    }

}
