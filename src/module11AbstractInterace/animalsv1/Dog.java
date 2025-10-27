package module11AbstractInterace.animalsv1;

public class Dog extends Animal {

    private boolean canFetchNewsPaper;

    public Dog(String name, boolean foodProvider, boolean canFetchNewsPaper) {
        super(name, foodProvider);
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
