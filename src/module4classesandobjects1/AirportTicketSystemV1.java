package module4classesandobjects1;

public class AirportTicketSystemV1 {
    public static void main(String[] args) {

        // Ved hjelp av TicketV1 klassen kan vi nå gruppere name, personNr og destination
        // i ett objekt.
        TicketV1 ticket1 = new TicketV1("Trym", "24019189734", "Svalbard");
        ticket1.printTicketInfo(); // Vi kan nå også printe all billett informasjonen ved ett metode kall

        TicketV1 ticket2 = new TicketV1("Per", "19027189763", "Tromsø");
        ticket2.printTicketInfo();

        TicketV1 ticket3 = new TicketV1("Faid", "27026089670", "Algeri");
        ticket3.printTicketInfo();

        // Vi kan endre attributter ved bruke syntaksen under
        ticket1.name = "Kristian";
        // Men dette er problematisk fordi vi nå tillater at
        // name endres uten at personNr endres.
        // Når Gustavos pass nå sjekkes mot billetten på flyplassen
        // vil ikke person nummeret i systemet matche nummeret på passet
    }
}
