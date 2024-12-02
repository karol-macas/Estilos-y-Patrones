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
