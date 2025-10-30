package module11AbstractInterace.animalsv1;

public abstract class Mammal extends Animal{
    private int nrOfTeats;

    public Mammal(String name, boolean foodProvider, int nrOfTeats) {
        super(name, foodProvider);
        this.nrOfTeats = nrOfTeats;
    }

    public int getNrOfTeats() {
        return nrOfTeats;
    }

    public void feedBaby(){
        if(isFoodProvider()){
            System.out.println("Providing food for my baby " +
                    "through one of my " + nrOfTeats + " teats.");
        }else{
            System.out.println("Not a food provider...");
        }

    }

    @Override
    public String toString() {
        return "Mammal{" +
                "nrOfTeats=" + nrOfTeats +
                "} " + super.toString();
    }
}
