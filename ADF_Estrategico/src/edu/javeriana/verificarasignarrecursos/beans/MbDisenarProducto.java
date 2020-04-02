package edu.javeriana.verificarasignarrecursos.beans;

import co.edu.javeriana.configuracion.contextual.event.ProcessContextualEventInterface;
import co.edu.javeriana.configuracion.extend.AbstractBPMManageBeanBase;

import java.io.Serializable;

import javax.faces.event.ActionEvent;

public class MbDisenarProducto extends AbstractBPMManageBeanBase implements Serializable, ProcessContextualEventInterface {
    @SuppressWarnings("compatibility:7424524058483809606")
    private static final long serialVersionUID = 1L;

    public MbDisenarProducto() {       
    }

    @Override
    public void finalizarActionListener(ActionEvent actionEvent) {
        // TODO Implement this method
    }

    @Override
    public Boolean finalizarActividad() {
        // TODO Implement this method
        return null;
    }

    @Override
    public String inicializarManageBean() {
        // TODO Implement this method
        return null;
    }

    @Override
    public void processContextualEvent(Object object, Object object2) {
        // TODO Implement this method

    }

    @Override
    public void processOnError(Object object, Object object2) {
        // TODO Implement this method

    }

    @Override
    public void processOnCleanError(Object object, Object object2) {
        // TODO Implement this method

    }

    @Override
    public void processOnSelect(Object object, Object object2) {
        // TODO Implement this method

    }

    @Override
    public void processOnRefresh(Object object, Object object2) {
        // TODO Implement this method

    }

    @Override
    public void processOnSearch(Object object, Object object2) {
        // TODO Implement this method

    }

    @Override
    public void processOnChange(Object object, Object object2) {
        // TODO Implement this method

    }

    @Override
    public void processOnClick(Object object, Object object2) {
        // TODO Implement this method

    }

    @Override
    public void processValidateParticipante(Object object, Object object2) {
        // TODO Implement this method

    }

    @Override
    public void processOnLoad(Object object, Object object2) {
        // TODO Implement this method

    }
}
