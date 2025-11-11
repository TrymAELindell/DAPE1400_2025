package module12Assignments;

public class Ingredient {
    private String name;
    private double amount;
    private String unit;

    public Ingredient(String name, double amount, String unit) {
        this.name = name;
        this.amount = amount;
        this.unit = unit;
    }

    @Override
    public String toString(){
        return amount + " " + unit + " " + name;
    }

}
