package module11AbstractInterace.menti;

public class Main {
    public static void main(String[] args) {
            Animal benny = new Animal("Benny");
            Animal passop = new Dog("Passop");
            Cat mia = new Cat("Mia");
            benny.makeSound();
            passop.makeSound();
            mia.makeSound();
        }
    }
