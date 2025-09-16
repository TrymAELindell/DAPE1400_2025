package module5classesandobjects2.apartmentareacalculator.spaces;

public class Apartment {
    Room entre;
    Room kitchen;
    Room livingroom;
    Room bedroom;
    Room bathroom;

    public Apartment (Room entre, Room kitchen, Room livingroom, Room bedroom, Room bathroom) {
        this.entre = entre;
        this.kitchen = kitchen;
        this.livingroom = livingroom;
        this.bedroom = bedroom;
        this.bathroom = bathroom;
    }

    public double getTotalArea() {
        double totalArea = 0;
        totalArea += this.entre.getArea();
        totalArea += this.kitchen.getArea();
        totalArea += this.livingroom.getArea();
        totalArea += this.bedroom.getArea();
        totalArea += this.bathroom.getArea();
        return  totalArea;
    }
}
