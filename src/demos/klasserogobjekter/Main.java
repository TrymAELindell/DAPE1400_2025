package demos.klasserogobjekter;

public class Main {
    public static void main(String[] args) {
        // Eksempel med konstruktør og bank-info
        Account account1 = new Account("Grisebank");
        System.out.println(account1.bankInfo());

        Account account2 = new Account("DNB");
        System.out.println(account2.bankInfo());

        // Test med get/set
        account1.setBank("Sparebank1");
        System.out.println(account1.getBank());

        // Test av passordbeskyttet tilgang til balance
        Account secureAccount = new Account("DNB");
        double result1 = secureAccount.getbalance("feilpassword123");
        System.out.println("Test 1 (feil password): " + result1);

        double result2 = secureAccount.getbalance("hemmelig123");
        System.out.println("Test 2 (riktig password): " + result2);
    }
}
