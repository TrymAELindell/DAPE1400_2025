package module12Assignments;

import java.util.ArrayList;

public class FoodDish {
    private String name;
    private ArrayList<Ingredient> ingredients;
    private static int dishesServed = 0;

    public FoodDish(String name){
        this.name = name;
        ingredients = new ArrayList<>();
    }

    public void addIngredient(Ingredient ingredient){
        ingredients.add(ingredient);
    }

    public void printReceipe(){
        for (Ingredient ingredient : ingredients) {
            System.out.println(ingredient);
        }
    }

    public void serveDish(){
        dishesServed++;
    }
}
