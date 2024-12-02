public interface Documento {
    void mostrarContenido();
}

public class DocumentoReal implements Documento {
    private String contenido;

    public DocumentoReal(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public void mostrarContenido() {
        System.out.println("Contenido del documento: " + contenido);
    }
}

public class DocumentoProxy implements Documento {
    private DocumentoReal documentoReal;
    private String contenido;
    private boolean accesoPermitido;

    public DocumentoProxy(String contenido, boolean accesoPermitido) {
        this.contenido = contenido;
        this.accesoPermitido = accesoPermitido;
    }

    @Override
    public void mostrarContenido() {
        if (accesoPermitido) {
            if (documentoReal == null) {
                documentoReal = new DocumentoReal(contenido);
            }
            documentoReal.mostrarContenido();
        } else {
            System.out.println("Acceso denegado: No tienes permisos para ver este documento.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Documento documento1 = new DocumentoProxy("Documento confidencial", true);
        Documento documento2 = new DocumentoProxy("Documento público", false);

        System.out.println("Intentando acceder a documento 1:");
        documento1.mostrarContenido();

        System.out.println("Intentando acceder a documento 2:");
        documento2.mostrarContenido();
    }
}
