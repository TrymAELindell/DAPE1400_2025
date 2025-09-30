package module7arrays.PlaneV3;

public class PlaneV3 {
    private boolean[][] seatsTaken;

    public PlaneV3(int nrOfRows, int nrOfSeatsPerRow) {

        this.seatsTaken = new boolean[nrOfRows][nrOfSeatsPerRow];
    }

    public void setFreeSeatToTaken() {
        boolean seatFound = false;

        rowLoop: // Dette er en loop label, vi bruker den til å bryte ut av den ytre loopen med break setningen på rad 22
        for (int rowIndex = 0; rowIndex < seatsTaken.length; rowIndex ++) {
            for (int seatIndex = 0; seatIndex < seatsTaken[rowIndex].length; seatIndex ++) {
                if (!seatsTaken[rowIndex][seatIndex]) {
                    seatsTaken[rowIndex][seatIndex] = true;
                    System.out.println("Ledig sete funnet!");
                    System.out.println("Rad: " + rowIndex + " sete: " + seatIndex + "\n");
                    seatFound = true;
                    break rowLoop; // Her bryter vi ut av den ytre loopen fordi vi har gitt den en label: rowLoop
                    // Om vi ikke hadde brukt en label ville vi bare brutt ut av den indre lopen
                    // og vi ville fortsatt i den ytre loopen
                }
            }
        }
        if (!seatFound) {
            System.out.println("Beklager, flyet er fullt. Ingen ledige seter funnet");
        }

    }


    public String toString(){
        String out = "";


        for (int rowIndex = 0; rowIndex < this.seatsTaken.length; rowIndex ++) {
            out = out + rowIndex + " |";

            for (int seatIndex = 0; seatIndex < this.seatsTaken[rowIndex].length; seatIndex ++) {
                out = out + " " + this.seatsTaken[rowIndex][seatIndex];
            }

            out = out + " |\n";
        }
        return out;
    }



}
