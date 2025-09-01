package module3aritmetikklogikkcastingifelse;

public class CastingExamples {
    public static void main (String[] args) {
        // V1 - Deig til over kalkulering
        // Koden er er kommentert ut fordi den ikke kan kjøres samtidig som V2 under
        //int nrOfBread;
        //int doughDl = 10;
        //int doughDlPerBread = 3;

        //nrOfBread = doughDl / doughDlPerBread; // Heltalsdivisjon som gir oss antall hele brød
        //double doughDlLeftover = doughDl % doughDlPerBread; // modulus for å regne ut hvor mye deig som er til overs
        //System.out.println(nrOfBread);
        //System.out.println(doughDlLeftover);

        // V2 - Antall brød som desimaltall
        double nrOfBread;
        int doughDl = 10;
        int doughDlPerBread = 3;

        // Her konverterer vi doughDl og doughDlPerBread til doubles
        // for å få ut antall brød som desimaltall ved å skrive (double) foran variabel navnet
        // merk at vi ikke ville fått en feil om vi ikke gjorde dette selv om vi tilegner resultatet
        // som er ett heltall til nrOfBread som er av typen double fordi dette er utvidende casting
        nrOfBread = (double)doughDl / (double)doughDlPerBread; // vi konverter begge variblene for å være tydelig på at det er dette vi vil
        double doughDlLeftover = doughDl % doughDlPerBread;
        System.out.println(nrOfBread);
        System.out.println(doughDlLeftover);
    }
}
