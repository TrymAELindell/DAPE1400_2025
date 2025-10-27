package module11AbstractInterace.interfaceExample;

public abstract class Mammal extends Animal{
    private int nrOfTeats;

    public Mammal(String name, boolean foodProvider, int nrOfTeats) {
        super(name, foodProvider);
        this.nrOfTeats = nrOfTeats;
    }

    public void feedBaby(){
        if(isFoodProvider()){
            System.out.println("Providing milk for my baby through one of my " + nrOfTeats + " teats.");
        } else{
            System.out.println("Unable to provide milk for baby.");
        }
    }

    public int getNrOfTeats() {
        return nrOfTeats;
    }
}
