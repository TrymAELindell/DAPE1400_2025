package module8arrays2collections.staticexample;

public class Main {
    public static void main(String[] args) {

        // Ett viktig prinsipp i objekt orientert programmering (OOP) er at man gjerne vil isolere funksjonaliteten til
        // klassene man skriver slik at de har få ansvar. I våre tidligere implementasjoner av Plane klassen har vi ikke
        // fulgt dette prinsippet så godt fordi Plane har to ansvar, den skal holde på seter og den skal finne og booke
        // ledige seter.
        // Her kunne vi i stedet delt opp disse to ansvarene.
        // Plane vil da kun ha som rolle å holde på seter og fortelle oss om ett sete er opptatt eller ikke.
        // Mens ansvaret med å finne ett ledig sete kan vi legge på en annen klasse vi kaller SeatBooker.
        // SeatBooker skal dermed ta ett plane objekt som input parameter til en metode (feks bookSeatInPlane(Plane plane))
        // og finne ett ledig sete og sette det til opptatt. Her kan vi også merke oss at siden bookSeatInPlane metoden
        // bare skal opere på plane objektet og ikke skal bruke noen andre variabler kan vi gjøre metoden statisk slik at vi
        // ikke trenger å opprette ett objekt av SeatBooker klassen for å kunne bruke bookSeatInPlane metoden. '

        // Når vi deler opp ansvar på denne måten blir koden vår som lego klosser som vi lettere kan gjennbruke til annen funksjonalitet
        // Vi gjør det også mindre sannsynelig at det blir avhengigheter mellom koden vår som blir vanskelig å håndtere
        // når vi gjør endringer fordi hver klasse har isolerte ansvar.

        // Koden under oppretter ett plane objekt
        Plane plane = new Plane(10);

        // Her bruker vi SeatBooker sin statiske metode inne i en while loop til å booke alle setene i flyet.
        // Merk at vi tar i bruk det at bookSeatInPlane er statisk ved at vi ikke bruker en kodelinje på å opprette ett SeatBooker objekt.
        // Vi utnytter også at bookSeatInPlane returner en boolean som forteller oss om vi klarte å booke ett sete i flyet.
        // Dette gjør at vi kan legge bookingen direkte inn i sjekken i while løkken. Vi kunne også skrevet annen logikk rundt
        // dette. Derfor vil man ofte se at metoder returnerer en boolean som forteller oss om metoden fikk til å gjøre det man ba den om.
        while (SeatBooker.bookSeatInPlane(plane)) {}


    }
}
