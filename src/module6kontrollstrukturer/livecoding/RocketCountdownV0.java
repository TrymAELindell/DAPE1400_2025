package module6kontrollstrukturer.livecoding;
import static javax.swing.JOptionPane.*;

public class RocketCountdownV0 {
    public static void main(String[] args) {
        // Dette programmet tar input fra brukeren og printer ut en nedtelling
        // fra bruker input til 0
        // V0 er en dårlig implmentasjon fordi den ikke skalerer godt.
        // Her bruker vi if setninger til å printe ut de hvert tall i nedtellingen
        // Dette vil si at vi må ha en if setning for hvert tall i nedtellingen ettersom vi teller
        // ned fra tallet gitt av brukeren.
        // En bedre løsning finnes i V1
        String userInput = showInputDialog("Start nedtelling fra:");
        int countdownFrom = Integer.parseInt(userInput);

        // Denne koden støtter bare nedtelling fra 3.
        if (countdownFrom >= 3) {
            System.out.println(3);
        }
        if (countdownFrom >= 2) {
            System.out.println(2);
        }
        if (countdownFrom >= 1) {
            System.out.println(1);
        }
        System.out.println("Launch");
    }
}
