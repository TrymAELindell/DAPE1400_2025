package demos.klasserogobjekter;

import javax.swing.JOptionPane;

public class Account {
    private String bank;
    private double balance = 12000;
    private String password = "hemmelig123";
    static int id = 0;

    // Konstruktør
    public Account(String bank) {
        this.bank = bank;
        id = id + 1;
        System.out.println("Du har opprettet bankAccount");
    }

    // Viser bank via dialogboks
    public void showBank() {
        JOptionPane.showMessageDialog(null, "Banken du bruker er: " + bank);
    }

    // Returnerer bankinformasjon
    public String bankInfo() {
        return "Bank: " + bank + ", id-en er: " + id;
    }

    // Get-metode for bank
    public String getBank() {
        return bank;
    }

    // Set-metode for bank
    public void setBank(String bank) {
        this.bank = bank;
    }

    // Get-metode for balance med passordbeskyttelse
    public double getbalance(String inputpassword) {
        if (inputpassword.equals(password)) {
            return balance;
        } else {
            return -1;
        }
    }
}
