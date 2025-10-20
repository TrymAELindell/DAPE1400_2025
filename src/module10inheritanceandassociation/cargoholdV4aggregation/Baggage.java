package module10inheritanceandassociation.cargoholdV4aggregation;


public class Baggage {
    private final double MAX_WEIGHT = 20; // kg
    private Dimensions dimensions;

    public Baggage(double length, double height, double width, double weight) {
        if (weight <= MAX_WEIGHT) {
            this.dimensions = new Dimensions(length, height, width, weight);
        } else {
            System.out.println("Maks vekt er oversteget. Fjern noe av innholdet i bagasjen");
        }

    }

    public double getWeight() {
       return this.dimensions.getWeigth();
    }

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
