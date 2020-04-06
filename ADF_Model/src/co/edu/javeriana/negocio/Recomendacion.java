package co.edu.javeriana.negocio;

import java.io.Serializable;

import java.math.BigDecimal;

public class Recomendacion implements Serializable {
    @SuppressWarnings("compatibility:2704083585509988310")
    private static final long serialVersionUID = 1L;
    private String observacion;
    private BigDecimal seleccionado;
    
    public Recomendacion() {
        super();
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setSeleccionado(BigDecimal seleccionado) {
        this.seleccionado = seleccionado;
    }

    public BigDecimal getSeleccionado() {
        return seleccionado;
    }
}
