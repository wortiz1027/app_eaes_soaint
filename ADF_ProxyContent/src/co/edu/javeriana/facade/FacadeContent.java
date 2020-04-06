package co.edu.javeriana.facade;

import co.edu.javeriana.proxies.advancese.proxy.BpelAdvanceSearch;
import co.edu.javeriana.proxies.advancese.proxy.BpelAdvancesearchClientEp;
import co.edu.javeriana.proxies.advancese.types.AdvancedSearch;
import co.edu.javeriana.proxies.advancese.types.AdvancedSearchResult;
import co.edu.javeriana.proxies.advancese.types.SearchResponse;
import co.edu.javeriana.proxies.checkin.proxy.BpelCheckinWcc;
import co.edu.javeriana.proxies.checkin.proxy.BpelCheckinWccClientEp;
import co.edu.javeriana.proxies.checkin.types.CheckInUniversal;
import co.edu.javeriana.proxies.checkin.types.CheckInUniversalResult;
import co.edu.javeriana.proxies.checkin.types.PrimaryFile;
import co.edu.javeriana.proxies.checkin.types.Property;
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

import javax.xml.bind.JAXBElement;
import javax.xml.ws.BindingProvider;
import javax.xml.namespace.QName;

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
    
    @SuppressWarnings("unchecked")    
    public static void obtenerArchivo(File file, GetFileResult archivo) {
        //1. contruir el request
        GetFileByID rq = new GetFileByID();

        JAXBElement<Integer> did = new JAXBElement(new QName("http://xmlns.javeriana.edu.co/co/schemas/process/bpm/WCC_GetFile/v1.0", "dID"), Integer.class, file.getDID());
        
        rq.setDID(did);
        rq.setTipoArchivo(file.getTipoArchivo());
        
        //2. llamar a la operación
        GetFileByIDResponse rs = getPortGetFile().process(rq);
        
        //3. construir la salida    
        //archivo.setArchivoDescargado(rs.getGetFileByIDResult().getValue().getArchivoDescargado());
        archivo.getArchivoDescargado().setContenidoArchivo(rs.getGetFileByIDResult().getValue().getArchivoDescargado().getValue().getContenidoArchivo().getValue());
        archivo.getArchivoDescargado().setNombreArchivo(rs.getGetFileByIDResult().getValue().getArchivoDescargado().getValue().getNombreArchivo().getValue());
        
        //Informacion Archivo
        for(FileInfo documentos : rs.getGetFileByIDResult().getValue().getInformacionArhivo()){

            archivo.getInformacionArhivo().setDID(documentos.getDID().getValue());
            archivo.getInformacionArhivo().setDDocName(documentos.getDDocName().getValue());
            archivo.getInformacionArhivo().setTitulo(documentos.getTitulo().getValue());
            archivo.getInformacionArhivo().setTipo(documentos.getTipo().getValue());
            archivo.getInformacionArhivo().setAutor(documentos.getAutor().getValue());
            archivo.getInformacionArhivo().setGrupoSeguridad(documentos.getGrupoSeguridad().getValue());
            
            break;    
        }        
        
        //Status
        archivo.getStatus().setCodigo(rs.getGetFileByIDResult().getValue().getStatus().getValue().getCodigo().getValue());
        archivo.getStatus().setMensaje(rs.getGetFileByIDResult().getValue().getStatus().getValue().getMensaje().getValue());
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
            
            //documento.setAutor(listDocumentos);
        }
    }
    
    @SuppressWarnings("unchecked")
    public static void checkIn(Documento documento, CheckinResult response) {
        //1. contruir el request
        CheckInUniversal rq = new CheckInUniversal(); 
        
        JAXBElement<String> autor     = new JAXBElement(new QName("http://xmlns.javeriana.edu.co/co/schemas/process/bpm/WCC_GetFile/v1.0", "autor"), String.class, documento.getAutor());
        JAXBElement<String> cuenta    = new JAXBElement(new QName("http://xmlns.javeriana.edu.co/co/schemas/process/bpm/WCC_GetFile/v1.0", "cuenta"), String.class, documento.getCuenta());
        JAXBElement<String> dDocName  = new JAXBElement(new QName("http://xmlns.javeriana.edu.co/co/schemas/process/bpm/WCC_GetFile/v1.0", "dDocName"), String.class, documento.getDDocName());
        JAXBElement<String> seguridad = new JAXBElement(new QName("http://xmlns.javeriana.edu.co/co/schemas/process/bpm/WCC_Checkin/v1.0", "grupoSeguridad"), String.class, documento.getGrupoSeguridad());
        JAXBElement<String> tipo      = new JAXBElement(new QName("http://xmlns.javeriana.edu.co/co/schemas/process/bpm/WCC_Checkin/v1.0", "tipo"), String.class, documento.getTipo());
        JAXBElement<String> titulo    = new JAXBElement(new QName("http://xmlns.javeriana.edu.co/co/schemas/process/bpm/WCC_Checkin/v1.0", "titulo"), String.class, documento.getTitulo());
        
        JAXBElement<String> nombre    = new JAXBElement(new QName("http://xmlns.javeriana.edu.co/co/schemas/process/bpm/WCC_Checkin/v1.0", "nombreArchivo"), String.class, documento.getArchivoPrimario().getNombreArchivo());
        JAXBElement<byte[]> contenido = new JAXBElement(new QName("http://xmlns.javeriana.edu.co/co/schemas/process/bpm/WCC_Checkin/v1.0", "contenidoArchivo"), byte[].class, documento.getArchivoPrimario().getContenidoArchivo());
        
        PrimaryFile primary = new PrimaryFile();
        primary.setNombreArchivo(nombre);
        primary.setContenidoArchivo(contenido);
        
        JAXBElement<PrimaryFile> archivo   = new JAXBElement(new QName("http://xmlns.javeriana.edu.co/co/schemas/process/bpm/WCC_Checkin/v1.0", "archivoPrimario"), PrimaryFile.class, primary);
        
        
        
        rq.setAutor(autor);
        rq.setCuenta(cuenta);
        rq.setDDocName(dDocName);
        rq.setGrupoSeguridad(seguridad);
        rq.setTipo(tipo);
        rq.setTitulo(titulo);
        rq.setArchivoPrimario(archivo);
        rq.getArchivoPrimario().getValue().setNombreArchivo(nombre);
        rq.getArchivoPrimario().getValue().setContenidoArchivo(contenido);
        
        for(NameValue propiedades : documento.getCustomDocMetaData()){
            Property item = new Property();
            
            JAXBElement<String> llave = new JAXBElement(new QName("http://xmlns.javeriana.edu.co/co/schemas/process/bpm/WCC_Checkin/v1.0", "name"), String.class, propiedades.getName());
            JAXBElement<String> valor = new JAXBElement(new QName("http://xmlns.javeriana.edu.co/co/schemas/process/bpm/WCC_Checkin/v1.0", "value"), String.class, propiedades.getValue());
            
            item.setName(llave);
            item.setValue(valor);
            
            rq.getCustomDocMetaData().add(item);
        }
        
        //2. llamar a la operación
        CheckInUniversalResult rs = getPortCheckIn().process(rq);
        
        //3. construir la salida    
        response.setDID(rs.getDID().getValue());
        response.setIdRevision(rs.getIdRevision().getValue());
        response.setLabelrevision(rs.getLabelrevision().getValue());
        response.setRevision(rs.getRevision().getValue());
        response.getStatus().setCodigo(rs.getStatus().getValue().getCodigo().getValue());
        response.getStatus().setMensaje(rs.getStatus().getValue().getMensaje().getValue());
        
    }
}
