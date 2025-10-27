package module11AbstractInterace.interfaceExample;

public class Parrot extends Bird implements Flyable{
    public Parrot(String name, boolean foodProvider, double beakLength) {
        super(name, foodProvider, beakLength);
    }

    @Override
    public void makeSound() {
        System.out.println("I am a parrot!");
    }

    @Override
    public void fly() {
        System.out.println("I can fly when I am not i a cage.");
    }

    @Override
    public String toString() {
        return "Parrot{} " + super.toString();
    }
}
