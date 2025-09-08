package module4classesandobjects1;

public class TicketV2 {
    private String name;
    private String destination;
    private String personNr;

    public TicketV2 (String name, String personNr, String destination) {
        if (personNr.length() == 11) {
            this.name = name;
            this.destination = destination;
            this.personNr = personNr;
        } else {
            System.out.println("Warning: Fødselsnr hadde feil lenge.\n Billett ble ikke opprettet");

        }
    }
    public void setPassengerInfo(String name, String personNr) {
        if (personNr.length() == 11) {
            this.name = name;
            this.personNr = personNr;
        } else {
            System.out.println("Warning: Fødselnr hadde feil lengde. \n Passasjer detaljer ble ikke endret");
        }
    }

    public String getDestination() {
        return this.destination;
    }

    public void printTicketInfo() {
        System.out.println("\nTicket");
        System.out.println("Name: " + this.name);
        System.out.println("PersonNr: " + this.personNr);
        System.out.println("Destination: " + this.destination);
    }
}
