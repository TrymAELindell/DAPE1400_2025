package module9classessandobjects3;

public class OverloadingExamples {
    public static void main(String[] args) {
        /**
         * Her vises eksempel bruk av overloading av metodene i Person klassen
         * For mer informasjon om hvordan dette fungerer se på Person klassen
         */

        // Person klassen har en overloadet konstruktør som vil si at den finnes i flere varianter
        // Her brukes konstruktør varianten med parameter
        Person trym = new Person(
                34,
                "Januar"
        );

        // Her brukes konstruktøren uten parameter, i stedet henter vi inn atributtene via JOptionPane
        Person student = new Person();

        // Overloading er også nyttig når vi har en metode som vi ønsker skal ha litt mer fleksibilitet rundt bruken av den
        // Vi kan feks ha metoden under som skal øke alderen til ett person objekt.
        // Her kan vi kalle metoden uten parametre for å øke alderen med 1
        trym.incrementAge();

        // Eller vi kan gi ett parameter som gjør at metoden i stedet øker alderen med parameter verdien
        trym.incrementAge(4);

        // Ett annet eksempel på overloading har dere sett i forrige modul.
        // ArrayList har en .add metode som er overloadet. Om den brukes uten parameter legges elementet til på slutten av listen
        // mens om man legger til ett indeks parameter vil elementet legges til ved denne indeksen i stedet



    }
}
