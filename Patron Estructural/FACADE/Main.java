public class Main {
    public static void main(String[] args) {
        CineFacade cine = new CineFacade();

        System.out.println("Iniciando sesión de cine...");
        cine.comenzarPelicula("El Señor de los Anillos");

        System.out.println("\nTerminando sesión de cine...");
        cine.finalizarPelicula();
    }
}
