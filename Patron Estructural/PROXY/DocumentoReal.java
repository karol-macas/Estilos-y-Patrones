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
