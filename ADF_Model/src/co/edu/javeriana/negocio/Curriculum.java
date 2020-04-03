package co.edu.javeriana.negocio;

import java.io.Serializable;

public class Curriculum implements Serializable {
    @SuppressWarnings("compatibility:-2729851536011804468")
    private static final long serialVersionUID = 1L;
    private Candidato candidato;
    private Documento documento;
    
    public Curriculum() {
        super();
        this.candidato = new Candidato();
        this.documento = new Documento();
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }

    public Documento getDocumento() {
        return documento;
    }
}
