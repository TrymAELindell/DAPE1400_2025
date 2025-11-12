package module13assignments.oppgave5;


public class Car {
    private double[] position;
    private Tires tires;

    public Car(double x, double y, String type, double wearPercentage) {
        this.position = new double[2];
        this.position[0] = x;
        this.position[1] = y;
        this.tires = new Tires(type, wearPercentage);

    }

    public Tires getTires(){
        // Dette er en feil implementsjon av en getter for Tires om vi skal bruke composition
        // Det vil nå være mulig å ta ut Tires objektet fra Car objektet slik at Tires kan eksistere
        // uavhengig av Car objektet. Dette er ikke lov innen composition da alle del objekten(Tires)) kun skal
        // kunne eksistere som deler av kompositt objektet(Car)
        // I stedet måtte vi returnet en kopi av Tires objektet eller lage getters for hver av attributtene til Tires objektet
        // i Car objektet
        // Om vi ikke gjør dette vil man kunne komme ser rundt restriksjonene
        // vi har lagt inn i Car klassen for hvordan vi skal kunne endre på Tires sine attributter
        // Vi kunne feks finne på senke wearPercentage via tires objektet
        // Noe vi ikke kan gjøre gjennom Car objekter.
        // Car objekter kan i stedete kunn øke wearPercentage, noe som skjer når
        // vi kaller move metoden
        return this.tires;
    }

    public double getTireWear(){
        return this.tires.getWearPercentage();
    }

    public String getTireType(){
        return this.tires.getType();
    }

    public void changeTires(String type, double wearPercentage) {
        this.tires = new Tires(type, wearPercentage);
    }



    public void move(double[] position) {
        // Sjekker om bilen kan bevege seg (dekkene er ikke utslitt)
        // og sliter dekkene 10% om bilen beveger seg
        if (this.tires.getWearPercentage() < 100) {
            if (this.position[0] != position[0] || this.position[1] != position[1]){
                double tireWear = this.tires.getWearPercentage();
                tireWear += 10; // sliter dekket 10 % når bilen beveger seg
                this.tires.setWearPercentage(tireWear);

                this.position[0] = position[0];
                this.position[1] = position[1];
            }

        } else {
            System.out.println("Tires are broken, car can't move");
        }
    }
}
