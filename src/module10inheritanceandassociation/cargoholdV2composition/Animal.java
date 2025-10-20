package module10inheritanceandassociation.cargoholdV2composition;

public class Animal {
    private Dimensions dimensions;

    public Animal(double length, double height, double width, double weight) {
        if (length > 0 && height > 0 && width > 0 && weight > 0) {
            this.dimensions = new Dimensions(length, height, width, weight);
        } else {
            System.out.println("WARNING: dimensions must be positive double values");
        }
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public double getWeight() {
        return dimensions.getWeight();
    }

    public double getVolume() {
        return dimensions.getVolume();
    }
}
