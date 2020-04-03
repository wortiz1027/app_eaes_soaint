package co.edu.javeriana.negocio;

import co.edu.javeriana.comun.TipoComun;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Prototipo implements Serializable {
    @SuppressWarnings("compatibility:3560134668606551454")
    private static final long serialVersionUID = 1L;
    private TipoComun tipo;
    private String titulo;
    private String detalle;
    private String conocimiento;
    private Date fechaInicio;
    private Date fechaFin;
    private Double presupuesto;
    private List<Documento> documentos;
    private List<Recomendacion> recomendaciones;
    
    private boolean requiereRevisionesExternasOpcionales;
    
    public Prototipo() {
        super();
        this.tipo = new TipoComun();
        this.fechaInicio = new Date();
        this.fechaFin = new Date();
        this.presupuesto = 0.0;
    }

    public List<Documento> getDocumentos() {
        return this.documentos == null ? new ArrayList<Documento>(0) : this.documentos;
    }
    
    public List<Recomendacion> getRecomendaciones() {
        return this.recomendaciones == null ? new ArrayList<Recomendacion>(0) : this.recomendaciones;
    }

    public void setTipo(TipoComun tipo) {
        this.tipo = tipo;
    }

    public TipoComun getTipo() {
        return tipo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setConocimiento(String conocimiento) {
        this.conocimiento = conocimiento;
    }

    public String getConocimiento() {
        return conocimiento;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setPresupuesto(Double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public Double getPresupuesto() {
        return presupuesto;
    }

    public void setRequiereRevisionesExternasOpcionales(boolean requiereRevisionesExternasOpcionales) {
        this.requiereRevisionesExternasOpcionales = requiereRevisionesExternasOpcionales;
    }

    public boolean isRequiereRevisionesExternasOpcionales() {
        return requiereRevisionesExternasOpcionales;
    }
}
