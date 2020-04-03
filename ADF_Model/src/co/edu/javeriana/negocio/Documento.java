package co.edu.javeriana.negocio;

import java.io.Serializable;

public class Documento implements Serializable {
    @SuppressWarnings("compatibility:3870334208629736879")
    private static final long serialVersionUID = 1L;
    private String idDoc;
    
    public Documento() {
        super();
    }

    public void setIdDoc(String idDoc) {
        this.idDoc = idDoc;
    }

    public String getIdDoc() {
        return idDoc;
    }
}
