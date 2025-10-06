package module8arrays2collections;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Collections;


public class PassengerList {
    public static void main(String[] args) {

        // Oppretter en ArrayList. Merk at typen ArrayListen skal lagre plasseres innenfor < >.
        ArrayList<String> passengerList = new ArrayList<>();

        // For å legge til elementer i en ArrayList bruker man add metoden.
        passengerList.add("Kine");
        passengerList.add("Tobias");
        passengerList.add("Trym");

        // Add metoden har to versjoner, en med kun ett element som parameter
        // og en med en indeks og ett element.
        // Den frørste varianten legger til elementet på slutten av listen mens varianten brukt under
        // legger til elementet ved indeksen gitt som parameter og dytter de andre elmentene bakover i listen
        passengerList.add(2, "Per");

        // .set er en lignende metode, men i stedet for å bare legge til elementet og dytte de andre elementene bakover
        // byttes elementet ved indeksen ut med elementet gitt som parameter
        passengerList.set(2, "Maria");

        // Da ArrayList er en del av Collections rammeverket kan vi bruke flere statiske metoder fra klassen Collections
        // til å endre på ArrayList'er. Her sorteres listen. Merk at for at en liste skal kunne sorteres må elementene også kunne sorteres på en meningsfull måte
        // Dette lærer dere mer om senere, men du kan undersøke Comparable interfacet og metoden compareTo om du er interessert
        Collections.sort(passengerList);

        // .remove() metoden finnes også i to varianter. Den ene tar en indeks som parameter og fjerner elementet ved
        // denne indeksen og returner elementet ved indeksen.
        // Den andre varianten tar ett element som parameter og returner en boolean som er false om elementet ikke var
        // i ArrayList'en og true om den var i listen før det blir fjernet.
        // Dette gjør at vi kan bruke remove() metoden i logikk i kontrolstrukturer som gjor under i en while loop som
        // spør om passasjer navn fram til ett navn som finnes i listen gis som input til remove
        String passengerName;
        do {
            passengerName = JOptionPane.showInputDialog("Please input name of passenger who canceled");
        } while (passengerList.remove(passengerName) == false);



    }
}
