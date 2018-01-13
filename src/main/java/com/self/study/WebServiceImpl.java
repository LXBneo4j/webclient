
package com.self.study;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WebServiceImpl", targetNamespace = "http://study.self.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WebServiceImpl {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "say", targetNamespace = "http://study.self.com/", className = "com.self.study.Say")
    @ResponseWrapper(localName = "sayResponse", targetNamespace = "http://study.self.com/", className = "com.self.study.SayResponse")
    @Action(input = "http://study.self.com/WebServiceImpl/sayRequest", output = "http://study.self.com/WebServiceImpl/sayResponse")
    public String say(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
