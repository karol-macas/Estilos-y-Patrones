public interface Command {
    void execute(); // Método que ejecuta el comando.
}
public class Luz {
    public void encender() {
        System.out.println("La luz está encendida.");
    }

    public void apagar() {
        System.out.println("La luz está apagada.");
    }
}
public class EncenderLuzCommand implements Command {
    private Luz luz;

    public EncenderLuzCommand(Luz luz) {
        this.luz = luz;
    }

    @Override
    public void execute() {
        luz.encender(); // Llama al método del receptor.
    }
}

public class ApagarLuzCommand implements Command {
    private Luz luz;

    public ApagarLuzCommand(Luz luz) {
        this.luz = luz;
    }

    @Override
    public void execute() {
        luz.apagar(); // Llama al método del receptor.
    }
}
public class ControlRemoto {
    private Command comando; // El comando a ejecutar.

    public void setComando(Command comando) {
        this.comando = comando; // Asignar el comando.
    }

    public void presionarBoton() {
        comando.execute(); // Ejecutar el comando asignado.
    }
}
public class Main {
    public static void main(String[] args) {
        // Receptor (Luz)
        Luz luz = new Luz();

        // Comandos concretos
        Command encender = new EncenderLuzCommand(luz);
        Command apagar = new ApagarLuzCommand(luz);

        // Invocador (Control remoto)
        ControlRemoto control = new ControlRemoto();

        // Asignar y ejecutar el comando para encender la luz
        System.out.println("Presionando botón para encender la luz:");
        control.setComando(encender);
        control.presionarBoton();

        // Asignar y ejecutar el comando para apagar la luz
        System.out.println("\nPresionando botón para apagar la luz:");
        control.setComando(apagar);
        control.presionarBoton();
    }
}
