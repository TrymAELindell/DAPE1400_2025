package module6kontrollstrukturer.livecoding;

import static javax.swing.JOptionPane.showInputDialog;

public class RocketCountdownV2 {
    public static void main(String[] args) {
        String userInput = showInputDialog("Start nedtelling fra:");
        int countFrom = Integer.parseInt(userInput);

        // En for loop er ofte ryddigere enn en while loop fordi den lar oss
        // komprimere all informasjonen om hvordan loopen iterer på en linje
        // Innenfor parantesen under initierer vi iterator variabelen currentCount som en int,
        // setter betingelsen for loopen
        // og til slutt definerer hvordan iterator variabelen skal endres
        // allt på en linje!
        // Når man vet hvor mange iterasjoner man skal gjøre, som i dette tilfellet hvor vi skal telle ned fra ett gitt tall
        // Er det som regel best å bruke en en for loop
        for (int currentCount = countFrom; currentCount > 0; currentCount --) {
            System.out.println(currentCount);
        }
        System.out.println("Launch!");
    }
}
