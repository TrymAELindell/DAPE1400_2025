package module9classessandobjects3;

import javax.swing.*;

public class Person {
    private int age;
    private String birthMonth;

    /**
     * Denne klassen bruker overloading både til konstruktøren og til metoden incrementAge
     * Overloading er når man har flere varianter av en metode.
     * Metoden har det samme navnet men må ha forskjellige parametre.
     * Det at metoden har forskjellige parametre gjør at java kan forstå vilke variant som skal brukes
     * selv om metoden har det samme navnet.
     * Merk at du kan bruke forskjellige retur typer, på forskjellige varianter av en metode men man må da også ha forskjellige parametre
     */

    public Person(int age, String birthMonth) {
        this.age = age;
        this.birthMonth = birthMonth;
    }

    public Person() {
        this.age = Integer.parseInt(JOptionPane.showInputDialog("Hvor gammel er du?"));
        this.birthMonth = JOptionPane.showInputDialog("Hvilke måned ble du født");
    }

    public void incrementAge() {
        int ageIncrement = 1;
        System.out.println("Du er blitt" + ageIncrement + " år eldre");
        this.age++;
    }


    public String incrementAge(int ageIncrement) {
        this.age += ageIncrement;
        return "Du har eldes " + ageIncrement;
    }


}
