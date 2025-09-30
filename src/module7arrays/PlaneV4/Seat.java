package module7arrays.PlaneV4;

public class Seat {
    private String passengerName;
    private boolean taken;

    public Seat(String name) {
        this.passengerName = name;
        this.taken = true;
    }

    public boolean getTaken() {
        return this.taken;
    }
}
