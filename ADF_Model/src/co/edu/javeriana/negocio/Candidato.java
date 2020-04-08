package co.edu.javeriana.negocio;

import java.util.Date;

public class Candidato extends Persona {
    @SuppressWarnings("compatibility:-5190721220807537597")
    private static final long serialVersionUID = 1L;
    
    private Date fechaNacimiento;
    private String nombreCompleto;
    
    public Candidato() {
        super();
        this.fechaNacimiento = new Date();
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }
    
    public void generarNombreCompleto(){
        this.nombreCompleto = "";
        this.nombreCompleto = this.nombreCompleto + this.getPrimerNombre();
        this.nombreCompleto = this.nombreCompleto + (this.getSegundoNombre() != null ? " " + this.getSegundoNombre() : "");
        this.nombreCompleto = this.nombreCompleto + (this.getPrimeroApellido() != null ? " " + this.getPrimeroApellido() : "");
        this.nombreCompleto = this.nombreCompleto + (this.getSegundoApellido() != null ? " " + this.getSegundoApellido() : "");
    }
}
