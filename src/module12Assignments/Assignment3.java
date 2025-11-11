package module12Assignments;

public class Assignment3 {
    public static void main(String[] args) {
        FoodDish dish = new FoodDish("Pancakes");
        Ingredient iMilk = new Ingredient("Melk", 4, "dl");
        dish.addIngredient(iMilk);
        Ingredient iFlour = new Ingredient("Mel", 3, "dl");
        dish.addIngredient(iFlour);
        Ingredient iEgg = new Ingredient("Egg", 2, "stk");
        dish.addIngredient(iEgg);
        // Jeg trenger ikke egentlig å opprette en variabel for ingrediensene.
        // Jeg kan opprette ingrediens-objektet og kalle på metoden i samme slengen, slik:
        dish.addIngredient(new Ingredient("Salt", 0.5, "ts"));
        dish.printReceipe();
    }
}
