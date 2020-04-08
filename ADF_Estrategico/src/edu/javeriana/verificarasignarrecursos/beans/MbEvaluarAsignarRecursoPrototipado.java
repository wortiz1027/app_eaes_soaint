package edu.javeriana.verificarasignarrecursos.beans;

import co.edu.javeriana.configuracion.extend.AbstractBPMManageBeanBase;
import co.edu.javeriana.negocio.Colaborador;
import co.edu.javeriana.negocio.Prototipo;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.faces.event.ActionEvent;

import oracle.adf.share.logging.ADFLogger;

public class MbEvaluarAsignarRecursoPrototipado extends AbstractBPMManageBeanBase implements Serializable {
    @SuppressWarnings("compatibility:1486569441254227635")
    private static final long serialVersionUID = 1L;
    private static ADFLogger logger = ADFLogger.createADFLogger(MbEvaluarAsignarRecursoPrototipado.class);
    
    private Prototipo prototipo;
    private List<Colaborador> colaboradores;
    
    public MbEvaluarAsignarRecursoPrototipado() {
        this.colaboradores = new ArrayList<>();
    }
    
    @Override
    public String inicializarManageBean() {      
        //TODO Realizar todas las inicializaciones y operaciones de arranque        
        return MbEvaluarAsignarRecursoPrototipado.NAVEGACION_CONTINUAR;
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
        return MbEvaluarAsignarRecursoPrototipado.NAVEGACION_FINALIZAR;
    }

    public void setPrototipo(Prototipo prototipo) {
        this.prototipo = prototipo;
    }

    public Prototipo getPrototipo() {
        return prototipo;
    }

    public void setColaboradores(List<Colaborador> colaboradores) {
        this.colaboradores = colaboradores;
    }

    public List<Colaborador> getColaboradores() {
        return colaboradores;
    }

    public void onClickVer(ActionEvent actionEvent) {
        // Add event code here...
    }
}
