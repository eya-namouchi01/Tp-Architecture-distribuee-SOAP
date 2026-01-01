
package com.tp_archi_distribuee.soapClient.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tp_archi_distribuee.soapClient.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _EffectuerReservation_QNAME = new QName("http://service.soap.tp_archi_distribuee.com/", "effectuerReservation");
    private static final QName _EffectuerReservationResponse_QNAME = new QName("http://service.soap.tp_archi_distribuee.com/", "effectuerReservationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tp_archi_distribuee.soapClient.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EffectuerReservation }
     * 
     */
    public EffectuerReservation createEffectuerReservation() {
        return new EffectuerReservation();
    }

    /**
     * Create an instance of {@link EffectuerReservationResponse }
     * 
     */
    public EffectuerReservationResponse createEffectuerReservationResponse() {
        return new EffectuerReservationResponse();
    }

    /**
     * Create an instance of {@link CreditCard }
     * 
     */
    public CreditCard createCreditCard() {
        return new CreditCard();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EffectuerReservation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EffectuerReservation }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.soap.tp_archi_distribuee.com/", name = "effectuerReservation")
    public JAXBElement<EffectuerReservation> createEffectuerReservation(EffectuerReservation value) {
        return new JAXBElement<EffectuerReservation>(_EffectuerReservation_QNAME, EffectuerReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EffectuerReservationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EffectuerReservationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.soap.tp_archi_distribuee.com/", name = "effectuerReservationResponse")
    public JAXBElement<EffectuerReservationResponse> createEffectuerReservationResponse(EffectuerReservationResponse value) {
        return new JAXBElement<EffectuerReservationResponse>(_EffectuerReservationResponse_QNAME, EffectuerReservationResponse.class, null, value);
    }

}
