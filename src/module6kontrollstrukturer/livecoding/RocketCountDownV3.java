package module6kontrollstrukturer.livecoding;

import javax.swing.*;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class RocketCountDownV3 {
    public static void main(String[] args) {
        // Denne variabelen legger jeg utenfor do-while slik at jeg har tilgang til den etterpå.
        // Jeg gir den en "ugyldig" verdi, altså en verdi vi ikke tillater som brukerinput.
        int countFrom = 0;
        // En do-while fungerer fint her, for vi skal uansett be brukeren om input.
        // Hvis brukeren gir ugyldig input, så vil vi fortsette å be om input
        do{
            String userInput = showInputDialog("Start nedtelling fra:");
            // Integer.parseInt kaster et unntak hvis teksten ikke inneholder en int
            // Vi kan fange unntaket og be brukeren forsøke på nytt.
            try{
                countFrom = Integer.parseInt(userInput);
                // Hit kommer jeg bare hvis teksten inneholdt et tall.
                // Men jeg sjekker om tallet er større en 0. Ellers er det ikke gyldig for vår count down.
                if(countFrom<=0){
                    // Ajaj. Brukeren hadde skrevet inn et tall, men det var ikke større enn null.
                    showMessageDialog(null, "Tallet må være større enn 0. Prøv igjen...");
                }
            } catch (NumberFormatException nfe){
                // Her fanger jeg unntaket og ber brukeren prøve igjen.
                showMessageDialog(null, "Du må skrive inn et tall. Prøv igjen...");
            }
            // Dette må vi gjøre så lenge (while) vi ikke har fått et gyldig tall for nedtellingen.
        } while(countFrom<=0);

        // Nå har jeg fått et gyldig tall fra brukeren.
        // Jeg vet akkurat hvor mange ganger jeg skal gå i løkke. Bruker derfor en for-loop.
        for(int i = countFrom; i>0 ; i--){
            System.out.println(i);
        }
        System.out.println("Launch!");

    }
}
