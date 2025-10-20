package module10inheritanceandassociation.cargoholdV0;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Implementasjonen av CargoHoldV0 har flere problemer som gjør koden litt upraktisk
        // Både Cat, Dog og Parrot klassene har flere av de samme atributtene og metodene.
        // Det blir dermed mye jobb å skrive om igjen den samme koden igjen og igjen.
        // Det blir også tungvint om vi skulle måtte gjøre endringer på disse atributtene eller metodene
        // fordi det blir mange forskjellige steder vi må endre den samme koden.
        // Dette kan vi løse med arv (inheritance) slik at vi kan gjennbruke koden som er lik mellom
        // klassene

        // Ett annet problem er at vi nå også trenger forskjellige lister for å lagre de forskjellige type dyrene
        // Dette er jo litt upraktisk, det hadde vært bedre om vi kunne lagre
        // alle i en liste. Nå ville programmet vårt for eksempel skalere dårlig da vi må lage en ny
        // liste for hver ny dyretype vi legger til. Dette blir fort rotete.
        // Men vi kan løse dette med Arv også!

        ArrayList<Dog> dogCargo = new ArrayList<Dog>();
        dogCargo.add(new Dog(10,20,30,10));
        dogCargo.add(new Dog(20,5,10,20));

        ArrayList<Cat> catCargo = new ArrayList<Cat>();
        catCargo.add(new Cat(30,20,10,5));

        ArrayList<Parrot> parrotCargo = new ArrayList<Parrot>();
        parrotCargo.add(new Parrot(10,4,4,2));

        double totalPetCargoWeight = 0;
        double totalPetCargoVolume = 0;

        for (Dog dog : dogCargo) {
            totalPetCargoWeight += dog.getWeigth();
            totalPetCargoVolume += dog.getVolume();
        }

        for (Cat cat : catCargo) {
            totalPetCargoWeight += cat.getWeigth();
            totalPetCargoVolume += cat.getVolume();
        }

        for (Parrot parrot : parrotCargo) {
            totalPetCargoWeight += parrot.getWeigth();
            totalPetCargoVolume += parrot.getVolume();
        }

        System.out.println("Pet cargo hold contains a total weigth of " + totalPetCargoWeight + " kg");
        System.out.println("And holds a volume of " + totalPetCargoVolume + " cm3");







    }
}
