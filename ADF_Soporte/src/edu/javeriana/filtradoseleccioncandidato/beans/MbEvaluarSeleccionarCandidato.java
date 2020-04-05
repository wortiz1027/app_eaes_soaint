package edu.javeriana.filtradoseleccioncandidato.beans;

import co.edu.javeriana.negocio.Entrevista;

public class MbEvaluarSeleccionarCandidato {
    private Entrevista entrevista;
    
    public MbEvaluarSeleccionarCandidato() {
        super();
    }

    public void setEntrevista(Entrevista entrevista) {
        this.entrevista = entrevista;
    }

    public Entrevista getEntrevista() {
        return entrevista;
    }
}
