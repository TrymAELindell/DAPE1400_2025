package module3aritmetikklogikkcastingifelse;

public class RoundingErrors {
    public static void main (String[] args) {
        // noen ganger kan vi ende opp med avrundingsfeil
        // når vi gjør aritmetikk med desimaltalls variabler
        // Dette er fordi man kun har ett begrenset antall bits
        // (32 for float, 64 for double) til å representere tall
        // mens det finnes en utellelig uendelig mengde desimaltall
        // dvs dette er en større uendelighet enn for heltallene
        // fordi det er uendelig desimaltall mellom alle tall

        // Det kan være litt uforutsigbart når dette problemet oppstår
        // Under utfører vi en utregning som resulterer i en avrundingsfeil

        // Det vi skal gjøre her er å dele ett tall på ett annet
        // så prøve å gange resultutatet av divisjonen med tallet vi delte det første tallet på
        // fordi vi da egentlig bare reverserer delingen burde vi få det samme tallet tilbake
        // men pga datamaskiners begrensinger vil dette ikke være tilfellet.
        System.out.println("Avrundingsfeil via divisjon");
        double number1 = 1; // telleren
        System.out.println("Original tall: " + number1); // vi printer ut telleren så vi ser hva den var lagret som
        double number2 = 49; // nevneren

        double quotient = number1/number2; // utfører divisjonen

        double product = quotient * number2;
        System.out.println("Resultat av multiplikasjon: " + product); // printer ut tallet vi fikk da vi reverserte divisjon med multiplikajson
        boolean sameAsOriginal = number1 == product; // Her gjør vi en sammenligning for å se om vi fikk tilbake den originalle telleren
        System.out.println("Fikk vi det originale tallet tilbake: " + sameAsOriginal);


        // double og float kan bare representere ett begrenset antall siffer
        // Dette vil noen ganger vise seg ved at variabelen din kutter bort
        // noen siffer etter desimalpunktet
        // Eksemplene under illustrerer dette
        System.out.println("\nAvrundingsfeil via upresis representasjon");

        // Vi kan sjekke at små verdier forsvinner ved å ta ett høyt tall
        // i dette tilfellet 9 * 10^15 og legge til ett lite desimaltall for så å trekke fra
        // det store tallet igjen.
        double veryLargeDouble = (9E15 + 0.6) - 9E15;
        System.out.println(veryLargeDouble); // Dette vil printe ut 1.0 fordi 0.6 ble rundet opp
        veryLargeDouble = (9E15 + 0.4) - 9E15;
        System.out.println(veryLargeDouble); // Dette vil printe ut 0.0 fordi 0.4 ble rundet ned
        // Her ser vi att små desimaltall kan forsvinne når tallet eller er stort
        // Dette må skje fordi vi ikke kan representere alle tall, men vi kutter da også
        // bort de laveste delene av tallene fordi de har minst å si for utregningen vår
        // Det er viktigere at banken regner riktig med millionene i stedet for enkelt kroner

        // Vi kan også se dette tydlig om vi velger oss ett tall
        // Og prøver å printe ut det samme tallet flere ganger
        // men flytter desimalpunktet hver gang
        // Da vil vi se at det printes ut det samme antall siffer hver gang
        // Men vi vil få færre og færre siffer etter desimalpunktet
        // Merk at oppløsningen for hvilke tall som kan representeres er ikke
        // lik over hele området en float eller double kan representere
        System.out.println("\nRunding av desimaler baser på tall størrelse");
        double limitDouble;
        limitDouble = 1.2345678910121314151617181920;
        System.out.println(limitDouble);
        limitDouble = 12.345678910121314151617181920;
        System.out.println(limitDouble);
        limitDouble = 123.45678910121314151617181920;
        System.out.println(limitDouble);
        limitDouble = 1234567891012131415161718192021222324252627282930.0;
        System.out.println(limitDouble);

    }
}
