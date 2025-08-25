package module2variablerinputunntak;

public class BrødKalkulator {
    public static void main (String[] args) {
        // Om vi tenker på programmer som oppskrifter, så kan vi tenke på
        // variabler som ingrediensene i oppskriften. Her lager vi ett
        // program som følger en oppskrift på (litt kjipe) brød.

        // Selve programmet er en brød kalkulator som regner ut
        // hvor mange brød man kan lage basert på hvor mye man har
        // av to ingredienser.

        // Vi bruker dette for å demonstrere hvordan variabler og datatyper kan brukes.

        // Variabler må (nesten) alltid defineres med en datatype.
        // Dette gjøres ved å skrive datatypen før navnet på variabelen.
        double melDl; // double er her datatypen, mens melDl er variabel navnet
        melDl = 2.0; // Vi kan tillegne en variabel en verdi ved å skrive variabelNavn = verdi;

        double melkDl = 1.0; // Dette kan også gjøres på en gang, på samme linje
        // Andre alternativer er:
        // double melDl, melkDl; // å opprette flere variabler av samme type på en gang
        // double melDl = 2, melkDl = 1.0; // oprette flere og tillegne verdi på en gang

        // Variabler kan ikke:
        // double melk Dl; //Ha mellomrom i navnet
        // double 1melkDl; //Ha tall som første tegn i navnet
        // double melkDl;
        // double melkDl; // Opprettes 2 ganger, merk at dette blir bare ett problem om
        // du skriver variablen med typebetegnelse to ganger.
        // Om du fjerner de første // symbolene foran lingene med koden over kan du se hvordan dette leder til en bug


        // double datatypen er datatypen for deismaltall, så når vi skriver ett + symbol
        // mellom to variabler av typen double summerer vi de to variablene som vanlige tall
        // Her oppretter vi en variabel deigDl som summen av melDl og melkDl slik at vi
        // regner ut hvor mye deig vi får basert på ingrediensene
        double deigDl = melDl + melkDl;

        // For å regne ut hvor mange brød vi kan lage trenger vi en variabel som sier oss
        // hvor mye deig vi trenger per brød. Merk her at vi bruker meningsfulle variabel navn
        // slik at vi lettere kan skjønne hva koden gjør.
        // dette er viktig både for oss selv i fremtiden og kollegaene din som også skal forstå koden din
        double deigDlPerBrød = 2.5;

        // Her regner vi ut hvor mange brød vi kan lage ved å dele mengden deig vi regnet ut tidligere
        // på mengden deig vi trenger per brød
        double antallBrød = deigDl/ deigDlPerBrød;

        // For moro skyld kan vi også legge inn yrke og navnet på bakeren vår
        // For ingrediensene brukte vi double siden dette er datatypen for desimaltall
        // dette gir mening fordi vi skulle regne med disse variabelene.
        // Nå som vi skal lagre en serie bokstaver må vi i stedet bruke String datatypen
        String yrke = "Baker";
        String etternavn = "Hansen";

        // Hvis vi bruker + operatoren mellom to variabler av typen String
        // vil den oppføre seg annerledes enn for variabler av typen double.
        // Med Strings vil + operatoren sette sammen strengene
        // så "Baker" + " " + "Hansen" blir til "Baker Hansen".
        // Her la jeg også til ett mellomrom mellom "Baker" og "Hansen"
        String yrkeOgNavn = yrke +" " + etternavn;

        // Til slutt kan vi skrive ut yrke og navn og hvor mange brød som kan lages til terminalen
        System.out.println(yrkeOgNavn + " kan lage" + " " + antallBrød + " brød");








    }

}
