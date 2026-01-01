
package com.tp_archi_distribuee.soapClient.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Classe Java pour categorie.</p>
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.</p>
 * <pre>
 * &lt;simpleType name="categorie"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="etoiles2"/&gt;
 *     &lt;enumeration value="etoiles3"/&gt;
 *     &lt;enumeration value="etoiles4"/&gt;
 *     &lt;enumeration value="etoiles5"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "categorie")
@XmlEnum
public enum Categorie {

    @XmlEnumValue("etoiles2")
    ETOILES_2("etoiles2"),
    @XmlEnumValue("etoiles3")
    ETOILES_3("etoiles3"),
    @XmlEnumValue("etoiles4")
    ETOILES_4("etoiles4"),
    @XmlEnumValue("etoiles5")
    ETOILES_5("etoiles5");
    private final String value;

    Categorie(String v) {
        value = v;
    }

    /**
     * Gets the value associated to the enum constant.
     * 
     * @return
     *     The value linked to the enum.
     */
    public String value() {
        return value;
    }

    /**
     * Gets the enum associated to the value passed as parameter.
     * 
     * @param v
     *     The value to get the enum from.
     * @return
     *     The enum which corresponds to the value, if it exists.
     * @throws IllegalArgumentException
     *     If no value matches in the enum declaration.
     */
    public static Categorie fromValue(String v) {
        for (Categorie c: Categorie.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
