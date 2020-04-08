package edu.javeriana.verificarasignarrecursos.beans;

import co.edu.javeriana.configuracion.extend.AbstractBPMManageBeanBase;
import co.edu.javeriana.negocio.Prototipo;

import java.io.Serializable;

import javax.faces.event.ActionEvent;

import oracle.adf.share.logging.ADFLogger;

public class MbConcluirRevisiones extends AbstractBPMManageBeanBase implements Serializable {
    @SuppressWarnings("compatibility:7772545844832334804")
    private static final long serialVersionUID = 1L;
    private static ADFLogger logger = ADFLogger.createADFLogger(MbConcluirRevisiones.class);
    
    private Prototipo prototipo;
    
    public MbConcluirRevisiones() {
        super();
    }
    
    @Override
    public String inicializarManageBean() {      
        //TODO Realizar todas las inicializaciones y operaciones de arranque        
        return MbConcluirRevisiones.NAVEGACION_CONTINUAR;
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
        return MbConcluirRevisiones.NAVEGACION_FINALIZAR;
    }
    
    public void onClickAdjuntar(ActionEvent actionEvent) {
        // Add event code here...
    }

    public void onClickVer(ActionEvent actionEvent) {
        // Add event code here...
    }

    public void setPrototipo(Prototipo prototipo) {
        this.prototipo = prototipo;
    }

    public Prototipo getPrototipo() {
        return prototipo;
    }
}
