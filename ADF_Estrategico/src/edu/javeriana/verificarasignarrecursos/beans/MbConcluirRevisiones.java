package edu.javeriana.verificarasignarrecursos.beans;

import co.edu.javeriana.facade.FacadeDatabase;

import co.edu.javeriana.negocio.Prototipo;

import java.math.BigDecimal;

import javax.faces.event.ActionEvent;

public class MbConcluirRevisiones {
    
    private Prototipo prototipo;
    
    public MbConcluirRevisiones() {
        this.prototipo = new Prototipo();
        FacadeDatabase.consultarPrototipo(new BigDecimal(0), this.prototipo);
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
