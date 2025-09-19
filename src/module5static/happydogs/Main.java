package module5static.happydogs;

public class Main {
    // How can we test the Dog class? We need a method. Let's use main.

    // Testing the different methods we created in Dog using main.
    public static void main(String[] args) {
        // We create two objects. They will have different states as we provide different values for them.
        // We have to use -String boolean int- in that order, as it is what the constructor will accept.
        Dog d1 = new Dog("Fido", true, 4);
        Dog d2 = new Dog("Passop", false, 14);
        // Now that the objects are created (and we have references to them; d1 and d2),
        // we can test the methods in both objects.
        // Se how I use SOUT to better understand the output displayed in the console.
        System.out.println("Letting the objects present themselves:");
        d1.presentYourself();
        d2.presentYourself();

        System.out.println("Letting the objects say something:");
        d1.saySometing();
        d2.saySometing();

        // Now, I am calling a method that returns something - a String.
        // I need to place the returned text somewhere. Aha - a String variable!
        System.out.println("Here is what is returned from getInfo():");
        String s1 = d1.getInfo(); // See how the returned text from the method is stored in variable s1
        System.out.println(s1);
        String s2 = d2.getInfo(); // and s2
        System.out.println(s2);

        System.out.println("Providing food..");
        d1.eat("margbein");
        d2.eat("brød");

    }



}
