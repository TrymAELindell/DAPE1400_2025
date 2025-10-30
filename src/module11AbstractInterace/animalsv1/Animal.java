package module11AbstractInterace.animalsv1;

public abstract class Animal {
    private String name;
    private boolean foodProvider;

    public String getName() {
        return name;
    }

    public Animal(String name, boolean foodProvider) {
        this.name = name;
        this.foodProvider = foodProvider;
    }

    public boolean isFoodProvider() {
        return foodProvider;
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