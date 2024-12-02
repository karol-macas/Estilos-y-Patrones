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