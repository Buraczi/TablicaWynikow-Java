package myapp.tablicawynikow.io;

import myapp.tablicawynikow.model.Zawodnik;

import java.util.Scanner;

public class OdczytDanychZawodnika {
    private Scanner sc = new Scanner(System.in);
    
    public Zawodnik pobierzDaneZawodnika() {

        System.out.print("Podaj swoje imie: ");
        String imieZawodnika = sc.nextLine();

        System.out.print("Jaka punktacja? ");
        int punktacja = sc.nextInt();
        sc.nextLine();

        System.out.print("Ile poziomow ukonczono? ");
        int poziomUkonczony = sc.nextInt();
        sc.nextLine();

        return new Zawodnik(imieZawodnika, punktacja, poziomUkonczony);
    }

    public int numerOpcji() {
        int numerOpcji = sc.nextInt();
        sc.nextLine();
        return numerOpcji;
    }

    public void koniecGry() {
        String koniecGry;
        do {
            System.out.print("Gra zakonczona (tak/nie)? ");
            koniecGry = sc.nextLine();
            switch (koniecGry) {
                case "tak":
                    break;
                case "nie":
                    System.out.println("Graj dalej");
                    break;
                default:
                    System.out.println("Wpisz 'tak' lub 'nie' ");
                    break;
            }
        } while (!koniecGry.equals("tak"));
    }

    public void zamknijOdczytScannera() {
        sc.close();
    }
}
