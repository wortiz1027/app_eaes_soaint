
package co.edu.javeriana.proxies.insertarcolaborador.proxy;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import javax.xml.bind.annotation.XmlSeeAlso;

import co.edu.javeriana.proxies.insertarcolaborador.types.InsertarColaboradorType;
import co.edu.javeriana.proxies.insertarcolaborador.types.ObjectFactory;
import co.edu.javeriana.proxies.insertarcolaborador.types.ResponseType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0-b170214.1743
 * Generated source version: 2.2
 *
 */
@WebService(name = "bpel_inscolaborador",
            targetNamespace = "http://xmlns.oracle.com/app_eaes_soaint/SOA_Database/bpel_inscolaborador")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({ ObjectFactory.class })
public interface BpelInscolaborador {


    /**
     *
     * @param payload
     * @return
     *     returns co.edu.javeriana.proxies.insertarcolaborador.types.ResponseType
     */
    @WebMethod(action = "process")
    @WebResult(name = "response",
               targetNamespace = "http://xmlns.javeriana.edu.co/co/schemas/process/bpm/InsertarColaborador/v1.0",
               partName = "payload")
    public ResponseType process(@WebParam(name = "request",
                                          targetNamespace =
                                          "http://xmlns.javeriana.edu.co/co/schemas/process/bpm/InsertarColaborador/v1.0",
                                          partName = "payload") InsertarColaboradorType payload);

}
