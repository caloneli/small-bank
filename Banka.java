import java.util.Scanner;

public class Banka {
    private String brojnaloga;
    private String imeIPrezime;
    private long balans;

    Scanner sc = new Scanner(System.in);

    void otvoriNalog() {
        System.out.println("Unesite Broj naloga");
        brojnaloga = sc.next();
        System.out.println("Vase ime?");
        imeIPrezime = sc.next();
        System.out.println("Vas balans..?");
        balans = sc.nextLong();
    }

    String prikaziNalog() {
        return "Broj naloga: " + brojnaloga + "Ime i prezime " + imeIPrezime + " balans: " + balans;
    }

    // alternativa prikazinalog
    void showNalog() {
        System.out.println("Broj naloga: " + brojnaloga + "Ime i prezime " + imeIPrezime + " balans: " + balans);
    }

    void depozit() {
        long dodaj;
        System.out.println("Unesi svotu depozita");
        dodaj = sc.nextLong();
        balans = dodaj + balans;
    }

    void podigni() {
        long podigni;
        System.out.println("Koliko zelis da podignes");
        podigni = sc.nextLong();
        if (podigni > balans)
            System.out.println("nemate dovoljno novca");
        else if (podigni <= balans)
            balans = balans - podigni;
        System.out.println("vas novi balans je: " + balans);
    }
    boolean pretrazi(String acn){
        if(brojnaloga.equals(acn)){
            prikaziNalog();
            return true;
        }
        return (false);
        }
    }

    


