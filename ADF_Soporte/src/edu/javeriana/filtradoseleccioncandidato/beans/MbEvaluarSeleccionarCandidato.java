package edu.javeriana.filtradoseleccioncandidato.beans;

import co.edu.javeriana.configuracion.extend.AbstractBPMManageBeanBase;

import java.io.Serializable;

import javax.faces.event.ActionEvent;

import oracle.adf.share.logging.ADFLogger;

public class MbEvaluarSeleccionarCandidato extends AbstractBPMManageBeanBase implements Serializable {
    @SuppressWarnings("compatibility:6396659058651291067")
    private static final long serialVersionUID = 1L;
    private static ADFLogger logger = ADFLogger.createADFLogger(MbEvaluarSeleccionarCandidato.class);
    
    public MbEvaluarSeleccionarCandidato() {
        super();
    }
    
    @Override
    public String inicializarManageBean() {      
        //TODO Realizar todas las inicializaciones y operaciones de arranque        
        return MbEvaluarSeleccionarCandidato.NAVEGACION_CONTINUAR;
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
        return MbEvaluarSeleccionarCandidato.NAVEGACION_FINALIZAR;
    }
}