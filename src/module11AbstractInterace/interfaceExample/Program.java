package module11AbstractInterace.interfaceExample;

import java.util.List;

public class Program {
    private final AnimalProvider animalProvider;
    public Program(AnimalProvider animalProvider) {
        this.animalProvider = animalProvider;
    }

    public void runProgram(){
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
