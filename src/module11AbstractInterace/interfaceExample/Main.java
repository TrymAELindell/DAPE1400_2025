package module11AbstractInterace.interfaceExample;
public class Main {
    public static void main(String[] args) {
        Program p = new Program(new AnimalTestProvider());
        //Program p = new Program(new AnimaUserProvider());
        p.runProgram();
    }
}
