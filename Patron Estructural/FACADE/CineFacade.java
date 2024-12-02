public class CineFacade {
    private Proyector proyector;
    private Luces luces;
    private SistemaDeSonido sonido;
    private ReproductorDeVideo reproductor;

    public CineFacade() {
        this.proyector = new Proyector();
        this.luces = new Luces();
        this.sonido = new SistemaDeSonido();
        this.reproductor = new ReproductorDeVideo();
    }

    public void comenzarPelicula(String pelicula) {
        System.out.println("Preparando el cine para la película...");
        luces.bajarIntensidad();
        proyector.encender();
        sonido.configurarSonido();
        reproductor.reproducirPelicula(pelicula);
        System.out.println("¡Disfruta la película!");
    }

    public void finalizarPelicula() {
        System.out.println("Finalizando la experiencia de cine...");
        reproductor.detenerReproduccion();
        proyector.apagar();
        sonido.apagarSonido();
        luces.restaurarIntensidad();
        System.out.println("¡Gracias por visitar el cine!");
    }
}