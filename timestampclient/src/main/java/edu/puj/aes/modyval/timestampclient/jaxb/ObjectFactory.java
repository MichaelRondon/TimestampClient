//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci�n de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.05.14 a las 11:09:37 PM COT 
//


package edu.puj.aes.modyval.timestampclient.jaxb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the edu.puj.aes.modyval.timestampclient.jaxb package. 
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

    private final static QName _Helloword_QNAME = new QName("", "helloword");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: edu.puj.aes.modyval.timestampclient.jaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Helloword }
     * 
     */
    public Helloword createHelloword() {
        return new Helloword();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Helloword }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "helloword")
    public JAXBElement<Helloword> createHelloword(Helloword value) {
        return new JAXBElement<Helloword>(_Helloword_QNAME, Helloword.class, null, value);
    }

}
