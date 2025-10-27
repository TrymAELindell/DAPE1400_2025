package module11AbstractInterace.interfaceExample;

import java.util.ArrayList;
import java.util.List;
import static javax.swing.JOptionPane.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class AnimaUserProvider implements AnimalProvider{
    @Override
    public List<Animal> getAnimals() {
        List<Animal> animals = new ArrayList<>();
        String userChoice = "";
        do {
            userChoice = showInputDialog("Bird (P) Cat (C) or Dog (D). Q = quit").toLowerCase();
            switch (userChoice){
                case "p" -> animals.add(createParrot());
                case "c" -> animals.add(createCat());
                case "d" -> animals.add(createDog());
            }
        } while(!userChoice.equalsIgnoreCase("q"));
        return animals;
    }

    private Animal createDog() {
        String name = showInputDialog("Name:");
        boolean foodProvider = getBooleanInput("Food provider?");
        int nrOfTeats = getNonNegativeIntegerInput("How many teats?");
        boolean canFetchNewspaper = getBooleanInput("Can fetch newspaper?");
        return new Dog(name, foodProvider, nrOfTeats, canFetchNewspaper);
    }

    private Animal createCat() {
        String name = showInputDialog("Name:");
        boolean foodProvider = getBooleanInput("Food provider?");
        int nrOfTeats = getNonNegativeIntegerInput("How many teats?");
        String favouriteFood = showInputDialog("Favourite food:");
        return new Cat(name, foodProvider, nrOfTeats, favouriteFood);
    }

    private Animal createParrot() {
        String name = showInputDialog("Name:");
        boolean foodProvider = getBooleanInput("Food provider?");
        double beakLength = getPositiveDoubleInput("Beak length:");
        return new Parrot(name, foodProvider, beakLength);
    }

    private double getPositiveDoubleInput(String prompt) {
        double doubleValue = 0.0;
        do {
            String input = showInputDialog(prompt).toLowerCase();
            try{
                doubleValue = Double.parseDouble(input);
            }catch(NumberFormatException nfe){
                showMessageDialog(null, "Please enter a valid double");
            }
            if(doubleValue<=0){
                showMessageDialog(null, "Please enter a double greater than 0");
            }
        } while (doubleValue<0);
        return doubleValue;
    }

    private int getNonNegativeIntegerInput(String prompt) {
        int integerValue = -1;
        do {
            String input = showInputDialog(prompt).toLowerCase();
            try{
                integerValue = Integer.parseInt(input);
            }catch(NumberFormatException nfe){
                showMessageDialog(null, "Please enter a valid integer");
            }
            if(integerValue<0){
                showMessageDialog(null, "Please enter an integer greater than 0");
            }
        } while (integerValue<0);
        return integerValue;
    }

    private boolean getBooleanInput(String prompt){
        String input = "";
        do {
            input = showInputDialog(prompt + " (Y/N)").toLowerCase();
        } while (!input.equals("y")&&!input.equals("n"));
        return input.equals("y");
    }
}
