package module11AbstractInterace.animalsv1;

import java.sql.SQLOutput;

public class Parrot extends Bird implements Flyable{
    public Parrot(String name, boolean foodProvider, double beakLength) {
        super(name, foodProvider, beakLength);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " wants a cracker");
    }

    @Override
    public void fly() {
        System.out.println("I am flying");
    }

    @Override
    public String toString() {
        return "Parrot{} " + super.toString();
    }
}
