package module12Assignments;

public class Assignment2 {
    public static String monthNameByNumber(int monthNumber){
        return switch (monthNumber){
            case 1 -> "Januar";
            case 2 -> "Februar";
            case 3 -> "Mars";
            case 4 -> "April";
            case 5 -> "Mai";
            case 6 -> "Juni";
            case 7 -> "Juli";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "Oktober";
            case 11 -> "November";
            case 12 -> "Desember";
            default -> "Ingen måned";
        };
    }

    // Jeg trenger en main for å teste metoden.
    // Ettersom metoden er static kan jeg like gjerne lage en main i samme klasse.
    public static void main(String[] args) {
        System.out.println(monthNameByNumber(1));
        String monthName = monthNameByNumber(3);
        System.out.println(monthName);
        String monthName2 = monthNameByNumber(-1);
        System.out.println(monthName2);
    }
}
