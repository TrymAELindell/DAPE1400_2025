package module7arrays.PlaneV2;


public class MainV2 {
    public static void main(String[] args) {
        PlaneV2 plane = new PlaneV2(15);

        // Her har vi modifisert setFreeSeatToTaken metoden til å finne ett ledig sete automatisk
        // Metoden looper igjennom sete arrayet til den finner ett ledig sete
        plane.setFreeSeatToTaken();
        plane.setFreeSeatToTaken();
        plane.setFreeSeatToTaken();
        // Ett problem med PlaneV2 klassen er att vi bare får ett sete nr.
        // Men når vi vanligvis får tildelt ett sete i ett fly
        // sier billetten vår hvilke rad sete er på og hva sete nr er på denne raden.
        // Så seter i ett fly har egentlig to indekser, ett for raden og ett for sete nr på en gitt rad
        // For å representere dette kan vi bruke en 2D array, noe vi gjør i PlaneV3
    }
}
