package co.edu.javeriana.facade;

import co.edu.javeriana.proxies.advancese.proxy.BpelAdvanceSearch;
import co.edu.javeriana.proxies.advancese.proxy.BpelAdvancesearchClientEp;
import co.edu.javeriana.proxies.checkin.proxy.BpelCheckinWcc;
import co.edu.javeriana.proxies.checkin.proxy.BpelCheckinWccClientEp;
import co.edu.javeriana.proxies.getfile.proxy.BpelGetFile;
import co.edu.javeriana.proxies.getfile.proxy.BpelGetfileClientEp;

import javax.xml.ws.BindingProvider;

public class FacadeContent {
    
    private static final String WSDL_GET_FILE       = "http://bpm-dv1:7003/soa-infra/services/default/SOA_Content/bpel_getfile_client_ep?WSDL";
    private static final String WSDL_ADVANCE_SEARCH = "http://bpm-dv1:7003/soa-infra/services/default/SOA_Content/bpel_advancesearch_client_ep?WSDL";
    private static final String WSDL_CHECKIN        = "http://bpm-dv1:7003/soa-infra/services/default/SOA_Content/bpel_checkin_wcc_client_ep?WSDL";
    
    private static BpelGetfileClientEp service1;
    private static BpelGetFile port1;
    
    private static BpelAdvancesearchClientEp service2;
    private static BpelAdvanceSearch port2;
    
    private static BpelCheckinWccClientEp service3;
    private static BpelCheckinWcc port3;
    
    public FacadeContent() {
    }
    
    public static BpelGetfileClientEp getServiceGetFile() {
        if (service1 == null) {
            service1 = new BpelGetfileClientEp();
        }
        
        return service1;
    }
    
    public static BpelGetFile getPortGetFile() {
        try {
            if (port1 == null) {
                port1 = getServiceGetFile().getBpelGetFilePt();
                ((BindingProvider) port1).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, WSDL_GET_FILE);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return port1;
    }
    
    public static BpelAdvancesearchClientEp getServiceAdvanceSearch() {
        if (service2 == null) {
            service2 = new BpelAdvancesearchClientEp();
        }
        
        return service2;
    }
    
    public static BpelAdvanceSearch getPortAdvanceSearch() {
        try {
            if (port2 == null) {
                port2 = getServiceAdvanceSearch().getBpelAdvanceSearchPt();
                ((BindingProvider) port2).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, WSDL_ADVANCE_SEARCH);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return port2;
    }
    
    public static BpelCheckinWccClientEp getServiceCheckIn() {
        if (service3 == null) {
            service3 = new BpelCheckinWccClientEp();
        }
        
        return service3;
    }
    
    public static BpelCheckinWcc getPortCheckIn() {
        try {
            if (port3 == null) {
                port3 = getServiceCheckIn().getBpelCheckinWccPt();
                ((BindingProvider) port3).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, WSDL_CHECKIN);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return port3;
    }
    
    public static obtenerArchivo() {
    
    }
    
    public static busquedaAvanzada() {
    
    }
    
    public static checkIn() {
    
    }
}
