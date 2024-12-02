public class Proyector {
    public void encender() {
        System.out.println("Proyector encendido.");
    }

    public void apagar() {
        System.out.println("Proyector apagado.");
    }
}

public class Luces {
    public void bajarIntensidad() {
        System.out.println("Luces bajadas al nivel adecuado para la película.");
    }

    public void restaurarIntensidad() {
        System.out.println("Luces restauradas a nivel normal.");
    }
}

public class SistemaDeSonido {
    public void configurarSonido() {
        System.out.println("Sonido configurado en modo cine.");
    }

    public void apagarSonido() {
        System.out.println("Sistema de sonido apagado.");
    }
}

public class ReproductorDeVideo {
    public void reproducirPelicula(String pelicula) {
        System.out.println("Reproduciendo la película: " + pelicula);
    }

    public void detenerReproduccion() {
        System.out.println("Reproducción detenida.");
    }
}
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
public class Main {
    public static void main(String[] args) {
        CineFacade cine = new CineFacade();

        System.out.println("Iniciando sesión de cine...");
        cine.comenzarPelicula("El Señor de los Anillos");

        System.out.println("\nTerminando sesión de cine...");
        cine.finalizarPelicula();
    }
}
