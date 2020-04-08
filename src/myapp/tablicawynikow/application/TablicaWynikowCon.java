package myapp.tablicawynikow.application;

import myapp.tablicawynikow.io.OdczytDanychZawodnika;
import myapp.tablicawynikow.io.WyswietlanieKomunikatow;
import myapp.tablicawynikow.model.TablicaWynikow;
import myapp.tablicawynikow.model.Zawodnik;

public class TablicaWynikowCon {
    private static final int WYJSCIE_Z_PROGRAMU = 0;
    private static final int WYSWIETL_TABLICE_WYNIKOW = 1;
    private static final int DODAJ_ZAWODNIKA = 2;

    OdczytDanychZawodnika odz = new OdczytDanychZawodnika();
    TablicaWynikow tablicaWynikow = new TablicaWynikow();
    WyswietlanieKomunikatow wK = new WyswietlanieKomunikatow();

    public void petlaWyboruOpcji() {
        odz.koniecGry();
        int opcja;
        do {
            wyswietlOpcej();
            opcja = odz.numerOpcji();
            switch (opcja) {
                case WYJSCIE_Z_PROGRAMU:
                    wyjscieZProgramu();
                    break;
                case WYSWIETL_TABLICE_WYNIKOW:
                    wyswietlTabliceWynikow();
                    break;
                case DODAJ_ZAWODNIKA:
                    dodajZawodnika();
                    break;
                default:
                    wK.wyswietlKomunikat("Wybrano błędną opcje!");
                    break;
            }
        } while (opcja != WYJSCIE_Z_PROGRAMU);
    }

    private void wyswietlOpcej() {
        wK.wyswietlKomunikat(WYJSCIE_Z_PROGRAMU + " - wyjdź z programu");
        wK.wyswietlKomunikat(WYSWIETL_TABLICE_WYNIKOW + " - wyswietl tablice wyników");
        wK.wyswietlKomunikat(DODAJ_ZAWODNIKA + " - dodaj zawodnika do tablicy");
    }

    private void dodajZawodnika() {
        Zawodnik zawodnik = odz.pobierzDaneZawodnika();
        tablicaWynikow.dodajZawodnika(zawodnik);

    }

    private void wyswietlTabliceWynikow() {
//        tablicaWynikow.wyswietlZawodnikowWTabeli();
        tablicaWynikow.wyswietlZawodnikowWTabeliPosortowane();
    }

    private void wyjscieZProgramu() {
        wK.wyswietlKomunikat("Do widzenia!");
        odz.zamknijOdczytScannera();
    }
}
