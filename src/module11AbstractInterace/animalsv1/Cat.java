package module11AbstractInterace.animalsv1;

public class Cat extends Mammal {
    private String favouriteFood;

    public Cat(String name, boolean foodProvider, int nrOfTeats, String favouriteFood) {
        super(name, foodProvider, nrOfTeats);
        this.favouriteFood = favouriteFood;
    }

    @Override
    public void makeSound() {
        System.out.println("Miaaaau!");
    }

    // Name is private. I have to use the getter
    public void blockViewToScreen(){
        System.out.println("Me, " + getName() + " is now blocking your screen");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "favouriteFood='" + favouriteFood + '\'' +
                "} " + super.toString();
    }
}
