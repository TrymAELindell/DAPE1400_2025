package module7arrays.genericexamples;


import java.util.Arrays;

public class PointerExamples {
    public static void main(String[] args) {

        // Ikke primitive datatyper (med unntak av String) kan ha flere variabler som peker på
        // den samme underliggende dataen.
        // Dette er litt som å ha ett alias, eller etter gamer navn og ett ekte navn
        // Både navnet du bruker online og navnet du bruker i vanlig tale peker på samme person
        Person person1 = new Person("Trym", 34); // Her lager vi ett person objekt
        Person person1Alias = person1; // Her lager vi ett alias til person objektet

        // Siden vi har to variabler som peker på samme underliggende objekt
        // vil endringer vi gjør via en variabel også se disse via aliaset
        System.out.println(person1); // Her printer vi person1 attributtene (merk at Person har en toString() metode som lar deg printe det ut direkte)
        person1Alias.setName("Per"); // Om vi endrer på navnet til det underliggende person objektet gjennom alias variablen

        // Her printer vi ut person objektet via begge variablene for å se at navnet er endret til per i begge tilfellene.
        System.out.println(person1Alias);
        System.out.println(person1);

        // Selv om primitive datatyper ikke kan ha flere aliaser kan arrays av primitive datatyper ha flere aliaser
        int[] intArray = {4,3,1,2,5};
        int[] intArrayAlias = intArray; // her lager vi ett alias til intArray

        // Her gjør vi en endring i to forksjellige elementer i den underliggende arrayen via to forskjellige aliaser
        intArray[0] = 10;
        intArrayAlias[1] = 100;

        // For å sjekke at begge aliasene har fått effekten av endringene vi gjorde printer vi ut arrayet via begge aliasene
        System.out.println("Array verdier printet ut via intArray");
        for (int i : intArray) {
            System.out.println(i);
        }

        System.out.println("Array verdier printet ut via intArrayAlias");
        for (int i : intArrayAlias) {
            System.out.println(i);
        }





    }







}
