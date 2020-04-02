package co.edu.javeriana.negocio;

import java.io.Serializable;

public class Vacante implements Serializable {
    @SuppressWarnings("compatibility:-3342146981343264331")
    private static final long serialVersionUID = 1L;
    private String codigo;
    private String nombre;
    private String descripcion;
    
    public Vacante() {
        super();
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
