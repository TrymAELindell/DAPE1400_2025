package module7arrays.PlaneV4;

public class MainV4 {
    public static void main(String[] args) {
        PlaneV4 plane = new PlaneV4(7,2);

        // Siden vi nå har en array av seter som har en attributt med navnet til passasjeren
        // må vi ha ett parameter passengerName i setFreeSeatToTaken metoden.
        plane.setFreeSeatToTaken("Arushan");
        plane.setFreeSeatToTaken("Jørgen");
        plane.setFreeSeatToTaken("Kristine");
        plane.setFreeSeatToTaken("Kine");

    }
}
