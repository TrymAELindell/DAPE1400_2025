package module8arrays2collections.staticexample;

public class SeatBooker {

    public static boolean bookSeatInPlane(Plane plane) {
        // Siden bookSeatInPlane metoden kun utfører operasjoner og logikk på input parameter (plane)
        // Kan den være statisk slik at vi ikke trenger å opprette objekter av klassen for å få tilgang til metodene
        for (int seatNr = 0; seatNr < plane.getNrOfSeats(); seatNr ++) {
            if (plane.setSeatToTaken(seatNr)){
                return true;
            }
        }
        return false;
    }
}
