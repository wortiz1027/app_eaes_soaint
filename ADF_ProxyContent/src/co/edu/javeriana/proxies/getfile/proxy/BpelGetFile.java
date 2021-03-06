
package co.edu.javeriana.proxies.getfile.proxy;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import javax.xml.bind.annotation.XmlSeeAlso;

import co.edu.javeriana.proxies.getfile.types.GetFileByID;
import co.edu.javeriana.proxies.getfile.types.GetFileByIDResponse;
import co.edu.javeriana.proxies.getfile.types.ObjectFactory;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0-b170214.1743
 * Generated source version: 2.2
 *
 */
@WebService(name = "bpel_GetFile", targetNamespace = "http://xmlns.oracle.com/app_eaes_soaint/SOA_Content/bpel_GetFile")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({ ObjectFactory.class })
public interface BpelGetFile {


    /**
     *
     * @param payload
     * @return
     *     returns co.edu.javeriana.proxies.getfile.types.GetFileByIDResponse
     */
    @WebMethod(action = "process")
    @WebResult(name = "output",
               targetNamespace = "http://xmlns.javeriana.edu.co/co/schemas/process/bpm/WCC_GetFile/v1.0",
               partName = "payload")
    public GetFileByIDResponse process(@WebParam(name = "input",
                                                 targetNamespace =
                                                 "http://xmlns.javeriana.edu.co/co/schemas/process/bpm/WCC_GetFile/v1.0",
                                                 partName = "payload") GetFileByID payload);

}
