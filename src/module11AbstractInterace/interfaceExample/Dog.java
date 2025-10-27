package module11AbstractInterace.interfaceExample;

public class Dog extends Mammal {

    private boolean canFetchNewsPaper;

    public Dog(String name, boolean foodProvider, int nrOfTeats, boolean canFetchNewsPaper) {
        super(name, foodProvider, nrOfTeats);
        this.canFetchNewsPaper = canFetchNewsPaper;
    }

    @Override
    public void makeSound() {
        System.out.println("Voff, voff!");
    }

    // Name is private. I have to use the getter
    public void fetchTheStick(){
        System.out.println(getName() + " fetching the stick you threw...");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "canFetchNewsPaper=" + canFetchNewsPaper +
                "} " + super.toString();
    }
}
