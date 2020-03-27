package myapp.zapispunktacjigry.model;

public class Zawodnik {
    String imieZawodnika;
    int punktacja;
    int poziomUkonczony;
    int bonus = 100;

    public Zawodnik(String imieZawodnika, int punktacja, int poziomUkonczony) {
        this.imieZawodnika = imieZawodnika;
        this.punktacja = punktacja;
        this.poziomUkonczony = poziomUkonczony;
    }

    public void wyswietlDaneZawodnika() {
        String daneZawodnika = "Pan " + imieZawodnika + " zdobył " + punktacja + " punktów i ukończył " + poziomUkonczony + " poziom/y/ów";
        System.out.println(daneZawodnika);
    }

    public int przeliczPunktacje() {
        return (punktacja + (poziomUkonczony * bonus));
    }
}
