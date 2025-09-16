package module5classesandobjects2.airportticketsystemV5.ticketing;

import static module5classesandobjects2.airportticketsystemV5.pricing.Tax.*;


public class Receipt {
    private int ticketNr;
    private String paymentAccountNr;
    private double netPrice;
    private double VAT;
    private double passengerFee;
    private double totalPrice;


    public Receipt(String paymentAccountNr, double netPrice, int ticketNr) {
        this.paymentAccountNr = paymentAccountNr;
        this.netPrice = netPrice;
        this.VAT = computeVAT(netPrice);
        this.passengerFee = getPassengerFee();
        this.totalPrice = this.netPrice + this.VAT + this.passengerFee;
        this.ticketNr = ticketNr;
    }

    public void printReceipt() {
        System.out.println("\nKvittering for billet nummer: " + this.ticketNr);
        System.out.println("Betalingskonto: " + this.paymentAccountNr);
        System.out.println("Total pris: " + this.totalPrice);
        System.out.println("Herav");
        System.out.println("Billett: " + this.netPrice);
        System.out.println("Moms: " + this.VAT);
        System.out.println("Passasjeravgift: " + this.passengerFee);

    }
}
