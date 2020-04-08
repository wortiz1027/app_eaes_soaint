package edu.javeriana.filtradoseleccioncandidato.beans;

import co.edu.javeriana.configuracion.extend.AbstractBPMManageBeanBase;
import co.edu.javeriana.facade.FacadeDatabase2;
import co.edu.javeriana.negocio.Candidato;
import co.edu.javeriana.negocio.Entrevista;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.faces.event.ActionEvent;

import oracle.adf.share.logging.ADFLogger;

public class MbEvaluarCurriculum extends AbstractBPMManageBeanBase implements Serializable {
    @SuppressWarnings("compatibility:6802215591994823285")
    private static final long serialVersionUID = 1L;
    private static ADFLogger logger = ADFLogger.createADFLogger(MbEvaluarCurriculum.class);
        
    private Entrevista entrevista;
    private List<Candidato> candidatos = new ArrayList<Candidato>(0);

    public MbEvaluarCurriculum() {
        super();
    }
    
    @Override
    public String inicializarManageBean() {      
        //TODO Realizar todas las inicializaciones y operaciones de arranque
        //1. LLamar al SW
        FacadeDatabase2.consultarCandidatos(candidatos, "NUM1234");
        
        return MbEvaluarCurriculum.NAVEGACION_CONTINUAR;
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
        return MbEvaluarCurriculum.NAVEGACION_FINALIZAR;
    }

    public void setEntrevista(Entrevista entrevista) {
        this.entrevista = entrevista;
    }

    public Entrevista getEntrevista() {
        return entrevista;
    }
}