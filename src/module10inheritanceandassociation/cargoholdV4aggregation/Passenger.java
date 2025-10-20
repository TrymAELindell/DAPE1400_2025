package module10inheritanceandassociation.cargoholdV4aggregation;

public class Passenger {
    String name;
    Animal pet;

    public Passenger(String name) {
        this.name = name;

    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }
}
