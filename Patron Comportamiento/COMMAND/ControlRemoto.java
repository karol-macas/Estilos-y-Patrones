public class ControlRemoto {
    private Command comando; // El comando a ejecutar.

    public void setComando(Command comando) {
        this.comando = comando; // Asignar el comando.
    }

    public void presionarBoton() {
        comando.execute(); // Ejecutar el comando asignado.
    }
}