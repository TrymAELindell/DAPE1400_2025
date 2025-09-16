package module5classesandobjects2.apartmentareacalculator;
import module5classesandobjects2.apartmentareacalculator.io.SpaceBuilder;
import module5classesandobjects2.apartmentareacalculator.spaces.Apartment;
import static javax.swing.JOptionPane.*;


public class Main {
    public static void main(String[] args) {

        Apartment apartment = SpaceBuilder.buildApartment();
        double area = apartment.getTotalArea();
        showMessageDialog(null, "Leiligheten er på " + area + " kvadratmeter");





    }
}
