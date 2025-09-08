package module4classesandobjects1;

import static javax.swing.JOptionPane.*;

public class AirportTicketSystemV3 {
    public static void main(String[] args) {
        showMessageDialog(null, "Please input ticket information");
        TicketV3 ticket1 = new TicketV3(
                showInputDialog("Please input your name: "),
                showInputDialog("Please input your person Nr: "),
                showInputDialog("Please input your destination: ")
        );
        ticket1.printTicketInfo();


        showMessageDialog(null, "Please input your information to change the ticket");
        ticket1.setPassengerInfo(
                showInputDialog("Please input your name: "),
                showInputDialog("Please input your person Nr: ")
        );
        ticket1.printTicketInfo();

        String passportPersonNr = showInputDialog("Welcome to the checking counter. Please input the passport person nr");
        boolean personNrIsCorrect = ticket1.checkPersonNr(passportPersonNr);

        if (personNrIsCorrect) {
            showMessageDialog(null, "Welcome onboard!");
        } else {
            showMessageDialog(null, "Call PST!");
        }
    }
}
