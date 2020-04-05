package edu.javeriana.filtradoseleccioncandidato.beans;

import co.edu.javeriana.facade.FacadeDatabase2;
import co.edu.javeriana.negocio.Candidato;
import co.edu.javeriana.negocio.Entrevista;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

public class MbEvaluarCurriculum implements Serializable {
    @SuppressWarnings("compatibility:9065134202316032382")
    private static final long serialVersionUID = 1L;
    
    private Entrevista entrevista;
    private List<Candidato> candidatos = new ArrayList<Candidato>(0);

    public MbEvaluarCurriculum() {
        super();
        //1. LLamar al SW
        FacadeDatabase2.consultarCandidatos(candidatos, "NUM1234");
    }

    public void setEntrevista(Entrevista entrevista) {
        this.entrevista = entrevista;
    }

    public Entrevista getEntrevista() {
        return entrevista;
    }
}
