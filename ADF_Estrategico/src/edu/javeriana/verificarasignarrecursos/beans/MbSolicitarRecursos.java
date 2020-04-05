package edu.javeriana.verificarasignarrecursos.beans;

import co.edu.javeriana.negocio.Prototipo;

public class MbSolicitarRecursos {
    
    private Prototipo prototipo;
    
    public MbSolicitarRecursos() {
        super();
    }
    
    public void setPrototipo(Prototipo prototipo) {
        this.prototipo = prototipo;
    }

    public Prototipo getPrototipo() {
        return prototipo;
    }
}
