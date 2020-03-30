package myapp.zapispunktacjigry.model;

public class Zawodnik {
    String imieZawodnika;
    int punktacja;
    int poziomUkonczony;
    int sumaPunktacji;


    public Zawodnik(String imieZawodnika, int punktacja, int poziomUkonczony) {
        this.imieZawodnika = imieZawodnika;
        this.punktacja = punktacja;
        this.poziomUkonczony = poziomUkonczony;
        this.sumaPunktacji = punktacja + poziomUkonczony * 100; //100 to bonus
    }

    public void wyswietlDaneZawodnika() {
        String daneZawodnika = "Pan " + imieZawodnika + " zdobył " + punktacja + " punktów i ukończył " + poziomUkonczony + " poziom/y/ów. Wynik koncowy: " + sumaPunktacji;
        System.out.println(daneZawodnika);
    }
}
