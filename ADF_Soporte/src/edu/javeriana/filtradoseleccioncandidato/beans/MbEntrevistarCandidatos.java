package edu.javeriana.filtradoseleccioncandidato.beans;

import co.edu.javeriana.configuracion.extend.AbstractBPMManageBeanBase;
import co.edu.javeriana.configuracion.utils.JsfUtils;
import co.edu.javeriana.configuracion.utils.error.*;
import co.edu.javeriana.facade.FacadeDatabase2;
import java.math.BigDecimal;

import co.edu.javeriana.negocio.Candidato;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.faces.event.ActionEvent;

import oracle.adf.share.logging.ADFLogger;


public class MbEntrevistarCandidatos extends AbstractBPMManageBeanBase implements Serializable {
    @SuppressWarnings("compatibility:8971018680473194543")
    private static final long serialVersionUID = 1L;
    private static ADFLogger logger = ADFLogger.createADFLogger(MbEntrevistarCandidatos.class);
    
    public List<Candidato> lstCandidatos;
    
    public MbEntrevistarCandidatos() {
        super();
    }
    
    @Override
    public String inicializarManageBean() {      
        //TODO Realizar todas las inicializaciones y operaciones de arranque        
        lstCandidatos = new ArrayList<>();
        return MbEntrevistarCandidatos.NAVEGACION_CONTINUAR;
    }
    
    public void consultarCandidatosVacante(){
        
        try {
            final String codigoVacante = (String) JsfUtils.getElObject("#{bindings.codigoVacante.inputValue}");
            
            FacadeDatabase2.consultarCandidatos(this.lstCandidatos, codigoVacante);
            
        } catch(Exception e) {
            final ProcessError process = new ProcessError();
            process.setMethodCode(ProcessError.MethodIdentifier.M03.getID());
            process.process(e, this);
        }
    }
    
    public void insertarObservacionEntrevista() {
        try {
            
            String response = "";
            final String observaciones = (String) JsfUtils.getElObject("#{bindings.observaciones.inputValue}");
            final String codigoEntrevista = (String) JsfUtils.getElObject("#{bindings.codigoEntrevista.inputValue}");
            
            FacadeDatabase2.actualizarEntrevista(new BigDecimal(codigoEntrevista), observaciones, response);
            
        } catch(Exception e) {
            final ProcessError process = new ProcessError();
            process.setMethodCode(ProcessError.MethodIdentifier.M03.getID());
            process.process(e, this);
        }
    }
    
    @Override
    public void finalizarActionListener(ActionEvent actionEvent) {
        //TODO Realizo las actividades intermedias que crea necesarias
    }

    @Override
    public Boolean finalizarActividad() {
        //TODO Se realizar actividades de validación para determinar si debo o no terminar la tarea
        return Boolean.TRUE;
    }
    
    public String finalizarPantalla() {
        //TODO Da por sentado que la pantalla ya se debe cerrar y la actividad debe viajar
        return MbEntrevistarCandidatos.NAVEGACION_FINALIZAR;
    }
}