package co.edu.javeriana.negocio;

import java.io.Serializable;

public class Curriculum implements Serializable {
    @SuppressWarnings("compatibility:-7747261074357219671")
    private static final long serialVersionUID = 1L;
    private Candidato candidato;
    private String idDoc;
    
    public Curriculum() {
        super();
        this.candidato = new Candidato();
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setIdDoc(String idDoc) {
        this.idDoc = idDoc;
    }

    public String getIdDoc() {
        return idDoc;
    }
}
