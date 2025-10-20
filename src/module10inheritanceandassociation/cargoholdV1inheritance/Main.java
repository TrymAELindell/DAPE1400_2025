package module10inheritanceandassociation.cargoholdV1inheritance;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // I denne versjonen av CargoHold bruker vi arv til å unngå å skrive
        // den samme koden om igjen når vi implementerer forskjellige dyre klasser
        // Vi samler alle de felles metodene og atributtene i superklassen Animal
        // fordi katter, hunder og papegøyer alle er eksempler av dyr.
        // Dette gjør at vi kan gjennbruke både attributtene og metodene som finnes i animal
        // uten å måtte skrive denne koden om igjen.



        // Fordi alle dyretypene våre er versjoner av super klassen Animal
        // kan de lagres i en ArrayList initialisert til å holde Animal typen
        ArrayList<Animal> animalCargoHold = new ArrayList<Animal>();

        animalCargoHold.add(new Dog(70,40,30, 35));
        animalCargoHold.add(new Cat(40,25,20, 10));
        animalCargoHold.add(new Parrot(20,10,10, 3));

        // Koden fra main i versjon 0 er nå forenklet drastisk da vi kunn trenger en liste
        // og dermed også bare en loop for å finne det totale volument og vekten
        double totalPetCargoWeight = 0;
        double totalPetCargoVolume = 0;

        for (Animal animal : animalCargoHold) {
            totalPetCargoWeight += animal.getWeight();
            totalPetCargoVolume += animal.getVolume();
        }

        System.out.println("Pet cargo hold contains a total weigth of " + totalPetCargoWeight + " kg");
        System.out.println("And holds a volume of " + totalPetCargoVolume + " cm3");


        // Eksempler på bruk:

        // Fordi Animal også har makeSound metoden kan vi bruke denne gjennom objektene i
        // listen vår
        // Men da vil metoden til subklassen brukes fordi vi har skrevet over superklassens versjon
        // Dette kalles på engelsk overriding
        // Merk at så lenge objektene er lagret i en ArrayList som skal holde Animal typen vil de behandles som
        // om at de var av typen animal. De ble automatisk castet til superklasse typen Animal da vi la de til i AnimalCargoHold listen
        for (Animal animal : animalCargoHold) {
            animal.makeSound();
        }

        // Når vi vil ha tilgang til metoder eller attributter som er unike til en subklasse
        // Må objektet castes tilbake til subklassen siden Animal typen ikke vet om disse metodene/attributtene
        // {
        //      Animal dogAnimal = animalCargoHold.get(0);
        //      dogAnimal.sniffOutTarget("Trym's socks") // denne koden vil ikke fungere
        // }
        // De metodene som er unike til subklassen er ikke tilgjenngelig så lenge
        // objektet behandles som om det er av typen Animal fordi Animal ikke vet om disse metodene

        { // scopet her er laget slik at dog variabelnavnet kan gjennbrukes senere.
            Animal dogAnimal = animalCargoHold.get(0);
            Dog dog = (Dog) dogAnimal;
            dog.sniffOutTarget("Trym's socks");
        }

        // Vi kan bruke casting for å caste elementene i ArrayListen til deres egentlig type
        // Da får vi tilgang til metodene deres

        // Switch statments kan sjekke typen til ett objekt og implicit caste det til
        // Den riktige typen
        for (Animal animal : animalCargoHold) {
            switch (animal) {
                case Dog dog -> dog.sniffOutTarget("Trym's socks");
                case Cat cat -> cat.tipGlassOfTable();
                case Parrot parrot -> parrot.askForBidcuit();
                default -> animal.makeSound();
            }
        }

        // Det samme kan oppnås med instanceof
        for (Animal animal : animalCargoHold) {
            if (animal instanceof Dog dog) {
                dog.sniffOutTarget("Trym's socks");
            } else if (animal instanceof Cat cat) {
                cat.tipGlassOfTable();
            } else if (animal instanceof Parrot parrot) {
                parrot.askForBidcuit();
            } else {
                animal.makeSound();
            }
        }

    }
}
