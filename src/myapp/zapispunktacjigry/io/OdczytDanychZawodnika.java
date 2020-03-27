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

    public void zamknijOdczytScannera() {
        sc.close();
    }
}
