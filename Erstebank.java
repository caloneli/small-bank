import java.util.Scanner;

public class Erstebank extends Banka {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Koliko imate musterija? ");
        int n = sc.nextInt();
        Banka[] erste = new Banka[n];
        String acn;

        for (int i = 0; i < erste.length; i++) {
            erste[i] = new Banka();
            erste[i].otvoriNalog();

        }
        int ch;
        do {
            System.out.println("Meni \n1. Prikazi sve\n2. Pretrazi\n3. Depozit\n4. Podigni\n5. Izadji");
            System.out.println("Vas izbor je: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    for (int i = 0; i < erste.length; i++) {
                        erste[i].showNalog();
                    }
                    break;
                case 2:
                    System.out.println("Koji nalog zlite da nadjete");
                    acn = sc.next();
                    boolean nadjen = false;
                    for (int i = 0; i < erste.length; i++) {
                        nadjen = erste[i].pretrazi(acn);
                        if (nadjen)
                            break;
                    }
                    if (!nadjen)
                        System.out.println("nalog ne postoji");
                    break;
                case 3:
                    System.out.println("Unesite broj naloga");
                    acn = sc.next();
                    nadjen = false;
                    for (Banka element : erste) {
                        nadjen = element.pretrazi(acn);
                        if (nadjen)
                            element.depozit();
                        break;
                    }
                    if (!nadjen)
                        System.out.println("greska, ne postji broj naloga");
                    break;
                case 4:
                    System.out.println("Unesite broj naloga");
                    acn = sc.next();
                    nadjen = false;
                    for (int i = 0; i < erste.length; i++) {
                        nadjen = erste[i].pretrazi(acn);
                        if (nadjen)
                            erste[i].podigni();
                        break;
                    }
                    if (!nadjen)
                        System.out.println("greska, ne postji broj naloga");
                    break;
                case 5:
                    System.out.println("Izlaz");
                    break;

            }

        } while (ch != 5);

        sc.close();
    }

}
