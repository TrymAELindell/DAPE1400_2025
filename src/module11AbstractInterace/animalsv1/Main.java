package module11AbstractInterace.animalsv1;

public class Main {
    public static void main(String[] args) {
        // Not possible as Animal now is abstract
        // Animal benny = new Animal("Benny");

        Dog passop = new Dog("Passop", false, 10, true);
        Cat mia = new Cat("Mia", true, 8, "Royal Canin");
        // Testing the dog
        // Look what happens when the object has a toString method:
        System.out.println(passop);
        passop.makeSound();
        // Why doesn't his work ?!?
        //passop.fetchTheStick();

        // Testing the cat
        System.out.println(mia);
        mia.makeSound();
        mia.blockViewToScreen();

        mia.feedBaby();
        passop.feedBaby();

        Parrot parrot = new Parrot("Polly", false, 2.0);
        System.out.println("Her kommer papegøyen:");
        System.out.println(parrot);

    }
}
