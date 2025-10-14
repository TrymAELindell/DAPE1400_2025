package module9classessandobjects3;

public class ReferenceExamples {
    public static void main(String[] args) {

        // Primitive typer og såkalte referanse typer (klasser, arrays, interface) oppfører seg forskjellig når
        // man tillegner en ny variabel en eksisterende variabel.
        // Om du kjører koden under i debug mode vil se denne oppførselen

        int age = 34; // Her oppretter vi en variabel med en primitiv datatype

        int ageAlias = age; // Her tilegner vi en ny variabel (ageAlias) den eksisterende variabelen (age)

        age += 1; // Hva skjer nå om vi legger til 1 til verdien som er lagret i age?

        // vi vil da set at age endres til 35, men ageAlias ikke endres.
        // Vi kan dermed tenke oss as tillegnings operasjonen vi gjorde på linje 12 lagde en kopi
        // av verdien lagret i age og la denne i ageAlias.
        // Dermed vil ikke verdien i ageAlias påvirkes av noe vi gjør med age

        // Men oppfører dette seg på samme måte med referansetyper som klasser?
        // vi prøver under å gjøre det samme som vi gjorde med age og ageAlias med ett Person objekt
        Person trym = new Person(34, "Januar");

        Person weds = trym;

        // Her prøver vi å øke alderen til weds objektet med incrementAge metoden
        // Følg med i debuggeren på hva som skjer med trym objektes age attributt
        weds.incrementAge();

        // Du vil da se at både age atributten i trym objektet og i weds objektet endes!
        // Dette er fordi variabelen ikke direkte lagrer Person objektet, men i stedet lagrer en referanse til
        // det underliggende objektet.
        // I debuggeren kan du se dette ved at både trym variabelen og weds variabelen har den samme = Person@heltall
        // verdien. Dette forteller oss at de referer til det samme underliggende objektet

        // Det samme skjer når man sender en referanse type inn som parameter til en metode.
        // Parameter variabelen lagrer da en referanse til det underliggende objektet og kan gjøre endringer på
        // dette som vil påvirke det samme objektet som trym og weds variabelen i main metoden peker på
        // Derfor trenger vi ikke å returnere trym objektet fra metoden under for å se effekten den har på objektet
        // noe vi måtte gjort om parameteret var en primitiv type
        Time.agePerson(trym);


    }
}
