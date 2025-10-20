package module10inheritanceandassociation.cargoholdV3composition;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Her har vi løst innkapslingsproblemet ved å fjerne getteren som returnerer
        // Dimensions objektet fra Baggage objekt

        Baggage myBaggage = new Baggage(40,20,10,31);
        System.out.println("Bagasjens vekt er: " + myBaggage.getWeight());

        myBaggage.setWeight(120); // Prøver å endre vekten gjennom Baggage's setWeight metode
        System.out.println("Bagasjens vekt er: " + myBaggage.getWeight());

        // Denne snik koden vil ikke lenger fungere da vi har fjernet getDimensions() metoden
        // slik at det ikke lenger er mulig å få tak i Dimensions objektet fra Baggage objektet.

        //Dimensions baggageDimensions = myBaggage.getDimensions();
        //baggageDimensions.setWeight(100);
        //System.out.println("Bagasjens vekt er endret til: " + myBaggage.getWeight());

    }

}
