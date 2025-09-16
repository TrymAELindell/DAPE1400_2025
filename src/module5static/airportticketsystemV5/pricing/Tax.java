package module5static.airportticketsystemV5.pricing;

public class Tax {
    private static double VAT = 0.25;
    private static double PASSENGER_FEE = 60;

    private Tax() {}

    public static double computeVAT(double preVATPrice) {
        return preVATPrice * VAT;
    }

    public static double getPassengerFee() {
        return PASSENGER_FEE;
    }


}
