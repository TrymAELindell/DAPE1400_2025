package module10inheritanceandassociation.cargoholdV2composition;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //
        // Composition vil si at vi setter sammen en klasse ved hjelp av andre klasser
        // Dette lar oss gjennbruke kode lettere enn arv tillatter.

        // Arv lar oss kun gjenbruke kode i sub klasser
        // Mens med composition  kan vi i stedet gjenbruke koden fritt
        // I denne versjonen av CargoHold har vi laget en klasse, Dimensions
        // som lagrer alle dimensjonene til en annen klasse.
        // Dette gjør at vi kan gjennbruke koden i Dimensions i hvilke klasse vi vill
        // Her har vi gjort dette ved å bytte utt attributtene i Animal med ett Dimension
        // objekt og vi har gjort det samme i Baggage klassen (denne er jo ikke en type animal såå
        // her ville det ikke gitt mening å gjøre den til en subklasse av Animal for å kunne gjennbruke koden i Animal)

        // Koden vil ellers fungere som tidligere

        ArrayList<Animal> animalCargo = new ArrayList<Animal>();
        animalCargo.add(new Cat(20,10,10,5));
        animalCargo.add(new Dog(40,30,20,15));
        animalCargo.add(new Parrot(20,10,10,3));

        ArrayList<Baggage> baggageCargo = new ArrayList<Baggage>();
        baggageCargo.add(new Baggage(110,20,30,30));
        baggageCargo.add(new Baggage(40,40,20,20));

        double totalCargoWeight = 0;
        double totalCargoVolume = 0;

        for (Animal animal : animalCargo) {
            totalCargoWeight += animal.getWeight();
            totalCargoVolume += animal.getVolume();
        }

        for (Baggage baggage : baggageCargo) {
            totalCargoWeight += baggage.getWeight();
            totalCargoVolume += baggage.getVolume();
        }

        System.out.println("Cargo hold contains a total weigth of " + totalCargoWeight + " kg");
        System.out.println("And holds a volume of " + totalCargoVolume + " cm3");

        // Implementasjonen vi har lage så langt har ett problem som gjør at vi bryter innkapslingsprinsippet
        // Dette problemet oppstår fordi Dimensions klassen er en referansetype
        // Dette gjør at når vi bruker  baggage.getDimensions(); for å hente ut dimensionene vil vi få tilgang til
        // dimensions objektet og dets metoder.
        // Da kan vi komme oss rundt setter metodene i Baggage klassen og kan sette weight høyere enn MAX_WEIGHT

        Baggage myBaggage = baggageCargo.get(0);
        System.out.println("Bagasjens vekt er: " + myBaggage.getWeight());

        myBaggage.setWeight(120); // Prøver å endre vekten gjennom Baggage's setWeight metode
        System.out.println("Bagasjens vekt er: " + myBaggage.getWeight());

        // Her sniker vi oss rundt Baggage's setWeight setter siden vi har tilgang til dimensions objektet
        // som tilhører myBaggage
        Dimensions baggageDimensions = myBaggage.getDimensions();
        baggageDimensions.setWeight(100);
        System.out.println("Bagasjens vekt er endret til: " + myBaggage.getWeight());

        // For å unngå dette må vi sørge for at objekter som brukes som attributter i en kompositt klasse
        // ikke returneres direkte. Man må i stedet enten wrappe metoden slik vi har gjort med Baggage's getWeight() metode
        // eller returnere en kopi av objektet
    }
}
