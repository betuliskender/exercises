package TaskTwo;

public class View {
    public void doView(double result, String typeOfResult){
        System.out.printf("Du betaler %.2f%3s i %s%n",result,ComputeVAT.CURRENCY, ComputeVAT.MSG);
    }
}
