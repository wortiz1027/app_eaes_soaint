package co.edu.javeriana.wcc;

import java.io.Serializable;

public class Estatus implements Serializable {
    @SuppressWarnings("compatibility:4273248371900997521")
    private static final long serialVersionUID = 1L;
    
    private int codigo;
    private String mensaje;
    
    public Estatus() {
        super();
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}
