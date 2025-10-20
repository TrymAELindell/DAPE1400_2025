package module10inheritanceandassociation.cargoholdV4aggregation;

public class Animal {
    private Dimensions dimensions;

    public Animal(double length, double height, double width, double weight) {
        this.dimensions = new Dimensions(length, height, width, weight);
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public double getWeigth(){
        return dimensions.getWeigth();
    }

}
