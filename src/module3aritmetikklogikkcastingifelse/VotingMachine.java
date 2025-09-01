package module3aritmetikklogikkcastingifelse;
import static javax.swing.JOptionPane.*;

public class VotingMachine {
    public static void main (String[] args) {
        // Oppgaven her er å lage ett program som forteller en bruker
        // om de kan stemme ved stortingsvalget nå i 2025 eller ikke
        // Ved kommunevalg kan man stemme uten statsborgerskap, men
        // i stortingsvalg må man ha statsborgerskap
        // I begge tilfellene må man også 18 år eller eldre.
        // Det er dermed to ting vi forholde oss til for å finne ut om en person kan stemme
        // er de gamle nok og har de norsk statsborgerskap

        // Det første vi kan gjøre er å finne ut om brukeren er gammel nok
        // Da må vi først ta bruker input
        // Som vi husker fra module 2 kan dette gjøres med showInputDialog
        // som gir oss en String som output
        String ageInput = showInputDialog("Hvor gammel er du?");
        // Vi må så konvertere String inputet til ett tall
        // Her kan dere tenke over hva som kan gå galt og forbedre koden selv (sjekk module 2)
        int age = Integer.parseInt(ageInput);
        // Om en person er gammel nok til å stemme er noe som enten er sant eller usannt
        // derfor trenger vi en boolean variabel for å lagre denne informasjonen
        // Da man kan stemme øyblikket man er 18 gir det her også mening så sjekke
        // om brukeren er 18 år eller eldre noe vi gjør med >= operatoren
        // Hadde vi bruk > her i stedet ville programmet våres ikke latt en
        // person som er akkurat 18 stemme
        boolean ofVotingAge = age >= 18;

        // Det neste vi trenger er statsborgerskap. Her kan vi spørre om brukeren har
        // norsk statsborgerskap via showInputDialog ved å be de svare ja eller nei på spørsmålet.
        String citizenshipInput = showInputDialog("Har du norsk statsborgerskap? Svar ja eller nei");
        // Når vi skal sammenligne String variabler er det best å bruke .equals("string verdi") metoden
        // (metoder kommer senere) fordi String ikke er en primitiv datatype slik som de andre
        // datatypene vi har lært om. Dette gjør at to strings med samme verdi ikke alltid vil gi
        // riktig output om man bruker == operatoren
        boolean citizenship = citizenshipInput.equals("ja");

        // Til slutt vil vi kommunisere to forskjellige beskjeder til brukeren
        // avhengig av om de oppfyller begge kravene eller ikke
        // Dette kan vi oppnå ved hjelp av en if else påstand.
        if (citizenship && ofVotingAge) { // siden vi vil at begge kravene skal være sanne bruker vi her && operatoren for å sjekke dette
            // koden innenfor disse krøllparantesene, som da tilfører if (citizenship && ofVotingAge)
            // vil utføres kun om både citizenship er true og ofVoting age er true
            showMessageDialog(null, "Du kan stemme i år");
        } else {
            // I alle andre tilfeller vil denne koden utføres før programmet kjører videre
            showMessageDialog(null, "Du kan ikke stemme i år");
        }
    }
}
