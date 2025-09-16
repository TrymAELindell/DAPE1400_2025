package module5static.apartmentareacalculator.spaces;

public class Room {
    private double width;
    private double length;

    public Room (double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getArea() {
        return this.width * this.length;
    }
}
