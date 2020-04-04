package co.edu.javeriana.facade;

import co.edu.javeriana.proxies.insertarprototipo.proxy.BpelInsertarprototipo;
import co.edu.javeriana.proxies.insertarprototipo.proxy.BpelInsertarprototipoClientEp;

import javax.xml.ws.BindingProvider;

import oracle.adf.share.logging.ADFLogger;

public class FacadeDatabase {
    public static final ADFLogger LOGGER = ADFLogger.createADFLogger(FacadeDatabase.class);
    
    private static final String INSERTAR_PROTOTIPO_WSDL = "http://bpm-dv1:7003/soa-infra/services/default/SOA_Database/bpel_insertarprototipo_client_ep?WSDL";
    
    private static BpelInsertarprototipoClientEp service;
    private static BpelInsertarprototipo port;
        
    public FacadeDatabase() {
    }
    
    public static BpelInsertarprototipoClientEp getService() {
        if (service == null) {
            service = new BpelInsertarprototipoClientEp();
        }
        return service;
    }
    
    public static BpelInsertarprototipo getPort() {
        try {
            if (port == null) {
                port = getService().getBpelInsertarprototipoPt();
                ((BindingProvider) port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, INSERTAR_PROTOTIPO_WSDL);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return port;
    }
    
    public static void insertarProtipo() {
    
    }
}
