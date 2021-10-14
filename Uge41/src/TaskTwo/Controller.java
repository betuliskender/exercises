package TaskTwo;

public class Controller {

    Dialog dialog;
    CalculateVAT calculateVat;
    View view;

    public Controller() {
        this.dialog = new Dialog();
        this.calculateVat = new CalculateVAT();
        this.view = new View();
    }

    public void runController() {
        double userIn = dialog.doDiag();
        double moms = calculateVat.doVAT(userIn);
        view.doView(moms, ComputeVAT.MSG);
    }
}
