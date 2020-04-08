package edu.javeriana.filtradoseleccioncandidato.beans;

import co.edu.javeriana.configuracion.extend.AbstractBPMManageBeanBase;

import co.edu.javeriana.configuracion.utils.JsfUtils;
import co.edu.javeriana.configuracion.utils.error.ProcessError;
import co.edu.javeriana.facade.FacadeDatabase2;
import co.edu.javeriana.negocio.Candidato;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.faces.event.ActionEvent;

import oracle.adf.share.logging.ADFLogger;

public class MbEvaluarSeleccionarCandidato extends AbstractBPMManageBeanBase implements Serializable {
    @SuppressWarnings("compatibility:-8553990612629468921")
    private static final long serialVersionUID = 1L;
    private static ADFLogger logger = ADFLogger.createADFLogger(MbEvaluarSeleccionarCandidato.class);
    
    private List<Candidato> lstCandidatos = new ArrayList<Candidato>(0);
    
    public MbEvaluarSeleccionarCandidato() {
        super();
    }
    
    @Override
    public String inicializarManageBean() {      
        //TODO Realizar todas las inicializaciones y operaciones de arranque  
        
        //1. LLamar al SW de canditatos
        try {
            //Por default se envia cualquier valor
            final String codigoCanditados = "1";
            
            FacadeDatabase2.consultarCandidatos(this.lstCandidatos, codigoCanditados);
            
        } catch(Exception e) {
            final ProcessError process = new ProcessError();
            process.setMethodCode(ProcessError.MethodIdentifier.M03.getID());
            process.process(e, this);
        }
        
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


    public void setLstCandidatos(List<Candidato> lstCandidatos) {
        this.lstCandidatos = lstCandidatos;
    }

    public List<Candidato> getLstCandidatos() {
        return lstCandidatos;
    }
}
