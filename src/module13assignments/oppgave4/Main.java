package module13assignments.oppgave4;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Det er flere måter å lage en felles pot for tipsene til de ansatte
        // I timen viste vi dette med en statisk varibel, her bruker vi i stedet en egen
        // klasse for lagre tipsene. Da får vi trent litt på hvordan referanse typer fungerer.
        TipJar tipJar = new TipJar();

        ArrayList<Employee> employees = new ArrayList<Employee>();

        employees.add(new Chef("Erik", 34, 600_000));

        employees.add(new Waiter("Trym", 34, 480_000, tipJar));
        employees.add(new Waiter("Harald", 22, 470_000, tipJar));
        // Merk her at vi gir Waiter objektene en referanse til tipJar objeket.
        // Siden dette er en referansetype vil nå alle waiter objektene kunne legge tips i samme
        // TipJar objekt. Dermed får vi en felles pot

        // For å samle inn summen av lønningene må vi ha en variabel vi lagrerer denne summen i
        // Her må vi huske på å definere denne utenfor for loopen vi skal bruke til å loope igjennom
        // de ansatte. Om vi hadde opprettet denne inne i loopen ville den blitt forsvunnet på slutten av hver iterasjon
        // og så gjennopprettes.
        double sumOfSalaries = 0;

        // Siden employees ArrayList'en holder Chef og Waiter objekter som er castet til Employee typen
        // Looper vi igjennom listen med en for each loop som legger elementene inn i variabler av typen Employee
        for (Employee employee : employees) {
            // Siden vi har laget en toString i Employee klassen kan vi printe objektene ut direkte
            System.out.println(employee);

            // Siden vi nå bare har objekter som er castet som Employee typen
            // har vi ikke tilgang til metodene som er spesifikke til sub klassene Waiter og Chef
            // Når vi nå skal gi Waiter objektene tips må vi derfor først sjekke om Employee objektet egentlig er av Waiter typen
            if (employee instanceof Waiter) {
                // Etter at vi har sjekket om objektet er av typen Waiter kan vi trygt
                // caste den til Waiter typen. Da får vi tilgang til Waiter's metoder som takeTips
                ((Waiter) employee).takeTips(400);
                // Merk her at vi har skrevet castingen inne i en parantes, om vi ikke hadde gjort dette ville
                // takeTips metoden blitt utført før castingen, noe som ikke ville fungert fordi Employee klassen ikke har denne metoden
            }

            // Her henter vi lønnen til den ansatte vi har tilgjenngelig i denne iterasjonen av loopen
            // Her går det fint å bruke objektet med Employee typen siden Employee har getSalary metoden
            sumOfSalaries += employee.getSalary();
        }

        System.out.println("Total employee salary cost: " + sumOfSalaries);

        // Siden hver Waiter objekt legger tipset sitt inn i tipJar objektet og vi har en referanse til tipjar
        // i main kan vi bruke denne til å distribuere tipset til de ansatte.
        // Her kan vi også lett finne hvor mange ansatte vi har ved hjelp av employees fordi ArrayLists har en size() metode
        // som gir oss hvor mange elementer som er i listen
        System.out.println("Each emplyee gets: " + tipJar.distributeTips(employees.size()));
    }
}

