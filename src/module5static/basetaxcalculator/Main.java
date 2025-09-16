package module5static.basetaxcalculator;
import static javax.swing.JOptionPane.*;

public class Main {
    public static void main(String[] args) {
        double netIncome = 150_000;
        double tax = BaseTaxCalculator.calculateBaseTax(netIncome);
        showMessageDialog(null,
                "Du må betale " + tax + " kr i grunnskatt");

    }
}
