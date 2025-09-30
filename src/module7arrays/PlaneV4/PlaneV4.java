package module7arrays.PlaneV4;

public class PlaneV4 {
    private Seat[][] seats;

    public PlaneV4(int nrOfRows, int nrOfseatsPerRow) {
        this.seats = new Seat[nrOfRows][nrOfseatsPerRow];
    }

    public void setFreeSeatToTaken(String name) {
        for (int rowIndex = 0; rowIndex < seats.length; rowIndex ++) {
            for (int seatIndex = 0; seatIndex < seats[rowIndex].length; seatIndex++) {
                Seat seat = seats[rowIndex][seatIndex];
                if (seat == null) { // Siden arrays av ikke primitive datatyper opprettes som null kan vi sjekke om ett element er null for å finne ut om ett sete er ledig
                    System.out.println("\nSete funnet til " + name);
                    System.out.println("Rad: " +rowIndex);
                    System.out.println("Sete: " + seatIndex);
                    seats[rowIndex][seatIndex] = new Seat(name);
                    return; // return kan brukes til å bryte helt ut av en metode
                    // Dette kan fungere for å avslutte en loop, men da vil også ikke
                    // noe av den etterkommende koden utføres fordi vi hopper helt ut av metoden
                }
            }
        }
        System.out.println("Beklager, flyet er fullt");

    }
}
