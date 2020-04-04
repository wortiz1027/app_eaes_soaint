package co.edu.javeriana.facade;

import co.edu.javeriana.proxies.consultarcandidatos.proxy.BpelConsultacandidatos;
import co.edu.javeriana.proxies.consultarcandidatos.proxy.BpelConsultacandidatosClientEp;
import co.edu.javeriana.proxies.consultarrecomendaciones.proxy.BpelConsprotrecomendaciones;
import co.edu.javeriana.proxies.consultarrecomendaciones.proxy.BpelConsprotrecomendacionesClientEp;
import co.edu.javeriana.proxies.insertarentrevista.proxy.BpelInsertarentrevista;
import co.edu.javeriana.proxies.insertarentrevista.proxy.BpelInsertarentrevistaClientEp;
import co.edu.javeriana.proxies.updateentrevista.proxy.BpelUpdateobsentrevista;
import co.edu.javeriana.proxies.updateentrevista.proxy.BpelUpdateobsentrevistaClientEp;
import co.edu.javeriana.proxies.updateestadoentrevista.proxy.BpelUpdateobsestentrevista;
import co.edu.javeriana.proxies.updateestadoentrevista.proxy.BpelUpdateobsestentrevistaClientEp;

import javax.xml.ws.BindingProvider;

public class FacadeDatabase2 {
    
    private static final String WSDL_INSERTAR_ENTREVISTA        = "http://bpm-dv1:7003/soa-infra/services/default/SOA_Database_2/bpel_insertarentrevista_client_ep?WSDL";
    private static final String WSDL_CONSULTAR_CANDIDATOS       = "http://bpm-dv1:7003/soa-infra/services/default/SOA_Database_2/bpel_consultacandidatos_client_ep?WSDL";
    private static final String WSDL_CONSULTAR_RECOMENDACIONES  = "http://bpm-dv1:7003/soa-infra/services/default/SOA_Database_2/bpel_consprotrecomendaciones_client_ep?WSDL";
    private static final String WSDL_ACTUALIZAR_ENTREVISTA      = "http://bpm-dv1:7003/soa-infra/services/default/SOA_Database_2/bpel_updateobsestentrevista_client_ep?WSDL";
    private static final String WSDL_ACTUALIZAR_EST_ENTREVISTA  = "http://bpm-dv1:7003/soa-infra/services/default/SOA_Database_2/bpel_updateobsentrevista_client_ep?WSDL";
    
    private static BpelInsertarentrevistaClientEp service1;
    private static BpelInsertarentrevista port1;
    
    private static BpelConsultacandidatosClientEp service2;
    private static BpelConsultacandidatos port2;
    
    private static BpelConsprotrecomendacionesClientEp service3;
    private static BpelConsprotrecomendaciones port3;
    
    private static BpelUpdateobsentrevistaClientEp service4;
    private static BpelUpdateobsentrevista port4;
    
    private static BpelUpdateobsestentrevistaClientEp service5;
    private static BpelUpdateobsestentrevista port5;
    
    
    
    public FacadeDatabase2() {
    }
    
    public static BpelInsertarentrevistaClientEp getServiceInsertarEntrevista() {
        if (service1 == null) {
            service1 = new BpelInsertarentrevistaClientEp();
        }
        
        return service1;
    }
    
    public static BpelInsertarentrevista getPortInsertarEntrevista() {
        try {
            if (port1 == null) {
                port1 = getServiceInsertarEntrevista().getBpelInsertarentrevistaPt();
                ((BindingProvider) port1).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, WSDL_INSERTAR_ENTREVISTA);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return port1;
    }
    
    public static BpelConsultacandidatosClientEp getServiceConsultarCandidatos() {
        if (service2 == null) {
            service2 = new BpelConsultacandidatosClientEp();
        }
        
        return service2;
    }
    
    public static BpelConsultacandidatos getPortInsertarColaborador() {
        try {
            if (port2 == null) {
                port2 = getServiceConsultarCandidatos().getBpelConsultacandidatosPt();
                ((BindingProvider) port2).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, WSDL_CONSULTAR_CANDIDATOS);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return port2;
    }
    
    public static BpelConsprotrecomendacionesClientEp getServiceConsultarRecomendaciones() {
        if (service3 == null) {
            service3 = new BpelConsprotrecomendacionesClientEp();
        }
        
        return service3;
    }
    
    public static BpelConsprotrecomendaciones getPortConsultarPrototipo() {
        try {
            if (port3 == null) {
                port3 = getServiceConsultarRecomendaciones().getBpelConsprotrecomendacionesPt();
                ((BindingProvider) port3).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, WSDL_CONSULTAR_RECOMENDACIONES);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return port3;
    }
    
    public static BpelUpdateobsentrevistaClientEp getServiceActualizarEntrevista() {
        if (service4 == null) {
            service4 = new BpelUpdateobsentrevistaClientEp();
        }
        
        return service4;
    }
    
    public static BpelUpdateobsentrevista getPortConsultarDocumento() {
        try {
            if (port4 == null) {
                port4 = getServiceActualizarEntrevista().getBpelUpdateobsentrevistaPt();
                ((BindingProvider) port4).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, WSDL_ACTUALIZAR_ENTREVISTA);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return port4;
    }
    
    public static BpelUpdateobsestentrevistaClientEp getServiceActualizarEstadoEntrevista() {
        if (service5 == null) {
            service5 = new BpelUpdateobsestentrevistaClientEp();
        }
        
        return service5;
    }
    
    public static BpelUpdateobsestentrevista getPortActualizarEstadoEntrevista() {
        try {
            if (port5 == null) {
                port5 = getServiceActualizarEstadoEntrevista().getBpelUpdateobsestentrevistaPt();
                ((BindingProvider) port5).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, WSDL_ACTUALIZAR_EST_ENTREVISTA);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return port5;
    }
    
}
