package module5static.happydogs;

public class Dog {

    // Three different types of attributes (for variation)
    private String name;
    private boolean big;
    private int age;

    /**
     * As I only have 1 constructor in this class (with three parameters - name, big and age),
     * the only way to create a dog object is to provide values for all three parameters.
     */
    public Dog(String name, boolean big, int age) {
        // This is where I set the state for the new object to be made.
        this.name = name;
        this.big = big;
        this.age = age;
    }

    /**
     * Example of a method with no parameters (input)
     * and not returning anything to the caller (void)
     */
    public void presentYourself(){
        System.out.println("I am a dog, and my name is:"+name);
        System.out.println("I am " + age + " years old");
        if(big){
            System.out.println("I am a big dog");
        }else{
            System.out.println("I am a small dog");
        }
    }

    /**
     * Another example of a method with no parameters (input)
     * and not returning anything to the caller (void).
     * See how the value of attributes in the object may affect how the method behaves.
     */
    public void saySometing(){
        if(big){
            System.out.println("VOFF VOFF!");
        } else{
            System.out.println("voff");
        }
    }

    /**
     * Example of a method returning something.
     * In this case a text (String) with information regarding the object state
     * (the values of the objects attributes).
     * We will later learn that the normal thing to use is a method called toString for this.
     */
    public String getInfo(){
        String textToReturn = "I am a dog, and my name is:"+name + "\n" +
                "I am " + age + " years old" + "\n";
        if(big){
            textToReturn = textToReturn + "I am a small dog."+ "\n";
        }else{
            textToReturn = textToReturn + "I am a big dog."+ "\n";
        }
        return textToReturn;
    }

    /**
     * Per's favourite method (in this class).
     * Why? It shows have a method can use both method input (the parameter "food")
     * and its attributes (name, big, age) to do what it is supposed to do.
     * Methods are about doing something. Some kind of action to be taken.
     */
    public void eat (String food){
        System.out.println("Yummy, that was good!");
        System.out.println("As sure as my name is " + name + ", I LOVE " + food);
    }
}
