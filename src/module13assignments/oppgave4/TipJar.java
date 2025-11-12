package module13assignments.oppgave4;

public class TipJar {
    private double tips;

    public TipJar() {
        this.tips = 0;
    }

    public void addTip(double tip) {
        this.tips += tip;
    }

    public double distributeTips(int numberOfEmployees) {
        double tipsOut = this.tips;
        this.tips = 0;
        return tipsOut/numberOfEmployees;
    }
}
