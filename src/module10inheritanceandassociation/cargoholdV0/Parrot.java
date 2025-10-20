package module10inheritanceandassociation.cargoholdV0;

public class Parrot {
    private double length;
    private double height;
    private double width;
    private double weight;

    public Parrot(double length, double height, double width, double weight) {
        this.length = length;
        this.height = height;
        this.width = width;
        this.weight = weight;
    }

    public double getVolume() {
        return length * height * width;
    }

    public double getWeigth(){
        return weight;
    }

    public void makeSound() {
        System.out.println("Squak!");
    }
}
