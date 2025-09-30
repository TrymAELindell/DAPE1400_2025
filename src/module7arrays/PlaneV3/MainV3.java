package module7arrays.PlaneV3;

public class MainV3 {
    public static void main(String[] args) {

        // PlaneV3 klassen lagrer om setene i flyet er opptatt eller ikke i en 2D array
        // slik at vi kan representere raden og sete nr på rad.
        // Derfor må vi ha to parametere når vi oppretter fly objekter, en for antall rader og en for antall seter per rad
        PlaneV3 plane = new PlaneV3(5,4);

        // Siden vi nå har en 2D array vi må søke igjennom for å finne ett ledig sete
        // må vi nå bruke en dobbel loop.
        // Dette er implementert i setFreeSeatToTaken i PlaneV3
        plane.setFreeSeatToTaken();
        plane.setFreeSeatToTaken();
        plane.setFreeSeatToTaken();
        plane.setFreeSeatToTaken();
        plane.setFreeSeatToTaken();
        plane.setFreeSeatToTaken();

        // Selv om en boolsk array gir mening å bruke for å representere om ett sete er ledig eller ikke
        // vil vi kanskje kunne representere mer informasjon.
        // Feks hva passasjeren som sitter i setet heter.
        // Siden vi kan lage arrays av egendefinerte klasser også kan vi lage en egen klasse for seter
        // og lage en array av disse i stedet for en boolks array
        // I PlaneV4 blir dette implementert

    }
}
