package module4classesandobjects1;

public class TicketV1 {
    String name;
    String destination;
    String personNr;

    public TicketV1 (String name, String personNr, String destination) {
        this.name = name;
        this.destination = destination;
        this.personNr = personNr;
    }

    public void printTicketInfo() {
        System.out.println("\nTicket");
        System.out.println("Name: " + this.name);
        System.out.println("PersonNr: " + this.personNr);
        System.out.println("Destination: " + this.destination);
    }
}
