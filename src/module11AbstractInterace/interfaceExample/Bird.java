package module11AbstractInterace.interfaceExample;

public abstract class Bird extends Animal {
    private double beakLength;

    public Bird(String name, boolean foodProvider, double beakLength) {
        super(name, foodProvider);
        this.beakLength = beakLength;
    }

    public double getBeakLength() {
        return beakLength;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "beakLength=" + beakLength +
                "} " + super.toString();
    }
}
