package myapp.zapispunktacjigry.io;

import myapp.zapispunktacjigry.model.Zawodnik;

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
        System.out.print("Gra zakonczona (true/false)? ");
        boolean koniecGry = sc.nextBoolean();

        if (!koniecGry) {
            System.out.println("Graj dalej!");
            System.exit(0);
        }
    }

    public void zamknijOdczytScannera() {
        sc.close();
    }
}
