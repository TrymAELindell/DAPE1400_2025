package module6kontrollstrukturer.assignments;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class RocketCountdownV3 {
    public static void main(String[] args) {

        String userInput;
        int countFrom = 0;
        boolean inputIsInteger = false;
        do {
            userInput = showInputDialog("Start nedtelling fra:");
            try {
                countFrom = Integer.parseInt(userInput);
                inputIsInteger = true;
            } catch (Exception e) {
                showMessageDialog(null, "Input må være ett heltall");
            }
        } while (!inputIsInteger);

        for (int currentCount = countFrom; currentCount > 0; currentCount --) {
            System.out.println(currentCount);
        }
        System.out.println("Launch!");
    }
}
