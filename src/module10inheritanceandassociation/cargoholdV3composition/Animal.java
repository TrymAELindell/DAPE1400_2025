package module10inheritanceandassociation.cargoholdV3composition;


public class Animal {
    private Dimensions dimensions;

    public Animal(double length, double height, double width, double weight) {
        if (length > 0 && height > 0 && width > 0 && weight > 0) {
            this.dimensions = new Dimensions(length, height, width, weight);
        } else {
            System.out.println("WARNING: dimensions must be positive double values");
        }
    }

    // Vi tillatter ikke getters som henter ut objekt attributter
    // Da dette bryter innkasplingen og gjør at man kan komme seg rundt
    // sikkerhetsmekanismene vi har laget i setterne våre
    // public Dimensions getDimensions() {return this.dimensions;}

    public double getWeight() {
        return dimensions.getWeight();
    }

    public double getVolume() {
        return dimensions.getVolume();
    }
}
