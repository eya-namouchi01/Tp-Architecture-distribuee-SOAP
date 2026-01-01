
package com.tp_archi_distribuee.soapClient.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour consulterDisponibilite complex type.</p>
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.</p>
 * 
 * <pre>
 * &lt;complexType name="consulterDisponibilite"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arg0" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="arg1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="arg2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="arg3" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/&gt;
 *         &lt;element name="arg4" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/&gt;
 *         &lt;element name="arg5" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consulterDisponibilite", propOrder = {
    "arg0",
    "arg1",
    "arg2",
    "arg3",
    "arg4",
    "arg5"
})
public class ConsulterDisponibilite {

    protected int arg0;
    protected String arg1;
    protected String arg2;
    protected Object arg3;
    protected Object arg4;
    protected int arg5;

    /**
     * Obtient la valeur de la propriété arg0.
     * 
     */
    public int getArg0() {
        return arg0;
    }

    /**
     * Définit la valeur de la propriété arg0.
     * 
     */
    public void setArg0(int value) {
        this.arg0 = value;
    }

    /**
     * Obtient la valeur de la propriété arg1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArg1() {
        return arg1;
    }

    /**
     * Définit la valeur de la propriété arg1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArg1(String value) {
        this.arg1 = value;
    }

    /**
     * Obtient la valeur de la propriété arg2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArg2() {
        return arg2;
    }

    /**
     * Définit la valeur de la propriété arg2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArg2(String value) {
        this.arg2 = value;
    }

    /**
     * Obtient la valeur de la propriété arg3.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getArg3() {
        return arg3;
    }

    /**
     * Définit la valeur de la propriété arg3.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setArg3(Object value) {
        this.arg3 = value;
    }

    /**
     * Obtient la valeur de la propriété arg4.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getArg4() {
        return arg4;
    }

    /**
     * Définit la valeur de la propriété arg4.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setArg4(Object value) {
        this.arg4 = value;
    }

    /**
     * Obtient la valeur de la propriété arg5.
     * 
     */
    public int getArg5() {
        return arg5;
    }

    /**
     * Définit la valeur de la propriété arg5.
     * 
     */
    public void setArg5(int value) {
        this.arg5 = value;
    }

}
