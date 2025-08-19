package module1introduction;

public class PizzaRecipe {
    public static void main (String[] args) {
        // Ett program er litt som en matoppskrift.
        // Det består av en serie instruksjoner som utføres en etter den andre
        // Om du trykker på "play" knappen på toppen av Intellij vinduet til høyre
        // Vil dette programmet kompileres og kjøres du vil da se teksten under printet ut
        // Dette skjer veldig fort så det er vanskelig å få med seg rekkefølgen.
        // Du kan også trykke på det lille insektet ved siden av play knappen.
        // Da vil du start debuggeren som lar deg gå igjennom koden linje for linje.
        // Men om du bare starter debuggeren vil den gå igjennom all koden uten å stoppe
        // For å stoppe koden ett sted må du først sette ett "break point" før du starter debuggeren
        // Det gjør du ved å trykke på nummeret til kode linjen hvor du vil stoppe programmet
        // Disse linje numrene finner du til venstre i dette vinduet.
        // Når du nå trykker på debuggeren vil programmet stoppe på linjen du har satt ett break point på
        // Under dette vinduet, til venstre kan du se ett settt med kontroll symboler i form.
        // Om du trykker på pilen som peker nedover (step into, hurtigtast F7)
        // vil du gå igjennom koden steg for steg og du vil se teksten printet ut linje for linje
        System.out.println("Forvarm ovnen til 230 grader");
        System.out.println("Ta embalasjen av pizzaen");
        System.out.println("Sett pizzaen i ovnen");
        System.out.println("Vent 14 minutter");
        System.out.println("Ta ut pizzaen");
        System.out.println("Spis!");
    }
}
