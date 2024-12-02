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