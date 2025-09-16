package module5static.airportticketsystemV4;

public class TicketV4 {
    private int ticketNr; // attribut som vil tilhøre instanser (objekter) av klassen
    private static int nrOfTicketsPrinted = 0; // statisk variabel som tilhører klassen og er tilgjengelig på tvers av instanser(objekter)

    public TicketV4 () {
        nrOfTicketsPrinted ++; // øker den statiske attributten nrOfTicketsPrinted med 1
        this.ticketNr = nrOfTicketsPrinted; // kopierer verdien til nrOfTicketsPrinted inn i this.ticketnr
    }
}
