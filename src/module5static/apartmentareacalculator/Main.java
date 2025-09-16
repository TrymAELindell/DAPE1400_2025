package module5static.apartmentareacalculator;
import module5static.apartmentareacalculator.io.SpaceBuilder;
import module5static.apartmentareacalculator.spaces.Apartment;
import static javax.swing.JOptionPane.*;


public class Main {
    public static void main(String[] args) {

        Apartment apartment = SpaceBuilder.buildApartment();
        double area = apartment.getTotalArea();
        showMessageDialog(null, "Leiligheten er på " + area + " kvadratmeter");





    }
}
