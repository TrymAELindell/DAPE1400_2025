package module10inheritanceandassociation.cargoholdV4aggregation;

public class Cat extends Animal{
    public Cat(double length, double height, double width, double weight) {
        super(length, height, width, weight);
    }

    public void makeSound() {
        System.out.println("Mjau!");
    }
}
