package module6kontrollstrukturer.assignments.RocketCountdownV5;

public class Countdown {
    public static void startCountdown(int countFrom) {
        for (int currentCount = countFrom; currentCount > 0; currentCount --) {
            System.out.println(currentCount);
        }
    }
}
