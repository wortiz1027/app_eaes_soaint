package co.edu.javeriana.negocio;

import co.edu.javeriana.comun.TipoComun;

public class Colaborador extends Persona {
    @SuppressWarnings("compatibility:-6838652694449206429")
    private static final long serialVersionUID = 1L;
    private TipoComun rol;
    
    public Colaborador() {
        super();
        this.rol = new TipoComun();
    }

    public void setRol(TipoComun rol) {
        this.rol = rol;
    }

    public TipoComun getRol() {
        return rol;
    }
}
