package module10inheritanceandassociation.cargoholdV3composition;

public class Dimensions {
    private double length;
    private double height;
    private double width;
    private double weight;

    public Dimensions(double length, double height, double width, double weight) {
        this.length = length;
        this.height = height;
        this.width = width;
        this.weight = weight;
    }

    public double getVolume() {
        return length * height * width;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
