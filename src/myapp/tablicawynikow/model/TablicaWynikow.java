package myapp.tablicawynikow.model;

public class TablicaWynikow {
    private final int iloscPozycjiWTablicy = 100;
    private Zawodnik[] zawodnicy = new Zawodnik[iloscPozycjiWTablicy];
    private int iloscZawodnikow = 0;

    public void dodajZawodnika(Zawodnik zawodnik) {
        if (iloscZawodnikow < iloscPozycjiWTablicy) {
            zawodnicy[iloscZawodnikow] = zawodnik;
            iloscZawodnikow++;
        } else {
            System.out.println("Nie ma miejsca w tablicy wyników!");
        }
    }

    public void wyswietlZawodnikowWTabeli() {
        if (iloscZawodnikow == 0) {
            System.out.println("Brak zawodników w tabeli!");
        }

        for (int i = 0; i < iloscZawodnikow; i++) {
            zawodnicy[i].wyswietlDaneZawodnika();


        }
    }
}
