package co.edu.javeriana.facade;

import co.edu.javeriana.negocio.Recomendacion;
import co.edu.javeriana.proxies.advancese.proxy.BpelAdvanceSearch;
import co.edu.javeriana.proxies.advancese.proxy.BpelAdvancesearchClientEp;
import co.edu.javeriana.proxies.advancese.types.AdvancedSearch;
import co.edu.javeriana.proxies.advancese.types.AdvancedSearchResult;
import co.edu.javeriana.proxies.advancese.types.SearchResponse;
import co.edu.javeriana.proxies.checkin.proxy.BpelCheckinWcc;
import co.edu.javeriana.proxies.checkin.proxy.BpelCheckinWccClientEp;
import co.edu.javeriana.proxies.checkin.types.CheckInUniversal;
import co.edu.javeriana.proxies.checkin.types.CheckInUniversalResult;
import co.edu.javeriana.proxies.getfile.proxy.BpelGetFile;
import co.edu.javeriana.proxies.getfile.proxy.BpelGetfileClientEp;

import co.edu.javeriana.proxies.getfile.types.GetFileByID;
import co.edu.javeriana.proxies.getfile.types.GetFileByIDResponse;
import co.edu.javeriana.proxies.getfile.types.FileInfo;
import co.edu.javeriana.wcc.CheckinResult;
import co.edu.javeriana.wcc.Documento;
import co.edu.javeriana.wcc.File;
import co.edu.javeriana.wcc.GetFileResult;
import co.edu.javeriana.wcc.NameValue;

import java.util.List;

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
    
    public static void obtenerArchivo(File file, GetFileResult archivo) {
        //1. contruir el request
        GetFileByID rq = new GetFileByID(); 
        rq.setDID(file.getDID());
        rq.setTipoArchivo(file.getTipoArchivo());
        
        //2. llamar a la operación
        GetFileByIDResponse rs = getPortGetFile().process(rq);
        
        //3. construir la salida    
        //archivo.setArchivoDescargado(rs.getGetFileByIDResult().getValue().getArchivoDescargado());
        archivo.getArchivoDescargado().setContenidoArchivo(rs.getGetFileByIDResult().getValue().getArchivoDescargado().getValue().getContenidoArchivo());
        archivo.getArchivoDescargado().setNombreArchivo(rs.getGetFileByIDResult().getValue().getArchivoDescargado().getValue().getNombreArchivo());
        
        //Informacion Archivo
        for(FileInfo documentos : rs.getGetFileByIDResult().getValue().getInformacionArhivo()){

            archivo.getInformacionArhivo().setDID(documentos.getDID());
            archivo.getInformacionArhivo().setDDocName(documentos.getDDocName());
            archivo.getInformacionArhivo().setTitulo(documentos.getTitulo());
            archivo.getInformacionArhivo().setTipo(documentos.getTipo());
            archivo.getInformacionArhivo().setAutor(documentos.getAutor());
            archivo.getInformacionArhivo().setGrupoSeguridad(documentos.getGrupoSeguridad());
            
            break;    
        }        
        
        //Status
        archivo.getStatus().setCodigo(rs.getGetFileByIDResult().getValue().getStatus().getValue().getCodigo());
        archivo.getStatus().setMensaje(rs.getGetFileByIDResult().getValue().getStatus().getValue().getMensaje());
    }
    
    public static void busquedaAvanzada(String queryText, List<Documento> response) {
        //1. contruir el request
        AdvancedSearch rq = new AdvancedSearch(); 
        rq.setQueryText(queryText);
        
        //2. llamar a la operación
        SearchResponse rs = getPortAdvanceSearch().process(rq);
        
        //3. construir la salida
        List<AdvancedSearchResult> searchResult = rs.getSearchResults();
           
        for(AdvancedSearchResult listDocumentos : searchResult){
            Documento documento = new Documento();
            
            documento.setAutor(listDocumentos);
        }
    }
    
    public static void checkIn(Documento documento, CheckinResult response) {
        //1. contruir el request
        CheckInUniversal rq = new CheckInUniversal(); 
        
        rq.setAutor(documento.getAutor());
        rq.setCuenta(documento.getCuenta());
        rq.setDDocName(documento.getDDocName());
        rq.setGrupoSeguridad(documento.getGrupoSeguridad());
        rq.setTipo(documento.getTipo());
        rq.setTitulo(documento.getTitulo());
        rq.getArchivoPrimario().getValue().setContenidoArchivo(documento.getArchivoPrimario().getContenidoArchivo());
        rq.getArchivoPrimario().getValue().setNombreArchivo(documento.getArchivoPrimario().getNombreArchivo());
        rq.getCustomDocMetaData().add(item);
        
        for(NameValue propiedades : documento.getCustomDocMetaData()){
            NameValue item = new NameValue();
            
            //item.setCodigoPrototipo();
            item.setName(propiedades.getName() != null ? propiedades.getName() : "");
            item.setValue(propiedades.getValue() != null ? propiedades.getValue() : "");
            
            rq.getCustomDocMetaData().add(item);
        }
        
        //2. llamar a la operación
        CheckInUniversalResult rs = getPortCheckIn().process(rq);
        
        //3. construir la salida    
        response.setDID(rs.getDID());
        response.setIdRevision(rs.getIdRevision());
        response.setLabelrevision(rs.getLabelrevision());
        response.setRevision(rs.getRevision());
        response.getStatus().setCodigo(rs.getStatus().getValue().getCodigo());
        response.getStatus().setMensaje(rs.getStatus().getValue().getMensaje());
        
    }
}
