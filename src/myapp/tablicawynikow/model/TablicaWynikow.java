package myapp.tablicawynikow.model;

import myapp.tablicawynikow.io.WyswietlanieKomunikatow;

public class TablicaWynikow {
    WyswietlanieKomunikatow wK = new WyswietlanieKomunikatow();
    private static final int ILOSC_POZYCJI_W_TABLICY = 100;
    private Zawodnik[] zawodnicy = new Zawodnik[ILOSC_POZYCJI_W_TABLICY];
    private int iloscZawodnikow = 0;

    public void dodajZawodnika(Zawodnik zawodnik) {
        if (iloscZawodnikow < ILOSC_POZYCJI_W_TABLICY) {
            zawodnicy[iloscZawodnikow] = zawodnik;
            iloscZawodnikow++;
        } else {
            wK.wyswietlKomunikat("Nie ma miejsca w tablicy wyników!");
        }
    }

    public void wyswietlZawodnikowWTabeli() {
        if (iloscZawodnikow == 0) {
            wK.wyswietlKomunikat("Brak zawodników w tabeli!");
        }

        for (int i = 0; i < iloscZawodnikow; i++) {
            zawodnicy[i].wyswietlDaneZawodnika();
        }
    }

    //sortowanie bąbelkowe - funkcja
    public void sortowanieTablicyWynikow(){
        boolean posortowane = false;
        Zawodnik zawodnikTymczasowy;
        while (!posortowane) {
            posortowane = true;
            for (int i = 0; i < iloscZawodnikow-1; i++) {
                if (zawodnicy[i].getSumaPunktacji() < zawodnicy[i+1].getSumaPunktacji()) {
                    zawodnikTymczasowy = zawodnicy[i];
                    zawodnicy[i] = zawodnicy[i+1];
                    zawodnicy[i+1] = zawodnikTymczasowy;
                    posortowane = false;
                }
            }
        }
    }

    public int getIloscZawodnikow() {
        return iloscZawodnikow;
    }
}
