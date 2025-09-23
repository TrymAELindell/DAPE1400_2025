package module6kontrollstrukturer.assignments.RocketCountdownV5;
import static javax.swing.JOptionPane.*;

public class UserInput {
    public static int requestInt(String request) {
        String userInput;
        boolean inputIsInt = false;
        int userInputAsInt = 0;

        do {
            userInput = showInputDialog(request);
            try {
                userInputAsInt = Integer.parseInt(userInput);
                inputIsInt = true;
            } catch (Exception e) {
                showMessageDialog(null, "Input must be an integer");
            }
        } while (!inputIsInt);

        return userInputAsInt;
    }

    public static boolean requestAndVerifyTargetString(String request, String targetString) {
        String userInput = showInputDialog(request);
        if (userInput.equals(targetString)) {
            return true;
        } else {
            return false;
        }
    }


}
