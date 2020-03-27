package myapp.zapispunktacjigry.application;
import java.util.Arrays;
import myapp.zapispunktacjigry.io.OdczytDanychZawodnika;
import myapp.zapispunktacjigry.model.Zawodnik;

import java.util.Scanner;

public class ZapisPunktacjGry {

    public static void main(String[] args) {
        final String appVer = "Zapis Punktacji Gry v2";
        System.out.println(appVer);

        /*Scanner sc = new Scanner(System.in);

        System.out.print("Gra zakonczona (true/false)? ");
        boolean koniecGry = sc.nextBoolean();

        if (!koniecGry) {
            System.out.println("Graj dalej!");
            System.exit(0);
        } //wyłączone do odpalania programu na sztywno


        System.out.print("Podaj ilość zawodników: ");
        int iloscZawodnikow = sc.nextInt();
        Zawodnik[] zawodnik = new Zawodnik[iloscZawodnikow];
        OdczytDanychZawodnika odczytDanychZawodnika = new OdczytDanychZawodnika();

        for (int i = 0; i < iloscZawodnikow; i++ ){
            zawodnik[i] = odczytDanychZawodnika.pobierzDaneZawodnika();
        }

        odczytDanychZawodnika.zamknijOdczytScannera();*/ // wprowadzanie Zawodników przez terminal - wyłączone na potrzebe szybkiego testowania

        // stałe wartości pod algorytm sortujący (Pozycja W Tabeli)
        int iloscZawodnikow = 3;
        Zawodnik[] zawodnik = new Zawodnik[3];
        zawodnik[0] = new Zawodnik("Mikołaj", 20, 3);
        zawodnik[1] = new Zawodnik("Kamil", 1000, 6);
        zawodnik[2] = new Zawodnik("Mikołaj", 20_000, 1);

        System.out.println(zawodnik[1].przeliczPunktacje());

        for (int i = 0; i < iloscZawodnikow; i++) {
            System.out.println(zawodnik[i]);
        }


        /*for (int i = 0; i < iloscZawodnikow; i++) {
            zawodnik[i].wyswietlDaneZawodnika();
            System.out.println("Całkowita suma punktów: " + zawodnik[i].przeliczPunktacje());
        }

        for (int i = 0; i < iloscZawodnikow; i++) {
            System.out.println("Pozycja w tabeli: " + zawodnik[i].pozycjaWTabeli());
        }

        sc.close();*/ // wyświetlanie danych Zawodników przez terminal - wyłączone na potrzebe szybkiego testowania
    }
}