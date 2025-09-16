package module5classesandobjects2.apartmentareacalculator.io;

import static javax.swing.JOptionPane.*;
import module5classesandobjects2.apartmentareacalculator.spaces.*;
public class SpaceBuilder {

    public static Apartment buildApartment() {
        Apartment apartment = new Apartment(
                buildRoom("entre"),
                buildRoom("kjøkken"),
                buildRoom("stue"),
                buildRoom("soverom"),
                buildRoom("bad")
        );
        return apartment;
    }

    public static Room buildRoom(String roomName) {
        Room room = new Room(
                requestMeasure(roomName + " lengde: "),
                requestMeasure(roomName + " bredde: ")
        );
        return room;
    }

    public static double requestMeasure(String requestMessage) {
        String inputMeasure = showInputDialog(requestMessage);
        double measure;
        try {
            measure = Double.parseDouble(inputMeasure);
        } catch (Exception e) {
            measure = 0;
            System.out.println("Input må være ett tall");
        }
        return measure;
    }
}
