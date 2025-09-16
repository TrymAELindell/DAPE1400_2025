package module5static.airplanetickettaxcalculator;

import static javax.swing.JOptionPane.*;
import static module5static.airplanetickettaxcalculator.pricing.Tax.*;

public class Main {
    public static void main(String[] args) {
        // Programmet er utvidet i forhold til live kodingen slik at det også tar bruker innput
        // Merk hvordan vi kan importere metodene til Tax klassen på samme måte som vi importerer metodene
        // til JOptionPane (linje 1 og 2)

        // Vi tar først brukerinput
        String netTicketPriceInput = showInputDialog("Hva koster billet før skatt og avgifter?");
        double netTicketPrice;
        try {
            netTicketPrice = Double.parseDouble(netTicketPriceInput);
        } catch (Exception e) {
            netTicketPrice = 0;
            showMessageDialog(null, "Pris må være ett tall");
        }

        // Her brukes metodene fra Tax klassen uten at vi trenger ett tax objekt.
        // Dette er kun mulig fordi metodene er erklært med static nøkkelordet (se Tax klassen i pricing pakken)
        double fullPrice = computeFullTicketPrice(netTicketPrice);
        double vat = computeVAT(netTicketPrice);
        double passengerFee = getPassengerFee();

        // Her printes resultatene av skatteutregning ut
        showMessageDialog(null, "Full pris på billet er: " + fullPrice + "kr"
                                                        + "\nNet pris: " + netTicketPrice
                                                        + "\nMoms: " + vat
                                                        + "\nPassasjeravgift: " + passengerFee
        );
    }
}
