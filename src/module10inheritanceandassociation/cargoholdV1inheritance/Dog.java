package module10inheritanceandassociation.cargoholdV1inheritance;

public class Dog  extends Animal{
    public Dog (double length, double height, double width, double weight) {
        super(length, height, width, weight);
    }

    public void makeSound() {
        System.out.println("Voff!");
    }

    public void sniffOutTarget(String target){
        System.out.println(target + " scent found!");
    }
}
