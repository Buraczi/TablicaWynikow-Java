package myapp.tablicawynikow.model;

//TBD
public class SortBabelkoweTablicyWynikow {
    static TablicaWynikow tablicaWynikow = new TablicaWynikow();
    static Zawodnik[] zawodnicy = new Zawodnik[tablicaWynikow.getIloscZawodnikow()];
    public static void sortowanieTablicyWynikow(){
        boolean posortowane = false;
        Zawodnik zawodnikTymczasowy;
        while (!posortowane) {
            posortowane = true;
            for (int i = 0; i < tablicaWynikow.getIloscZawodnikow()-1; i++) {
                if (zawodnicy[i].getSumaPunktacji() < zawodnicy[i+1].getSumaPunktacji()) {
                    zawodnikTymczasowy = zawodnicy[i];
                    zawodnicy[i] = zawodnicy[i+1];
                    zawodnicy[i+1] = zawodnikTymczasowy;
                    posortowane = false;
                }
            }
        }
    }

}
