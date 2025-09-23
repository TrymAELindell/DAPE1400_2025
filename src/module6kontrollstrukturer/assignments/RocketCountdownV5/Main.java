package module6kontrollstrukturer.assignments.RocketCountdownV5;

public class Main {
    public static void main(String[] args) {

        int countFrom;
        int rocketsLaunched = 0;

        while (UserInput.requestAndVerifyTargetString("Continue launches? (y/n)", "y")) {
            countFrom = UserInput.requestInt("Start countdown from:");
            Countdown.startCountdown(countFrom);
            rocketsLaunched ++;
        }

        System.out.println(rocketsLaunched + " space rockets have been launched today!");



    }
}
