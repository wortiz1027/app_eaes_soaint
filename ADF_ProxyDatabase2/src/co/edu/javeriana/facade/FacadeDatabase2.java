package co.edu.javeriana.facade;

import co.edu.javeriana.proxies.consultarcandidatos.proxy.BpelConsultacandidatos;
import co.edu.javeriana.proxies.consultarcandidatos.proxy.BpelConsultacandidatosClientEp;
import co.edu.javeriana.proxies.consultarcandidatos.types.CandidatoType;
import co.edu.javeriana.proxies.consultarcandidatos.types.CandidatosType;
import co.edu.javeriana.proxies.consultarcandidatos.types.GenericoType;
import co.edu.javeriana.proxies.consultarrecomendaciones.proxy.BpelConsprotrecomendaciones;
import co.edu.javeriana.proxies.consultarrecomendaciones.proxy.BpelConsprotrecomendacionesClientEp;
import co.edu.javeriana.proxies.insertarentrevista.proxy.BpelInsertarentrevista;
import co.edu.javeriana.proxies.insertarentrevista.proxy.BpelInsertarentrevistaClientEp;
import co.edu.javeriana.proxies.updateentrevista.proxy.BpelUpdateobsentrevista;
import co.edu.javeriana.proxies.updateentrevista.proxy.BpelUpdateobsentrevistaClientEp;
import co.edu.javeriana.proxies.updateestadoentrevista.proxy.BpelUpdateobsestentrevista;
import co.edu.javeriana.proxies.updateestadoentrevista.proxy.BpelUpdateobsestentrevistaClientEp;
import java.math.BigDecimal;

import java.util.List;

import javax.xml.ws.BindingProvider;
import co.edu.javeriana.negocio.Candidato;
import co.edu.javeriana.negocio.Entrevista;
import co.edu.javeriana.negocio.Recomendacion;
import co.edu.javeriana.proxies.consultarrecomendaciones.types.RecomendacionType;
import co.edu.javeriana.proxies.insertarentrevista.types.InsertarEntrevistaType;
import co.edu.javeriana.proxies.insertarentrevista.types.ResponseType;

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
    
    private static BpelInsertarentrevistaClientEp getServiceInsertarEntrevista() {
        if (service1 == null) {
            service1 = new BpelInsertarentrevistaClientEp();
        }
        
        return service1;
    }
    
    private static BpelInsertarentrevista getPortInsertarEntrevista() {
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
    
    private static BpelConsultacandidatosClientEp getServiceConsultarCandidatos() {       
        if (service2 == null) {
            service2 = new BpelConsultacandidatosClientEp();
        }
        
        return service2;
    }
    
    private static BpelConsultacandidatos getPortConsultarCandidatos() {
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
    
    private static BpelConsprotrecomendacionesClientEp getServiceConsultarRecomendaciones() {
        if (service3 == null) {
            service3 = new BpelConsprotrecomendacionesClientEp();
        }
        
        return service3;
    }
    
    private static BpelConsprotrecomendaciones getPortConsultarRecomendaciones() {
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
    
    private static BpelUpdateobsentrevistaClientEp getServiceActualizarEntrevista() {
        if (service4 == null) {
            service4 = new BpelUpdateobsentrevistaClientEp();
        }
        
        return service4;
    }
    
    private static BpelUpdateobsentrevista getPortActualizarEntrevista() {
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
    
    private static BpelUpdateobsestentrevistaClientEp getServiceActualizarEstadoEntrevista() {
        if (service5 == null) {
            service5 = new BpelUpdateobsestentrevistaClientEp();
        }
        
        return service5;
    }
    
    private static BpelUpdateobsestentrevista getPortActualizarEstadoEntrevista() {
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
    
    //Mis metodos para consumir las operaciones
    
    public static void insertarEntrevista(Entrevista entrevista, String response) {
        InsertarEntrevistaType rq = new InsertarEntrevistaType();
        
        //rq.setCodigoCurriculum(entrevista.getCurriculums().getDocumento().);
        //rq.setCodigoColaborador(entrevista.getEntrevistador().getIdentificacion());
        
        ResponseType rs = getPortInsertarEntrevista().process(rq);
        
        response = rs.getEjecucion();
    }
    
    public static void consultarCandidatos(List<Candidato> candidatos, String numero) {
        //1. contruir el request
        GenericoType rq = new GenericoType(); 
        rq.setNumero(numero);
        
        //2. llamar a la operación
        CandidatosType rs = getPortConsultarCandidatos().process(rq);
        
        //3. construir la salida
        List<CandidatoType> candidatosType = rs.getCandidatosType();
        
        for (CandidatoType candidatoType : candidatosType) {
            Candidato candidato = new Candidato();
            candidato.setPrimerNombre(candidatoType.getPrimerNombre());
            candidato.setSegundoNombre(candidatoType.getSegundoNombre());
            candidato.setPrimeroApellido(candidatoType.getPrimerApellido());
            candidato.setSegundoApellido(candidatoType.getSegundoApellido());
            
            candidatos.add(candidato);            
        }//End foreach
        
    }
    
    public static void consultarRecomendaciones(List<Recomendacion> recomendaciones, BigDecimal codigoPrototipo) {
        co.edu.javeriana.proxies.consultarrecomendaciones.types.InputType rq = new co.edu.javeriana.proxies.consultarrecomendaciones.types.InputType();
        rq.setCodigoPrototipo(codigoPrototipo);
        co.edu.javeriana.proxies.consultarrecomendaciones.types.OutputType output = getPortConsultarRecomendaciones().process(rq);
        
        for(RecomendacionType recomendacion : output.getRecomendaciones()){
            Recomendacion item = new Recomendacion();
            item.setObservacion(recomendacion.getObservacion());
            item.setCodigoPrototipo(recomendacion.getCodigoPrototipo());
            
            recomendaciones.add(item);
        }
    }
    
    public static void actualizarEntrevista(BigDecimal codigoEntrevista, String observaciones, String response) {
        co.edu.javeriana.proxies.updateentrevista.types.InputType rq = new co.edu.javeriana.proxies.updateentrevista.types.InputType();
        rq.setCodigoEntrevista(codigoEntrevista);
        rq.setObservaciones(observaciones);
        co.edu.javeriana.proxies.updateentrevista.types.OutputType rs = getPortActualizarEntrevista().process(rq);
        
        response = rs.getEjecucion();
    }
    
    public static void actualizarEstadoEntrevista(BigDecimal codigoEntrevista, String evaluarSeleccion, String observaciones, String response) {
        co.edu.javeriana.proxies.updateestadoentrevista.types.InputType rq = new co.edu.javeriana.proxies.updateestadoentrevista.types.InputType();
        rq.setCodigoEntrevista(codigoEntrevista);
        rq.setEvaluarSeleccion(evaluarSeleccion);
        rq.setObservaciones(observaciones);
        
        co.edu.javeriana.proxies.updateestadoentrevista.types.OutputType rs = getPortActualizarEstadoEntrevista().process(rq);
        
        response = rs.getEjecucion();
    }
    
}
