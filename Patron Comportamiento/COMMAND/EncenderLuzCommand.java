
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