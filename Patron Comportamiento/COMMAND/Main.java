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

