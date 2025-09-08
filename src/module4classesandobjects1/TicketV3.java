package module4classesandobjects1;
import static javax.swing.JOptionPane.*;
public class TicketV3 {
    private String name;
    private String destination;
    private String personNr;

    public TicketV3 (String name, String personNr, String destination) {
        if (personNr.length() == 11) {
            this.name = name;
            this.destination = destination;
            this.personNr = personNr;
        } else {
            System.out.println("Warning: Fødselsnr hadde feil lenge.\n Billett ble ikke opprettet");

        }
    }
    public void setPassengerInfo(String name, String personNr) {
        if (personNr.length() == 11) {
            this.name = name;
            this.personNr = personNr;
        } else {
            System.out.println("Warning: Fødselnr hadde feil lengde. \n Passasjer detaljer ble ikke endret");
        }
    }

    public String getDestination() {
        return this.destination;
    }

    public void printTicketInfo () {
        String out = "\nTicket info"
         + "\nName: " + this.name
         + "\nPerson Nr: " + this.getMaskedPersonNr()
         + "\nDestination: " + this.destination;
        showMessageDialog(null, out);
    }

    private String getMaskedPersonNr() {
        return this.personNr.substring(0, 6) + "xxxxx";
    }

    public boolean checkPersonNr(String personNr) {
        return this.personNr.equals(personNr);
    }
}
