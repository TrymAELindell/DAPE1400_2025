package module9classessandobjects3;

public class ScopeExamples {
    public static void main(String[] args) {

        // Ett scope er avgrenset av to krøllparanteser { }
        // Alle variabeler som opprettes innenfor ett scope vil kunn eksistere inne i dette scopet
        Person trym = new Person(34, "Januar");

        // I incrementAge metoden opprettes det en variabel som heter ageIncrement
        // Fordi det er opprettet innenfor scopet til metoden. Altså innenfor krøllparantesen som kommer etter metodenavnet og parametrene
        // incrementAge() { scope   }
        // vil den ikke være tilgjenngelig her i main metoden
        trym.incrementAge();

        // ageIncrement += 1;// om du uncommenter koden foran vil den ikke kjøres fordi ageIncrement ikke er tilgjengelig

        // Ett scope kan opprettes uten en tillhørende metode, loop eller kontrollstruktur

        int numberInMainScope = 3;

        {
            int numberInInnerscope = 3;
            numberInInnerscope += 4;
        }

        numberInMainScope += 3;
        //numberInInnerScope += 2; // vil gi en bug om den uncommentes


    }
}
