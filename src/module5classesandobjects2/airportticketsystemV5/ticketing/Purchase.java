package module5classesandobjects2.airportticketsystemV5.ticketing;

import static javax.swing.JOptionPane.showInputDialog;

public class Purchase {
    private Ticket ticket;
    private Receipt receipt;
    private boolean ticketIssued;


    public Purchase() {

        String passengerName = showInputDialog("Passasjer Navn");
        String passengerPersonNr = showInputDialog("Passasjer PersonNr");
        String destination = showInputDialog("Destinasjon");
        String paymentAccountNr = showInputDialog("Betalings konto");

        double price;
        try {
            price = Double.parseDouble(showInputDialog("Pris"));
        } catch (Exception e) {
            price = 0;
        }

        this.ticket = new Ticket(passengerName, passengerPersonNr, destination);
        this.receipt = new Receipt(paymentAccountNr, price, ticket.getTicketNumber());
    }

    public void issueTicket() {
        if (!this.ticketIssued) {
            this.ticket.printTicketInfo();
            this.ticketIssued = true;
        } else {
            System.out.println("\nBillett " + ticket.getTicketNumber() + " har allerede blitt printet");
        }
    }

    public void issueReceipt() {
        this.receipt.printReceipt();
    }
}
