package module5classesandobjects2.airplanetickettaxcalculator.pricing;

public class Tax {
    private static double passengerFee = 60;
    public static double computeVAT(double price) {
        return price * 0.25;
    }
    public static double getPassengerFee() {
        return passengerFee;
    }
    public static double computeFullTicketPrice(double price ) {
        double VAT = computeVAT(price);
        return price + VAT + passengerFee;
    }
}


