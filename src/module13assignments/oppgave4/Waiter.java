package module13assignments.oppgave4;

public class Waiter extends Employee{
    private TipJar tipJar;


    public Waiter (String name, int age, double salary, TipJar tipJar) {
        super(name, age, salary);
        this.tipJar = tipJar;
    }

    public void takeTips(double tip) {
        this.tipJar.addTip(tip);
    }

}