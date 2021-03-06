
package co.edu.javeriana.proxies.consultarcandidatos.proxy;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import javax.xml.bind.annotation.XmlSeeAlso;

import co.edu.javeriana.proxies.consultarcandidatos.types.CandidatosType;
import co.edu.javeriana.proxies.consultarcandidatos.types.GenericoType;
import co.edu.javeriana.proxies.consultarcandidatos.types.ObjectFactory;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0-b170214.1743
 * Generated source version: 2.2
 *
 */
@WebService(name = "bpel_consultacandidatos",
            targetNamespace = "http://xmlns.oracle.com/app_eaes_soaint/SOA_Database_2/bpel_consultacandidatos")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({ ObjectFactory.class })
public interface BpelConsultacandidatos {


    /**
     *
     * @param payload
     * @return
     *     returns co.edu.javeriana.proxies.consultarcandidatos.types.CandidatosType
     */
    @WebMethod(action = "process")
    @WebResult(name = "Candidatos",
               targetNamespace = "http://xmlns.javeriana.edu.co/co/schemas/process/bpm/ConsultarCandidatos/v1.0",
               partName = "payload")
    public CandidatosType process(@WebParam(name = "Generico",
                                            targetNamespace =
                                            "http://xmlns.javeriana.edu.co/co/schemas/process/bpm/ConsultarCandidatos/v1.0",
                                            partName = "payload") GenericoType payload);

}
