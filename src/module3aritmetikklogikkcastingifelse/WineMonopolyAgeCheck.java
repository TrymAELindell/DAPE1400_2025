package module3aritmetikklogikkcastingifelse;

import static javax.swing.JOptionPane.*;

public class WineMonopolyAgeCheck {
    public static void main (String[] args) {
        // I dette programmet har vi fått i oppdrag å lage ett program for
        // vinmonopolet som forteller brukeren hva de kan handle på vinmonopolet
        // basert på alderen deres
        // I dette tilfellet får vi tre potensielle output basert på alder
        // Brukeren kan for ung til å handle på polet i det hele tatt (under 18 år)
        // Brukeren kan være gammel nok til å kjøpe øl og vin, men ikke sprit (18 år og under 20)
        // Brukeren kan være gammel nok til å handle hva som helst (20 år eller mer)

        // Det første vi gjør er å hente inn brukerens alder
        String ageInput = showInputDialog("Hvor gammel er du?");

        // Vi må så konvertere String input variabelen vår til en int
        // Dette kan jo gå galt så vi legger dette inn i en try catch block
        // slik at vi kan fange unntaket som vil oppstå om brukeren ikke gir ett
        // heltalls input
        int age; // int variabelen som skal holde alderen opprettes på utsiden av try catch blokken
        // om dette ble gjort inne i try catch blokken ville vi få en bug
        try {
            age = Integer.parseInt(ageInput);
        } catch (Exception e) {
            age = 0;
            showMessageDialog(null, "Du tastet ikke inn ett heltall");
        }

        // De to alderene vi ønsker å sammenligne med opprettes her
        // slik at vi kan kommunisere klart hva det er vi sjekker i de påfølgene if blokkene
        int ageOfBeerAndWine = 18;
        int ageOfSpirits = 20;

        // Siden vi har tre forskjellige mulige utfall tar vi her i bruk
        // både if, else if og else.
        // else if lar oss sjekke ett ekstra krav i tillegg til den første if setningen
        // før vi evt kommer til en else setning som utføres i all andre tilfeller
        if (age < ageOfBeerAndWine) { // Her sjekker vi først om brukeren er gammel nok til å kjøpe øl/vin
            // Vi sjekker om brukeren er under 18 først.
            // Om vi først hadde sjekket om brukeren var under 20 først ville
            // vi ikke etterpå kunne sjekke om brukeren var mellom 18 eller 19
            // da det kun er koden assosiert med den første if /else if setningen
            // som er sann som blir utført
            showMessageDialog(null, "Du er ikke gammel nok til å handle på polet");
        } else if (age < ageOfSpirits) {
            // Om else if setningen blir sjekket vet vi at brukeren er over 18 da dette kun
            // vil skje om den første if setningen var usann
            // Vi sjekker da her om brukeren er under 20. Om dette er sant
            // vet vi at de er over 18 men under 20 og vi kan fortelle dem at de kan
            // kjøpe øl og vin
            showMessageDialog(null, "Du kan handle øl og vin på polet");
        } else {
            // Om vi kommer helt til else koden over vet vi at brukeren er
            // 20 eller eldre og dermed kan kjøpe hva de vil fordi de to foregående
            // sjekkene ikke var sanne.
            showMessageDialog(null, "Du kan handle hva du vil på polet");
        }
    }

}
