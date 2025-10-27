package module11AbstractInterace.interfaceExample;

public abstract class Animal {
    private String name;
    private boolean foodProvider;

    public String getName() {
        return name;
    }

    public boolean isFoodProvider() {
        return foodProvider;
    }

    public Animal(String name, boolean foodProvider) {
        this.name = name;
        this.foodProvider = foodProvider;
    }

    public abstract void makeSound();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", foodProvider=" + foodProvider +
                '}';
    }
}