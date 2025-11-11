package module12Assignments;

import javax.swing.*;

public class Assignment1 {
    public static void main(String[] args) {
        // Her er den ytre while-løkken.
        // Den går evig, inntil brukeren velger å avbryte (skrive q).
        while(true){
            // Jeg legger disse variablene utenfor de indre løkkene.
            // Da har jeg tilgang til dem når innlesingen er ferdig.
            double nr1 = 0;
            double nr2 = 0;
            // En indre do-while-løkke for innhenting av tall 1.
            // Her kan brukeren avbryte ved å skrive inn q
            do{
                String nr1AsString = JOptionPane.showInputDialog("Skriv inn et tall, eller q for å avslutte:");
                // Sjekker om brukeren har skrevet inn q
                if(nr1AsString.equalsIgnoreCase("q")){
                    // Ja, jøss. Q mottatt. Skriver avskjedsmelding og returnerer.
                    System.out.println("Bye!");
                    return;
                }
                // Brukeren skrev IKKE q. Da forventer vi et tall.
                // Men brukeren kan jo ha skrevet inn noe annet enn et tall.
                // Jeg bruker en try/catch for å håndtere mulig unntak.
                try{
                    nr1 = Double.parseDouble(nr1AsString);
                    // Hvis jeg kommer hit, så skjedde det IKKE et unntak.
                    // Da kan jeg gå ut av do-while vha en break.
                    // Vi har jo fått tak i tallet vårt.
                    break;
                } catch (NumberFormatException nfe){
                    // Brukeren skrev ikke inn et tall.
                    // Jeg informerer brukeren.
                    JOptionPane.showMessageDialog(null, "Du må skrive inn et gyldig tall!");
                    // Ettersom jeg er inne i en do-while vil jeg fortsette å be brukeren om et tall.
                }
            } while (true);

            // Her gjør jeg det samme for tall 2.
            // Men her sjekker jeg ikke for Q.
            do{
                String nr1AsString = JOptionPane.showInputDialog("Skriv inn et tall:");
                try{
                    nr2 = Double.parseDouble(nr1AsString);
                    break;
                } catch (NumberFormatException nfe){
                    JOptionPane.showMessageDialog(null, "Du må skrive inn et gyldig tall!");
                }
            } while (true);

            // Tallene er i boks. Da kan jeg regne ut det jeg trenger.
            // Og informere om sum, produkt og differanse.
            System.out.println("Info pm tallene " + nr1 + " og " + nr2);
            System.out.println("Sum:" + (nr1+nr2));
            double product = nr1*nr2;
            System.out.println("Produkt:"+product);

            // Differanse er litt tricky.
            // For ikke å få en negativ differanse utfører jeg største tall - minste tall
            double difference = 0;
            if(nr1>nr2){
                // Det første tallet er størst
                difference = nr1-nr2;
            }else{
                // Det andre tallet er størst (eller de er like store)
                difference = nr2-nr1;
            }
            System.out.println("Differanse:"+difference);
        }



    }
}