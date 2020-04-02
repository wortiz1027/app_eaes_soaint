package co.edu.javeriana.negocio;

import java.util.Date;

public class Candidato extends Persona {
    @SuppressWarnings("compatibility:-5190721220807537597")
    private static final long serialVersionUID = 1L;
    
    private Date fechaNacimiento;
    
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
}
