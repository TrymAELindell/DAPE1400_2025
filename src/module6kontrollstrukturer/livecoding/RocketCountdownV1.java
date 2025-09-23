package module6kontrollstrukturer.livecoding;

import static javax.swing.JOptionPane.showInputDialog;

public class RocketCountdownV1 {
    public static void main(String[] args) {
        // V1 av RocketCountdown tar i bruk en while loop slik at vi kan telle ned fra ett arbitrært tall

        String userInput = showInputDialog("Start nedtelling fra:");
        int countFrom = Integer.parseInt(userInput);
        int currentCount = countFrom;

        // En while loop kjører til betingelsen inne i parantesen blir usann.
        // Her er betingelsen  at currentCount er over 0 (currentCount > 0).
        while (currentCount > 0) {
            System.out.println(currentCount); // Her printes currentCount ut
            currentCount --; // Siden vi teller nedover må vi redusere currentCount for hver iterasjon av loopen
            // Om vi ikke reduserer currentCount vil bli fanget i en evig loop fordi betingelsen alltid er sann
        }
        System.out.println("Launch!");

        // Selv om dette programmet fungerer helt fint er det en ryddigere måte å skrive en slik loop på
        // nemlig ved hjelp av en for loop, som du vil se i V2
    }
}
