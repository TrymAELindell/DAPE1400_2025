package module10inheritanceandassociation.cargoholdV4aggregation;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Noen ganger ønsker vi at en klasse skal kunne ha
        // en attributt med en annen klasse som type og at denne
        // skal kunne eksistere separat fra objekter av klassen som har den som attributt
        // Dette kalles aggregation

        // Ett eksempel hvor aggregation gir mer mening enn composition er forholdet mellom en passasjer og
        // kjæledyret deres.
        // Passasjeren bør kunne ha ett Animal objekt som attributt som kan representere kjæledyret de ønsker å reise med
        // og dermed kobler disse sammen
        // Men siden vi ønsker å putte kjæledyret i bagasjerommet vil vi også trenge en referanse til kjæledyret
        // fra utsiden av Passenger objektet

        ArrayList<Passenger> passengerList = new ArrayList<Passenger>();
        ArrayList<Animal> animalCargoHold = new ArrayList<Animal>();

        passengerList.add(new Passenger("Rawan"));
        passengerList.add(new Passenger("Heidi"));
        passengerList.add(new Passenger("Ola"));

        // Aggregation eksempel:
        // Animal objektet kan eksistere på egenhånd
        Animal pet = new Cat(20,15,10,5);
        // Passasjeren har ett Animal objekt som attributt
        // Dermed er dette en form for aggregation fordi en passasjer "har ett" Animal
        // men Animal objektet kan eksistere på egenhånd
        passengerList.get(2).setPet(pet);
        animalCargoHold.add(pet);

    }
}
