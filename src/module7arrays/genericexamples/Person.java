package module7arrays.genericexamples;

public class Person {
    private int age;
    private String name;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void increaseAge() {
        this.age ++;
    }

    public String toString(){
        String out = "Navn: " + this.name + "\n" +
                     "Alder: " + this.age;
        return out;
    }

}
