package edu.javeriana.filtradoseleccioncandidato.beans;

import co.edu.javeriana.negocio.Entrevista;

import java.io.Serializable;

public class MbEvaluarCurriculum implements Serializable {
    @SuppressWarnings("compatibility:9065134202316032382")
    private static final long serialVersionUID = 1L;
    
    private Entrevista entrevista;

    public MbEvaluarCurriculum() {
        super();
    }

    public void setEntrevista(Entrevista entrevista) {
        this.entrevista = entrevista;
    }

    public Entrevista getEntrevista() {
        return entrevista;
    }
}
