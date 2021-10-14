package TaskTwo;

public class CalculateVAT {

    public double doVAT(double number){
        double VAT = number / 100 * ComputeVAT.PRCVAT;
        return VAT;
    }
}
