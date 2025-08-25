package module2variablerinputunntak;

import static javax.swing.JOptionPane.*;

public class BrødKalkulatorMedInput {
    public static void main (String[] args) {
        // Dette programmet er en oppgradert versjon av BrødKalkulator programmet
        // De fleste bakere kan ikke å programmere så det hadde vært fint om programmet
        // vårt kan spørre bakeren om hvor mye mel og melk de har i stedet for at
        // de må legge det inn i koden selv.
        // For å gjøre dette skal vi bruke java pakken swing.
        // Swing er en pakke med kode som lar oss lage grafiske brukergrensesnitt uten at
        // vi må skrive all koden for å gjøre dette selv.
        // Dette vil si at vi må importere koden til programmet våres
        // På linge 2 i denne klassen finner du setningen som importerer koden vi trenger fra swing
        // vi skal spesifikt bruke showInputDialog og showMessageDialog som hører til JOptionPane

        // Som i BrødKalkulator trenger vi variabler av typen double for å lagre desimaltall
        // verdiene som representerer hvor mye vi har av hver ingrediens
        double melDl, melkDl;

        // Når vi skal ta inn input fra brukeren med showInputDialog blir inputtet fra brukeren
        // gitt som String datatypen. Vi kan ikke legge en String direkte inn i en variabel
        // av typen double så vi må mellomlagre bruker inputtet i String variabler og så konvertere
        // String verdiene til double

        // showInputDialog er en metode. Dette skal vi lære mer om senere
        // men det er fint å vite at metoder ofte selv kan ta input
        // showMessageDialog kan ta String input som vises til brukeren når de skal
        // gi input til programmet. Dette er nyttig så vi kan spørre spesifikt om mengde og ingrediens type
        String melDlInput = showInputDialog("Hvor mye mel har du?");
        String melkDlInput = showInputDialog("Hvor mye melk har du?");

        // Vi kan konvertere verdien i String variabler til double
        // ved hjelp av Double.parseDouble(stringVariabel) så her kan vi skrive
        // melDl = Double.parseDouble(melDlInput);
        // Men dette fungerer kun om verdien i String variabelen kan tolkes som ett desimaltall
        // Om String variabelen har verdien "tre" eller "2 dl" vil vi få en Exception, ett unntak
        // og programmet vil crashe.
        // For å unngå dette kan vi bruke try { } catch (Exception e) { }
        // try { kode } prøver å kjøre koden som står innenfor { }.
        // Om dette går galt får vi en Exception
        // catch (Exception e) { backup kode } fanger unntaket og utfører backup koden
        try {
            // Her prøver vi å konvertere bruker inputtet til double datatypen
            melDl = Double.parseDouble(melDlInput);
            melkDl = Double.parseDouble(melkDlInput);
        } catch (Exception e) { // her fanger vi unntaket om det oppstår
            // Om vi ikke kan konvertere bruker inputtet til double kan vi ikke regne ut
            // hvor mange brød de kan lage, så da gir det mening å sette melDl og melkDl
            // til 0 slik at utregningen vår ender opp som 0 og bruker får dette skrevet ut som antall brød de kan lage
            melDl = 0;
            melkDl = 0;
            // Det er også fint å fortelle brukeren hva som gikk galt så her
            // bruker vi showMessageDialog til å skrive ut hva som gikk galt
            showMessageDialog(null, "Du ga ikke tall inputt");
            // merk at showMessageDialog må ha ett input parameter som her er skrevet som null.
            // Hva null betyr og hvordan dette fungerer kommer vi tilbake til senere.
        }

        // Her regner vi ut hvor mange brød vi kan lage
        double deigDl = melkDl + melDl;
        double deigPerBrød = 1.5;
        double antallBrød = deigDl/deigPerBrød;

        // Og til slutt skriver vi ut resultatet av utregningen i ett pop up vindu
        showMessageDialog(null, "Du kan lage " + antallBrød + "!");

    }
}
