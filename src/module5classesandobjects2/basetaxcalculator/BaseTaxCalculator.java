package module5classesandobjects2.basetaxcalculator;

public class BaseTaxCalculator {
    public static double calculateBaseTax(double income) {
        double freeCardTreshold = 100_000;

        // om inntekt er under frikort grensen betaler man ikke skatt
        if (income < freeCardTreshold) {
            return 0.0;
        } else {
            // Inntekt over frikort grensen skatte
            // Vi regner først ut skattbar del av inntekt
            double taxable = income - freeCardTreshold;
            // så hvor mye skatt som skal betales
            double tax = taxable * 0.22;
            return tax; //
        }
    }
}
