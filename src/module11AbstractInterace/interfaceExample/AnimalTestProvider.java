package module11AbstractInterace.interfaceExample;

import java.util.ArrayList;
import java.util.List;

public class AnimalTestProvider implements AnimalProvider{
    @Override
    public List<Animal> getAnimals() {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Passop", false, 8, true));
        animals.add(new Dog("Fido", false, 8, false));
        animals.add(new Dog("Enya", true, 10, false));
        animals.add(new Cat("Mia", true, 10, "Royal Canin"));
        animals.add(new Cat("Kitty", true, 8, "Fish"));
        animals.add(new Parrot("Stian", false, 2.0));
        animals.add(new Parrot("Ida", true, 4.0));
        return animals;
    }
}
