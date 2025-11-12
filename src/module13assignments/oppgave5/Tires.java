package module13assignments.oppgave5;


public class Tires {
    private String type;
    private double wearPercentage;

    public Tires (String type, double wearPercentage) {
        if (type.equals("winter") || type.equals("summer")) {
            this.type = type;
        } else {
            System.out.println("Tire type is invalid, must be summer or winter");
        }

        this.setWearPercentage(wearPercentage);


    }

    public void setWearPercentage(double wearPercentage) {
        if (wearPercentage < 0) {
            System.out.println("Warning: invalid wear percentage, must be 0 or larger. Wear set to 0");
            this.wearPercentage = 0;
        } else if (wearPercentage >= 100) {
            System.out.println("Warning: Wear is too high! Tires are broekn");
            this.wearPercentage = 100;
        } else {
            this.wearPercentage = wearPercentage;
        }
    }

    public double getWearPercentage(){
        return this.wearPercentage;
    }

    public String getType() {
        return this.type;
    }
}