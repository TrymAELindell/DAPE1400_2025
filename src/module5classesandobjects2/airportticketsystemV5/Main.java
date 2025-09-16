package module5classesandobjects2.airportticketsystemV5;

import module5classesandobjects2.airportticketsystemV5.ticketing.Purchase;


public class Main {
    public static void main(String[] args) {

        Purchase purchase1 = new Purchase();

        purchase1.issueTicket();
        purchase1.issueReceipt();

        purchase1.issueTicket();

        Purchase purchase2 = new Purchase();

        purchase2.issueTicket();
        purchase2.issueReceipt();

        purchase2.issueTicket();


    }
}
