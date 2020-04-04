
package co.edu.javeriana.proxies.consultarprototipo.proxy;

import java.net.MalformedURLException;
import java.net.URL;

import javax.jws.HandlerChain;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0-b170214.1743
 * Generated source version: 2.2
 *
 */
@WebServiceClient(name = "bpel_consultarprototipo_client_ep",
                  targetNamespace = "http://xmlns.oracle.com/app_eaes_soaint/SOA_Database/bpel_consultarprototipo",
                  wsdlLocation =
                  "http://bpm-dv1:7003/soa-infra/services/default/SOA_Database/bpel_consultarprototipo_client_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2Fapp_eaes_soaint%2FSOA_Database%2Fbpel_consultarprototipo%7Dbpel_consultarprototipo_client_ep")
@HandlerChain(file="Bpel_consultarprototipo_client_epProxy-HandlerChain.xml")
public class BpelConsultarprototipoClientEp extends Service {

    private final static URL BPELCONSULTARPROTOTIPOCLIENTEP_WSDL_LOCATION;
    private final static WebServiceException BPELCONSULTARPROTOTIPOCLIENTEP_EXCEPTION;
    private final static QName BPELCONSULTARPROTOTIPOCLIENTEP_QNAME =
        new QName("http://xmlns.oracle.com/app_eaes_soaint/SOA_Database/bpel_consultarprototipo",
                  "bpel_consultarprototipo_client_ep");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("http://bpm-dv1:7003/soa-infra/services/default/SOA_Database/bpel_consultarprototipo_client_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2Fapp_eaes_soaint%2FSOA_Database%2Fbpel_consultarprototipo%7Dbpel_consultarprototipo_client_ep");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BPELCONSULTARPROTOTIPOCLIENTEP_WSDL_LOCATION = url;
        BPELCONSULTARPROTOTIPOCLIENTEP_EXCEPTION = e;
    }

    public BpelConsultarprototipoClientEp() {
        super(__getWsdlLocation(), BPELCONSULTARPROTOTIPOCLIENTEP_QNAME);
    }

    public BpelConsultarprototipoClientEp(WebServiceFeature... features) {
        super(__getWsdlLocation(), BPELCONSULTARPROTOTIPOCLIENTEP_QNAME, features);
    }

    public BpelConsultarprototipoClientEp(URL wsdlLocation) {
        super(wsdlLocation, BPELCONSULTARPROTOTIPOCLIENTEP_QNAME);
    }

    public BpelConsultarprototipoClientEp(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BPELCONSULTARPROTOTIPOCLIENTEP_QNAME, features);
    }

    public BpelConsultarprototipoClientEp(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BpelConsultarprototipoClientEp(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns BpelConsultarprototipo
     */
    @WebEndpoint(name = "bpel_consultarprototipo_pt")
    public BpelConsultarprototipo getBpelConsultarprototipoPt() {
        return super.getPort(new QName("http://xmlns.oracle.com/app_eaes_soaint/SOA_Database/bpel_consultarprototipo",
                                       "bpel_consultarprototipo_pt"), BpelConsultarprototipo.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BpelConsultarprototipo
     */
    @WebEndpoint(name = "bpel_consultarprototipo_pt")
    public BpelConsultarprototipo getBpelConsultarprototipoPt(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.oracle.com/app_eaes_soaint/SOA_Database/bpel_consultarprototipo",
                                       "bpel_consultarprototipo_pt"), BpelConsultarprototipo.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BPELCONSULTARPROTOTIPOCLIENTEP_EXCEPTION != null) {
            throw BPELCONSULTARPROTOTIPOCLIENTEP_EXCEPTION;
        }
        return BPELCONSULTARPROTOTIPOCLIENTEP_WSDL_LOCATION;
    }

}
