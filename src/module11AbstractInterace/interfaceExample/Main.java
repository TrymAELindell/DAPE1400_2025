package module11AbstractInterace.interfaceExample;
public class Main {
    public static void main(String[] args) {
        /*
        This is the main point.
        Look how easy it is to inject different implementations of the interface.
        The program can be run i two different modes. We simply plug in the
        mode we want by choosing the implementation of the interface.
         */
        //Program p = new Program(new AnimalTestProvider());
        Program p = new Program(new AnimaUserProvider());
        p.runProgram();
    }
}
