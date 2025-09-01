package module3aritmetikklogikkcastingifelse;


public class CastingRoundingErrors {
    public static void main (String[] args) {

        // Selv om man kan gjøre widening (utvidende) casting mellom
        // int/long og float/double vil man kunne miste informasjon
        // fordi float og double ikke klarer å representere det fullstendige
        // heltallet man lagret i int/long variablen
        // Dette skjer fordi det ikke er nok bits til å representere alle de mulige
        // heltallene int/long kan i en float/double
        // Dette vil generellt skje for store heltall
        // Vi kan dermed demonstrere denne effekten om vi
        // prøver å konvertere det største heltallet en long
        // kan representere til en float
        System.out.println("Casting med rundefeil");
        long bigInteger = Long.MAX_VALUE;
        float intAsFloat = bigInteger;
        System.out.println(Long.MAX_VALUE);
        System.out.println(intAsFloat);
        // Her vil det gå tapt informasjon ved at de lavere
        // delene av heltallett gjøres om til 0'er
        // long  - 9223372036854775807
        // float - 9223372000000000000 (skrives 9.223372E18)


        System.out.println("\nCasting uten rundefeil"); // for å få luft mellom printout'ene

        // For små heltall er dette ikke ett problem
        long smallInteger = 10;
        intAsFloat = smallInteger;
        System.out.println(smallInteger);
        System.out.println(intAsFloat);
    }
}
