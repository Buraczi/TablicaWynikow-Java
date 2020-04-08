package myapp.tablicawynikow.model;

import myapp.tablicawynikow.io.WyswietlanieKomunikatow;

public class Zawodnik {
    WyswietlanieKomunikatow wK = new WyswietlanieKomunikatow();
    String imieZawodnika;
    int punktacja;
    int poziomUkonczony;
    int sumaPunktacji;
    static int BONUS = 150;


    public Zawodnik(String imieZawodnika, int punktacja, int poziomUkonczony) {
        this.imieZawodnika = imieZawodnika;
        this.punktacja = punktacja;
        this.poziomUkonczony = poziomUkonczony;
        this.sumaPunktacji = punktacja + poziomUkonczony * BONUS; //100 to bonus
    }

    public void wyswietlDaneZawodnika() {
        String daneZawodnika = "Pan/Pani " + imieZawodnika + " zdobył " + punktacja + " punktów i ukończył " + poziomUkonczony + " poziom/y/ów. Wynik koncowy: " + sumaPunktacji;
        wK.wyswietlKomunikat(daneZawodnika);
    }

    public int getSumaPunktacji() {
        return sumaPunktacji;
    }
}
