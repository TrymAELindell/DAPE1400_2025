package module8arrays2collections.staticexample;





public class Plane {
    // Denne varianten av Plane klassen har en rolle.
    // Den holder styr på om setene i flyet er opptatt eller ikke.
    // I motsetning til tidligere implementasjoner har vi ikke en metode for å finne ledige seter
    // Den funksjonen har vi i stedet lagt i en egen klasse SeatBooker.
    private boolean[] seatsTaken;

    public Plane(int nrOfSeats) {
        this.seatsTaken = new boolean[nrOfSeats];
    }

    public boolean setSeatToTaken(int seatIndex) {
        // Setter som returner en boolean slik at vi vet om forsøket på å sette ett ledig setet var vellykket eller ikke.
        // Kontrolstruktur som sjekker om setet er ledig eller ikke
        if (this.seatsTaken[seatIndex] == false) {
            this.seatsTaken[seatIndex] = true;
            return true;
        } else {
            return false;
        }
    }

    public int getNrOfSeats() {
        // Getter som henter antall seter i flyet slik at SeatBooker kan loope igjennom setene
        return this.seatsTaken.length;
    }


}
