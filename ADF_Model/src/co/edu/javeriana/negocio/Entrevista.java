package co.edu.javeriana.negocio;

import java.io.Serializable;

import java.util.Date;

public class Entrevista implements Serializable {
    @SuppressWarnings("compatibility:-3987782155323688184")
    private static final long serialVersionUID = 1L;
    private Curriculum curriculums;
    private Colaborador entrevistador;
    private Colaborador emisorRespuesta;
    private Vacante vacante;
    private Date fechaRealizacion;
    private Date fechaEmisionResultado;
    private String observacion;
    private String resultado;
    
    private Boolean seDebeEntrevistar;
    private Boolean seDebeEvaluarParaSeleccion;
    
    public Entrevista() {
        super();
        this.curriculums = new Curriculum(); 
        this.entrevistador = new Colaborador();
        this.emisorRespuesta = new Colaborador();
        this.vacante = new Vacante();
        this.fechaRealizacion = new Date();
        this.fechaEmisionResultado = new Date();
    }

    public void setCurriculums(Curriculum curriculums) {
        this.curriculums = curriculums;
    }

    public Curriculum getCurriculums() {
        return curriculums;
    }

    public void setEntrevistador(Colaborador entrevistador) {
        this.entrevistador = entrevistador;
    }

    public Persona getEntrevistador() {
        return entrevistador;
    }

    public void setEmisorRespuesta(Colaborador emisorRespuesta) {
        this.emisorRespuesta = emisorRespuesta;
    }

    public Persona getEmisorRespuesta() {
        return emisorRespuesta;
    }

    public void setVacante(Vacante vacante) {
        this.vacante = vacante;
    }

    public Vacante getVacante() {
        return vacante;
    }

    public void setFechaRealizacion(Date fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    public Date getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaEmisionResultado(Date fechaEmisionResultado) {
        this.fechaEmisionResultado = fechaEmisionResultado;
    }

    public Date getFechaEmisionResultado() {
        return fechaEmisionResultado;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setSeDebeEntrevistar(Boolean seDebeEntrevistar) {
        this.seDebeEntrevistar = seDebeEntrevistar;
    }

    public Boolean getSeDebeEntrevistar() {
        return seDebeEntrevistar;
    }

    public void setSeDebeEvaluarParaSeleccion(Boolean seDebeEvaluarParaSeleccion) {
        this.seDebeEvaluarParaSeleccion = seDebeEvaluarParaSeleccion;
    }

    public Boolean getSeDebeEvaluarParaSeleccion() {
        return seDebeEvaluarParaSeleccion;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getResultado() {
        return resultado;
    }
}
