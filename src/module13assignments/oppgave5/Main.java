package module13assignments.oppgave5;


public class Main {
    public static void main(String[] args) {

        Car janice = new Car(3,5,"winter", 10);

        // Dette skal ikke gå ann om man bruker composition riktig!
        // Dekkene som ligger i bil objekter skal ikke kunne senke wearPercentage
        // Men fordi vi har laget en getter som bryter inkapslingsprinsippene som krever
        // av composition sniker vi oss rundt kontrollmekanismene i Car klassen
        Tires tires = janice.getTires();
        tires.setWearPercentage(0);

        // Korrekt getters ville heller da hente ut atributtene til tires i stedet for tire objektet
        System.out.println("Tire type " + janice.getTireType());
        System.out.println("Tire wear percentage " + janice.getTireWear());

        // Setteren for å endre på tires i Car objektet vil i stedet
        // lage ett nytt Tire objekt i Car objektet

        janice.changeTires("summer", 0);

        double[] newPosition = new double[2];
        janice.move(newPosition);
        System.out.println("Tire type " + janice.getTireType());
        System.out.println("Tire wear percentage " + janice.getTireWear());

    }
}
