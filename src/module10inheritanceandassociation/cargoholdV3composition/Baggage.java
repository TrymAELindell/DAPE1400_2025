package module10inheritanceandassociation.cargoholdV3composition;



public class Baggage {

    private final double MAX_WEIGHT = 32; // kg

    private Dimensions dimensions;

    public Baggage(double length, double height, double width, double weight) {
        if (weight <= MAX_WEIGHT) {
            this.dimensions = new Dimensions(length, height, width, weight);
        } else {
            System.out.println("Maks vekt er oversteget. Fjern noe av innholdet i bagasjen");
        }

    }

    // Vi tillatter ikke getters som henter ut objekt attributter
    // Da dette bryter innkasplingen og gjør at man kan komme seg rundt
    // sikkerhetsmekanismene vi har laget i setterne våre
    // public Dimensions getDimensions() {return this.dimensions;}

    public double getWeight() {
        return this.dimensions.getWeight();
    }
    public double getVolume() { return this.dimensions.getVolume();}

    public boolean setWeight(double newWeight) {
        if (newWeight <= this.MAX_WEIGHT) {
            this.dimensions.setWeight(newWeight);
            return true;
        } else {
            System.out.println("Den nye vektet var over max vekt grensen");
            return false;
        }

    }
}
