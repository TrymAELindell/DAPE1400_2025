package module13assignments.oppgave4;

public class Chef extends Employee {
    public Chef (String name, int age, double salary) {
        super(name, age, salary);
    }

    public void makeDish(String dish) {
        System.out.println(dish + " is ready to be served");
    }

    public void makeDish() {
        System.out.println("Chef's special is ready to be served");
    }

}