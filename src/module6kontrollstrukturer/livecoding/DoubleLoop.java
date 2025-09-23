package module6kontrollstrukturer.livecoding;

public class DoubleLoop {
    public static void main(String[] args) {
        for (int row = 0; row < 5; row ++) {
            System.out.print("\nRow nr: " + row);
            for (int column = 0; column < 3; column ++) {
                System.out.print(" column: " + column);
            }
        }
    }
}
