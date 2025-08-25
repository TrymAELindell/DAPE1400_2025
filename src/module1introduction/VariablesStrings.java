package module1introduction;

public class VariablesStrings {
    public static void main (String[] args) {

        // En variabel er ett navngitt område i Random Access Memory (RAM)
        // Denne dataen kan være av flere forskjellige typer.
        // Her skal vi se på data av typen String
        // Dette er "strenger" av bokstaver

        // For å lage en variabel av type String skriver vi først String for å fortelle datamaskinen
        // At denne variabelen skal være av typen String
        String firstName;
        // Vi kan så tillegge en verdi til variablen ved å bruke = mellom navnet til variabelen og verdien vi vil tillegne den
        firstName = "Trym";

        // Disse to stegene kan også gjøres i ett som gjort under på linje 18
        String lastName = "Lindell";

        // La oss printe ut variablene for å verifisere verdiene
        System.out.println(firstName);
        System.out.println(lastName);

        // Selv om vi har tillegnet "Trym" og "Lindell" til variablene tidligere
        // kan vi endre verdiene på samme måte som vi først tillegnet dem
        firstName = "Per";
        lastName = "Lauvås";

        // Om vi nå printer verdiene ut på nytt kan vi se at de er endret
        System.out.println(firstName);
        System.out.println(lastName);

        // Å print ut verdiene er ikke den beste måten å sjekke hvilke verdi variablene har
        // Det er bedre å bruke debuggeren slik at du kan se steg for steg hvordan de endres
        // Under dette vinduet vil du får opp tre mindre vinduer, i midten kan se variablene
        // Her kan du se navnet deres og verdien de har på ett gitt sted i programmet
        // Merk at det kan hende du må flytte litt rundt på vinduene for å kunne se vinduet i midten godt
    }
}
