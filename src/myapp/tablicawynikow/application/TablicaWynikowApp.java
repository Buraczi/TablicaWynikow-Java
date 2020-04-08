package myapp.tablicawynikow.application;

import myapp.tablicawynikow.io.WyswietlanieKomunikatow;

public class TablicaWynikowApp {
    private static final String WERSJA_PROGRAMU = "Tablica Wyników v3";

    public static void main(String[] args) {
        WyswietlanieKomunikatow wK = new WyswietlanieKomunikatow();
        wK.wyswietlKomunikat(WERSJA_PROGRAMU);

        TablicaWynikowCon tablicaWynikowCon = new TablicaWynikowCon();
        tablicaWynikowCon.petlaWyboruOpcji();
    }
}
