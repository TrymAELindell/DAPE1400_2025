package module7arrays.genericexamples;

public class ArrayExamples {
    public static void main(String[] args) {

        // Arrays kan lages av alle datatyper/klasser ved å skrive [] etter datatypen/klassenavnet
        // enkelt verdier i en array kaller vi elementer
        // Hvert element har en posisjon i arrayen som er definert som ett heltall.
        // Posisjonen kalles for indeks
        // indeksering av arrayer starter fra 0
        // så det fjerde elementet i en array har indeks 3, det første har indeks 0 osv.

        int[] arrInt = new int[4]; // 4 tallet her bestemmer størrelsen på arrayen, her lager vi altså en array av ints som har 4 elementer
        arrInt[0] = 2; // vi kan sette verdien til ett gitt element ved å putte indeksen til elementet i [] etter navnet på arrayet
        System.out.println(arrInt[0]); // her kan vi se at vi har satt elementet ved indeks 0 til 2
        System.out.println(arrInt[1]); // Primitive datatyper som ints blir satt til standard verdier (0 for ints) så elementet ved index 1 har verdien 0

        double[] arrDouble = new double[4];
        arrDouble[0] = 2.0;
        System.out.println(arrDouble[0]);
        System.out.println(arrDouble[1]);

        boolean[] arrBool = new boolean[4];
        arrBool[2] = true;
        System.out.println(arrBool[0]);
        System.out.println((arrBool[2]));

        // Arrays kan også opprettes med egendefinerte verdier ved å legge verdiene til elementene inne i { }
        int[] arrIntPreDefined = {1,2,3,4,2,3};

        // Arrays har tilgang på sin egen lengde gjennom attributten length
        int arrayLength = arrIntPreDefined.length;
        System.out.println("Arrayen har lengde: " + arrayLength);

        // Som sagt kan arrays opprettes av alle datattyper.
        // Her opprettes arrays av Strings
        String[] arrString = new String[4];
        arrString[0] = "hei";
        System.out.println(arrString[0]);
        System.out.println(arrString[1]); // Arrays av ikke primitive typer blir initialisert med verdien null, noe du kan se når du prøver å printe ut ett element som ikke er blitt initialisert

        // Her opprettes arrays av en egendefinert klasse Person
        Person[] arrPerson = new Person[3];
        arrPerson[0] = new Person("Omar", 34);
        System.out.println(arrPerson[0]);
        System.out.println(arrPerson[1]);

        arrPerson[0].setName("Hasan"); // Vi kan bruke metodene til elementer i ett array
        arrPerson[2].setName("Heidi"); // Men om vi prøver å bruke metoder til ett element som ikke er initialisert vil vi få en Exception
    }
}
