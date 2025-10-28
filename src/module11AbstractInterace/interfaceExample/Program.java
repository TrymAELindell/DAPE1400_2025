package module11AbstractInterace.interfaceExample;

import java.util.List;

public class Program {
    /*
    Look! We have a dependency to an interface, and not a concrete class.
    This is a looser coupling than a dependency to a concrete class.
     */
    private final AnimalProvider animalProvider;
    public Program(AnimalProvider animalProvider) {
        this.animalProvider = animalProvider;
    }

    public void runProgram(){
        /*
        This is what we need the animal provider for. We need a list of animals.
        We do not care about the implementation details. Just give me some animals.
        Also notice that we use the List (interface) and not the implementation (i.e ArrayList).
        We do not care about the details. We only need what is promised by the List interface.
         */
        List<Animal> animals = animalProvider.getAnimals();
        System.out.println("Here are all the " + animals.size() + " animals:");
        for (Animal animal : animals) {
            System.out.println(animal);
        }
        System.out.println("---------");
        System.out.println("Name of food providers:");
        for (Animal animal : animals) {
            if(animal.isFoodProvider()){
                System.out.println(animal.getName());
            }
        }
        System.out.println("---------");
        System.out.println("All these animals can fly:");
        for (Animal animal : animals) {
            if(animal instanceof Flyable){
                System.out.println(animal.getName());
            }
        }
        System.out.println("Program done. Bye :)");
    }
}
