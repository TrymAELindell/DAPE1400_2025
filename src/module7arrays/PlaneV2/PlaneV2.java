package module7arrays.PlaneV2;

public class PlaneV2 {
    private boolean[] seatsTaken;

    public PlaneV2(int nrOfSeats) {

        this.seatsTaken = new boolean[nrOfSeats];
    }

    public void setFreeSeatToTaken() {
        boolean seatFound = false;
        for (int seatIndex = 0; seatIndex < seatsTaken.length; seatIndex ++) {
            if (!seatsTaken[seatIndex]) {
                seatsTaken[seatIndex] = true;
                seatFound = true;
                System.out.println("Ledig sete funnet, ditt sete nr er: " + seatIndex);
                break; // Siden vi ikke vil sjekke resten av setene når vi har funnet ett som er ledig bruker vi break til å avslutte loopen
            }
        }
        if (!seatFound) {
            System.out.println("Beklager, flyet er fullt. Ingen ledige seter funnet");
        }

    }
}
