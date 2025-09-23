package module6kontrollstrukturer.livecoding;
import static javax.swing.JOptionPane.*;

public class SpeedTest {
    public static void main(String[] args) {

        String numberOfLoopIterationsString = showInputDialog("Input number of loop iterations:");
        long numberOfLoopIterations = Long.parseLong(numberOfLoopIterationsString);


        long start = System.nanoTime();
        for (int i = 0; i < numberOfLoopIterations; i ++) {

        }
        long end = System.nanoTime();
        long elapsedLoopTime = end - start;

        System.out.println(numberOfLoopIterations + " loop iterasjoner tok " +  elapsedLoopTime / 1_000_000.0 + "ms");
    }
}
