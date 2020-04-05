package edu.javeriana.filtradoseleccioncandidato.beans;

import co.edu.javeriana.negocio.Entrevista;


public class MbEntrevistarCandidatos{
    private Entrevista entrevista;
    
    public MbEntrevistarCandidatos() {
        super();
    }

    public void setEntrevista(Entrevista entrevista) {
        this.entrevista = entrevista;
    }

    public Entrevista getEntrevista() {
        return entrevista;
    }
}
