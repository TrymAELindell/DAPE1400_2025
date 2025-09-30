package module7arrays.PlaneV1;

public class MainV1 {
    public static void main(String[] args) {
        // Ved hjelp av arrays kan vi tilpasse hvor mange seter vi har i flyet dynamisk
        // Dette gjør det mye mer praktisk å opprette ett fly med fler eller færre seter
        PlaneV1 plane = new PlaneV1(15);
        // PlaneV1 klassen lager en bolsk array med antall elementer lik nrOfSeats parameteret

        // For å endret ett sete til opptatt bruker vi setFreeSeatToTaken metoden
        // som tar ett setenr (sete indeks) som parameter og prøver å sette dette elementet til true
        plane.setFreeSeatToTaken(3);
        plane.setFreeSeatToTaken(2);
        plane.setFreeSeatToTaken(3);
        // Dette er litt upraktisk fordi når flyet begynner å bli fullt kan det bli vanskelig å
        // finne ett ledig sete om vi må manuelt prøve oss fram
        // Dette løser vi PlaneV2 med en loop

    }
}
