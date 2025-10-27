package module11AbstractInterace.menti;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.print(
                "Generic animal sound.");
    }
}