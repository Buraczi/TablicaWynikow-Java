package myapp.tablicawynikow.application;

import myapp.tablicawynikow.io.OdczytDanychZawodnika;
import myapp.tablicawynikow.model.TablicaWynikow;
import myapp.tablicawynikow.model.Zawodnik;

public class TablicaWynikowCon {
    final int wyjscieZProgramu = 0;
    final int wyswietlTabliceWynikow = 1;
    final int dodajZawodnika = 2;

    OdczytDanychZawodnika odz = new OdczytDanychZawodnika();
    TablicaWynikow tablicaWynikow = new TablicaWynikow();

    public void petlaWyboruOpcji() {
        odz.koniecGry();


        int opcja;
        do {
            wyswietlOpcej();
            opcja = odz.numerOpcji();
            switch (opcja) {
                case wyjscieZProgramu:
                    wyjscieZProgramu();
                    break;
                case wyswietlTabliceWynikow:
                    wyswietlTabliceWynikow();
                    break;
                case dodajZawodnika:
                    dodajZawodnika();
                    break;
                default:
                    System.out.println("Wybrano błędną opcje!");
                    break;
            }
        } while (opcja != wyjscieZProgramu);
    }

    private void wyswietlOpcej() {
        System.out.println(wyjscieZProgramu + " - wyjdź z programu");
        System.out.println(wyswietlTabliceWynikow + " - wyswietl tablice wyników");
        System.out.println(dodajZawodnika + " - dodaj zawodnika do tablicy");
    }

    private void dodajZawodnika() {
        Zawodnik zawodnik = odz.pobierzDaneZawodnika();
        tablicaWynikow.dodajZawodnika(zawodnik);

    }

    private void wyswietlTabliceWynikow() {
        tablicaWynikow.wyswietlZawodnikowWTabeli();
    }

    private void wyjscieZProgramu() {
        System.out.println("Do widzenia!");
        odz.zamknijOdczytScannera();
    }
}
