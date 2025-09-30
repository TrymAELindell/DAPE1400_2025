package module7arrays.PlaneV1;

public class PlaneV1 {
    private boolean[] seatsTaken;

    public PlaneV1(int nrOfSeats) {
        this.seatsTaken = new boolean[nrOfSeats];
    }

    public void setFreeSeatToTaken(int seatIndex) {
        if (!this.seatsTaken[seatIndex]) {
            this.seatsTaken[seatIndex] = true;
            System.out.println("Sete var ledig, du er blitt tildelt sete: " + seatIndex);
        } else {
            System.out.println("Sete er opptatt");
        }
    }
}
