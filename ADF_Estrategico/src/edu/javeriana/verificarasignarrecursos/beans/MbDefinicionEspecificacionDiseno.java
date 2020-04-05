package edu.javeriana.verificarasignarrecursos.beans;

import co.edu.javeriana.negocio.Prototipo;

import javax.faces.event.ActionEvent;

public class MbDefinicionEspecificacionDiseno {
    
    private Prototipo prototipo;
    
    public MbDefinicionEspecificacionDiseno() {
        super();
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
