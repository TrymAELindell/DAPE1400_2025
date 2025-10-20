package module10inheritanceandassociation.cargoholdV1inheritance;

public class Animal {
    private double length;
    private double height;
    private double width;
    private double weight;

    public Animal(double length, double height, double width, double weight) {
        this.length = length;
        this.height = height;
        this.width = width;
        this.weight = weight;
    }

    public double getVolume() {
        return length * height * width;
    }

    public double getWeight(){
        return weight;
    }

    public void makeSound() {
        System.out.println("");
    }
}
