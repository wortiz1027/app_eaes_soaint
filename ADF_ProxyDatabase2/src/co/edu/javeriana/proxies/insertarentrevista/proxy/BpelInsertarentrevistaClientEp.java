
package co.edu.javeriana.proxies.insertarentrevista.proxy;

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
@WebServiceClient(name = "bpel_insertarentrevista_client_ep",
                  targetNamespace = "http://xmlns.oracle.com/app_eaes_soaint/SOA_Database_2/bpel_insertarentrevista",
                  wsdlLocation =
                  "http://bpm-dv1:7003/soa-infra/services/default/SOA_Database_2/bpel_insertarentrevista_client_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2Fapp_eaes_soaint%2FSOA_Database_2%2Fbpel_insertarentrevista%7Dbpel_insertarentrevista_client_ep")
@HandlerChain(file="Bpel_insertarentrevista_client_epProxy-HandlerChain.xml")
public class BpelInsertarentrevistaClientEp extends Service {

    private final static URL BPELINSERTARENTREVISTACLIENTEP_WSDL_LOCATION;
    private final static WebServiceException BPELINSERTARENTREVISTACLIENTEP_EXCEPTION;
    private final static QName BPELINSERTARENTREVISTACLIENTEP_QNAME =
        new QName("http://xmlns.oracle.com/app_eaes_soaint/SOA_Database_2/bpel_insertarentrevista",
                  "bpel_insertarentrevista_client_ep");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("http://bpm-dv1:7003/soa-infra/services/default/SOA_Database_2/bpel_insertarentrevista_client_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2Fapp_eaes_soaint%2FSOA_Database_2%2Fbpel_insertarentrevista%7Dbpel_insertarentrevista_client_ep");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BPELINSERTARENTREVISTACLIENTEP_WSDL_LOCATION = url;
        BPELINSERTARENTREVISTACLIENTEP_EXCEPTION = e;
    }

    public BpelInsertarentrevistaClientEp() {
        super(__getWsdlLocation(), BPELINSERTARENTREVISTACLIENTEP_QNAME);
    }

    public BpelInsertarentrevistaClientEp(WebServiceFeature... features) {
        super(__getWsdlLocation(), BPELINSERTARENTREVISTACLIENTEP_QNAME, features);
    }

    public BpelInsertarentrevistaClientEp(URL wsdlLocation) {
        super(wsdlLocation, BPELINSERTARENTREVISTACLIENTEP_QNAME);
    }

    public BpelInsertarentrevistaClientEp(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BPELINSERTARENTREVISTACLIENTEP_QNAME, features);
    }

    public BpelInsertarentrevistaClientEp(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BpelInsertarentrevistaClientEp(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns BpelInsertarentrevista
     */
    @WebEndpoint(name = "bpel_insertarentrevista_pt")
    public BpelInsertarentrevista getBpelInsertarentrevistaPt() {
        return super.getPort(new QName("http://xmlns.oracle.com/app_eaes_soaint/SOA_Database_2/bpel_insertarentrevista",
                                       "bpel_insertarentrevista_pt"), BpelInsertarentrevista.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BpelInsertarentrevista
     */
    @WebEndpoint(name = "bpel_insertarentrevista_pt")
    public BpelInsertarentrevista getBpelInsertarentrevistaPt(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.oracle.com/app_eaes_soaint/SOA_Database_2/bpel_insertarentrevista",
                                       "bpel_insertarentrevista_pt"), BpelInsertarentrevista.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BPELINSERTARENTREVISTACLIENTEP_EXCEPTION != null) {
            throw BPELINSERTARENTREVISTACLIENTEP_EXCEPTION;
        }
        return BPELINSERTARENTREVISTACLIENTEP_WSDL_LOCATION;
    }

}