package module11AbstractInterace.menti;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.print("Voff, voff!");
    }
}
