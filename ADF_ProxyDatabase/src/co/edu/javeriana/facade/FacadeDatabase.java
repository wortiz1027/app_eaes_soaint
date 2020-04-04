package co.edu.javeriana.facade;

import co.edu.javeriana.proxies.consultardocumento.proxy.BpelConsultardocumento;
import co.edu.javeriana.proxies.consultardocumento.proxy.BpelConsultardocumentoClientEp;
import co.edu.javeriana.proxies.consultarprototipo.proxy.BpelConsultarprototipo;
import co.edu.javeriana.proxies.consultarprototipo.proxy.BpelConsultarprototipoClientEp;
import co.edu.javeriana.proxies.insertarcolaborador.proxy.BpelInscolaborador;
import co.edu.javeriana.proxies.insertarcolaborador.proxy.BpelInscolaboradorClientEp;
import co.edu.javeriana.proxies.insertarprototipo.proxy.BpelInsertarprototipo;
import co.edu.javeriana.proxies.insertarprototipo.proxy.BpelInsertarprototipoClientEp;

import javax.xml.ws.BindingProvider;

import oracle.adf.share.logging.ADFLogger;

public class FacadeDatabase {
    public static final ADFLogger LOGGER = ADFLogger.createADFLogger(FacadeDatabase.class);
    
    private static final String WSDL_INSERTAR_PROTOTIPO   = "http://bpm-dv1:7003/soa-infra/services/default/SOA_Database/bpel_insertarprototipo_client_ep?WSDL";
    private static final String WSDL_INSERTAR_COLABORADOR = "http://bpm-dv1:7003/soa-infra/services/default/SOA_Database/bpel_inscolaborador_client_ep?WSDL";
    private static final String WSDL_CONSULTAR_PROTOTIPO  = "http://bpm-dv1:7003/soa-infra/services/default/SOA_Database/bpel_consultarprototipo_client_ep?WSDL";
    private static final String WSDL_CONSULTAR_DOCUMENTO  = "http://bpm-dv1:7003/soa-infra/services/default/SOA_Database/bpel_consultardocumento_client_ep?WSDL";
    
    private static BpelInsertarprototipoClientEp service1;
    private static BpelInsertarprototipo port1;
        
    private static BpelInscolaboradorClientEp service2;
    private static BpelInscolaborador port2;
        
    private static BpelConsultarprototipoClientEp service3;
    private static BpelConsultarprototipo port3;
        
    private static BpelConsultardocumentoClientEp service4;
    private static BpelConsultardocumento port4;
        
    public FacadeDatabase() {
    }
    
    public static BpelInsertarprototipoClientEp getServiceInsertarPrototipo() {
        if (service1 == null) {
            service1 = new BpelInsertarprototipoClientEp();
        }
        
        return service1;
    }
    
    public static BpelInsertarprototipo getPortInsertarPrototipo() {
        try {
            if (port1 == null) {
                port1 = getServiceInsertarPrototipo().getBpelInsertarprototipoPt();
                ((BindingProvider) port1).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, WSDL_INSERTAR_PROTOTIPO);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return port1;
    }
    
    public static BpelInscolaboradorClientEp getServiceInsertarColaborador() {
        if (service2 == null) {
            service2 = new BpelInscolaboradorClientEp();
        }
        
        return service2;
    }
    
    public static BpelInscolaborador getPortInsertarColaborador() {
        try {
            if (port2 == null) {
                port2 = getServiceInsertarColaborador().getBpelInscolaboradorPt();
                ((BindingProvider) port2).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, WSDL_INSERTAR_COLABORADOR);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return port2;
    }
    
    public static BpelConsultarprototipoClientEp getServiceConsultarPrototipo() {
        if (service3 == null) {
            service3 = new BpelConsultarprototipoClientEp();
        }
        
        return service3;
    }
    
    public static BpelConsultarprototipo getPortConsultarPrototipo() {
        try {
            if (port3 == null) {
                port3 = getServiceConsultarPrototipo().getBpelConsultarprototipoPt();
                ((BindingProvider) port3).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, WSDL_CONSULTAR_PROTOTIPO);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return port3;
    }
    
    public static BpelConsultardocumentoClientEp getServiceConsultarDocumento() {
        if (service4 == null) {
            service4 = new BpelConsultardocumentoClientEp();
        }
        
        return service4;
    }
    
    public static BpelConsultardocumento getPortConsultarDocumento() {
        try {
            if (port4 == null) {
                port4 = getServiceConsultarDocumento().getBpelConsultardocumentoPt();
                ((BindingProvider) port4).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, WSDL_CONSULTAR_DOCUMENTO);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return port4;
    }
    
    public static void insertarProtipo() {
    
    }
    
    public static void insertarColaborador() {
    
    }
    
    public static void consultarPrototipo() {
    
    }
    
    public static void consultarDocumento() {
    
    }
}
