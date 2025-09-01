package module3aritmetikklogikkcastingifelse;
import static javax.swing.JOptionPane.*;
public class BreadCalculatorWithLeftovers {
    public static void main (String[] args) {
        double flourDl;
        String flourDlInput = showInputDialog("Hvor mye mel har du?");
        try {
            flourDl = Double.parseDouble(flourDlInput);
        } catch (Exception e) {
            flourDl = 0;
        }

        double flourToMilkRatio = 0.5;
        double requiredMilkDl = flourDl * flourToMilkRatio;
        showMessageDialog(
                null,
                "Du trenger " + requiredMilkDl + " dl melk");


        double doughDl = flourDl + requiredMilkDl;

        double doughPerBread = 10;

        int nrOfBread = (int) (doughDl / doughPerBread);
        double leftoverDough = doughDl % doughPerBread;

        String out = "Du kan lage " + nrOfBread + " brød, og vil ha " + leftoverDough + " dl deig til over";
        showMessageDialog(null, out);


    }
}
