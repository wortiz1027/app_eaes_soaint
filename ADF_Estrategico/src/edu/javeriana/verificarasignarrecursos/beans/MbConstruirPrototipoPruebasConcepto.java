package edu.javeriana.verificarasignarrecursos.beans;

import co.edu.javeriana.negocio.Prototipo;

import javax.faces.event.ActionEvent;

public class MbConstruirPrototipoPruebasConcepto {
    
    private Prototipo prototipo;
    
    public MbConstruirPrototipoPruebasConcepto() {
        super();
    }

    public void onClickAgregarRecomendaciones(ActionEvent actionEvent) {
        // Add event code here...
    }

    public void onClickEliminarRecomendaciones(ActionEvent actionEvent) {
        // Add event code here...
    }
    
    public void setPrototipo(Prototipo prototipo) {
        this.prototipo = prototipo;
    }

    public Prototipo getPrototipo() {
        return prototipo;
    }
}
