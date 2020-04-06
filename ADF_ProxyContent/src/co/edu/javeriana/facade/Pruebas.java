package co.edu.javeriana.facade;

import co.edu.javeriana.wcc.CheckinResult;
import co.edu.javeriana.wcc.Documento;
import co.edu.javeriana.wcc.NameValue;

import java.io.*;

public class Pruebas {
            
    public static void main(String x[]) throws FileNotFoundException, IOException {
        
        File file = new File("C:\\Users\\javeriana\\Documents\\prueba_06042020.pdf");
        FileInputStream fis = new FileInputStream(file);

        // int byteLength = fff.length(); 

        // In android the result of file.length() is long
        long byteLength = file.length(); // byte count of the file-content

        byte[] content = new byte[(int) byteLength];
        fis.read(content, 0, (int) byteLength);
        
        Documento documento = new Documento();
        
        documento.setDID(1);
        documento.setRevision("");
        documento.setDDocName("");
        documento.setTipo("Document");
        documento.setTitulo("Carga desde clase java");
        documento.setAutor("weblogic");
        documento.setGrupoSeguridad("Public");
        documento.setCuenta("");
        documento.setExtension("");
        documento.setFechaCreacion("");
        documento.setFormato("");
        documento.setUrl("");
        
        NameValue metadata1 = new NameValue();
        metadata1.setName("xNumeroID");
        metadata1.setValue("951235789");
        
        NameValue metadata2 = new NameValue();
        metadata2.setName("xTelefono");
        metadata2.setValue("3109876542");
        
        NameValue metadata3 = new NameValue();
        metadata3.setName("xFolderID");
        metadata3.setValue("SOAint-123456");
        
        documento.getCustomDocMetaData().add(metadata1);
        documento.getCustomDocMetaData().add(metadata2);
        
        documento.getArchivoPrimario().setNombreArchivo("prueba_06042020.pdf");
        documento.getArchivoPrimario().setContenidoArchivo(content);
        
        CheckinResult response = new CheckinResult();
        
        FacadeContent.checkIn(documento, response);
        
        System.out.println("Id         : " + response.getDID());
        System.out.println("IdRevision : " + response.getIdRevision());
        System.out.println("Revision   : " + response.getRevision());
        System.out.println("Label      : " + response.getLabelrevision());
        System.out.println("Codigo     : " + response.getStatus().getCodigo());
        System.out.println("Mensaje    : " + response.getStatus().getMensaje());
    }
    
}
