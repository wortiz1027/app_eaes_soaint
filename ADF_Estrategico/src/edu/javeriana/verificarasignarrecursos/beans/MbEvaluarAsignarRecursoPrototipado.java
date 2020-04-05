package edu.javeriana.verificarasignarrecursos.beans;

import co.edu.javeriana.negocio.Colaborador;
import co.edu.javeriana.negocio.Prototipo;

import java.util.List;
import java.util.ArrayList;

import javax.faces.event.ActionEvent;

public class MbEvaluarAsignarRecursoPrototipado {
    
    private Prototipo prototipo;
    private List<Colaborador> colaboradores;
    
    public MbEvaluarAsignarRecursoPrototipado() {
        this.colaboradores = new ArrayList<>();
    }

    public void setPrototipo(Prototipo prototipo) {
        this.prototipo = prototipo;
    }

    public Prototipo getPrototipo() {
        return prototipo;
    }

    public void setColaboradores(List<Colaborador> colaboradores) {
        this.colaboradores = colaboradores;
    }

    public List<Colaborador> getColaboradores() {
        return colaboradores;
    }

    public void onClickVer(ActionEvent actionEvent) {
        // Add event code here...
    }
}
