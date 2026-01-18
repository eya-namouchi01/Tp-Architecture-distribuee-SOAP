
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

    private static final QName _ConsulterDisponibilite_QNAME = new QName("http://service.soap.tp_archi_distribuee.com/", "consulterDisponibilite");
    private static final QName _ConsulterDisponibiliteResponse_QNAME = new QName("http://service.soap.tp_archi_distribuee.com/", "consulterDisponibiliteResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tp_archi_distribuee.soapClient.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsulterDisponibilite }
     * 
     */
    public ConsulterDisponibilite createConsulterDisponibilite() {
        return new ConsulterDisponibilite();
    }

    /**
     * Create an instance of {@link ConsulterDisponibiliteResponse }
     * 
     */
    public ConsulterDisponibiliteResponse createConsulterDisponibiliteResponse() {
        return new ConsulterDisponibiliteResponse();
    }

    /**
     * Create an instance of {@link Offre }
     * 
     */
    public Offre createOffre() {
        return new Offre();
    }

    /**
     * Create an instance of {@link Agence }
     * 
     */
    public Agence createAgence() {
        return new Agence();
    }

    /**
     * Create an instance of {@link Chambre }
     * 
     */
    public Chambre createChambre() {
        return new Chambre();
    }

    /**
     * Create an instance of {@link Hotel }
     * 
     */
    public Hotel createHotel() {
        return new Hotel();
    }

    /**
     * Create an instance of {@link Adresse }
     * 
     */
    public Adresse createAdresse() {
        return new Adresse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsulterDisponibilite }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsulterDisponibilite }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.soap.tp_archi_distribuee.com/", name = "consulterDisponibilite")
    public JAXBElement<ConsulterDisponibilite> createConsulterDisponibilite(ConsulterDisponibilite value) {
        return new JAXBElement<ConsulterDisponibilite>(_ConsulterDisponibilite_QNAME, ConsulterDisponibilite.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsulterDisponibiliteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsulterDisponibiliteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.soap.tp_archi_distribuee.com/", name = "consulterDisponibiliteResponse")
    public JAXBElement<ConsulterDisponibiliteResponse> createConsulterDisponibiliteResponse(ConsulterDisponibiliteResponse value) {
        return new JAXBElement<ConsulterDisponibiliteResponse>(_ConsulterDisponibiliteResponse_QNAME, ConsulterDisponibiliteResponse.class, null, value);
    }

}
