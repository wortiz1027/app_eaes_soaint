package edu.javeriana.verificarasignarrecursos.beans;

import co.edu.javeriana.configuracion.extend.AbstractBPMManageBeanBase;

import co.edu.javeriana.configuracion.contextual.event.ProcessContextualEventInterface;
import co.edu.javeriana.configuracion.extend.AbstractBPMManageBeanBase;

import co.edu.javeriana.negocio.Prototipo;

import java.io.Serializable;

import javax.faces.event.ActionEvent;

public class MbRealizarPruebasInternasProducto extends AbstractBPMManageBeanBase implements Serializable, ProcessContextualEventInterface {
    @SuppressWarnings("compatibility:7424524058483809606")
    private static final long serialVersionUID = 1L;
    
    private Prototipo prototipo;

    public MbRealizarPruebasInternasProducto() {       
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
    
    public void setPrototipo(Prototipo prototipo) {
        this.prototipo = prototipo;
    }

    public Prototipo getPrototipo() {
        return prototipo;
    }

    public void onClickAdjuntar(ActionEvent actionEvent) {
        // Add event code here...
    }

    public void onClickVer(ActionEvent actionEvent) {
        // Add event code here...
    }
}
