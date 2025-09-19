package module5static.happydogs;

public class Main {
    // TODO: How can we test the Dog class?

    // TODO: Test the different methods
    public static void main(String[] args) {
        Dog d1 = new Dog("Fido", true, 4);
        Dog d2 = new Dog("Passop", false, 14);
        d1.presentYourself();
        d2.presentYourself();
        d1.saySometing();
        d2.saySometing();
        System.out.println("Her kommer svar fra getInfo:");
        String s1 = d1.getInfo();
        System.out.println(s1);
        String s2 = d2.getInfo();
        System.out.println(s2);

        System.out.println("Providing food..");
        d1.eat("margbein");
        d2.eat("brød");

    }



}
