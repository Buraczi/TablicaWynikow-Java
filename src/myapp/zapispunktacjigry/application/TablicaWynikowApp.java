package myapp.zapispunktacjigry.application;

public class TablicaWynikowApp {
    public static void main(String[] args) {
        final String wersjaProgramu = "Tablica Wyników v3";
        System.out.println(wersjaProgramu);

        TablicaWynikowCon tablicaWynikowCon = new TablicaWynikowCon();
        tablicaWynikowCon.petlaWyboruOpcji();
    }
}
