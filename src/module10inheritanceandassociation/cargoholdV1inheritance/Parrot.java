package module10inheritanceandassociation.cargoholdV1inheritance;

public class Parrot extends Animal {
    public Parrot (double length, double height, double width, double weight) {
        super(length, height, width, weight);
    }

    public void makeSound() {
        System.out.println("Squak!");
    }

    public void askForBidcuit(){
        makeSound();
        System.out.println("Can I have a biscuit?");
    }

}
