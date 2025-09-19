package module5static.happydogs;

public class Dog {

    private String name;
    private boolean big;
    private int age;

    public Dog(String name, boolean big, int age) {
        this.name = name;
        this.big = big;
        this.age = age;
    }

    public void presentYourself(){
        System.out.println("I am a dog, and my name is:"+name);
        System.out.println("I am " + age + " years old");
        if(big){
            System.out.println("I am a big dog");
        }else{
            System.out.println("I am a small dog");
        }
    }

    public void saySometing(){
        if(big){
            System.out.println("VOFF VOFF!");
        } else{
            System.out.println("voff");
        }
    }

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

    public void eat (String food){
        System.out.println("Yummy, that was good!");
        System.out.println("As sure as my name is " + name + ", I LOVE " + food);
    }
}
