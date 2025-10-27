package module11AbstractInterace.menti;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.print("Miaaaau!");
    }
}
