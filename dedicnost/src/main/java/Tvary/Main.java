package Tvary;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Loader loader = new Loader();
        List<Tvar> vysledekTvaru = loader.loadShapes("input.txt");
        System.out.println("Průměrný obsah je");
        System.out.println(prumernyObsah(vysledekTvaru));
        System.out.println("Průměrný obvod je");
        System.out.println(prumernyObvod(vysledekTvaru));
    }

    private static Double prumernyObsah(List<Tvar> kolekceTvaru) {
        Double vysledek = 0D;
        for (int i = 0; i < kolekceTvaru.size(); i++) {
            vysledek = vysledek + kolekceTvaru.get(i).surface();
        }
        vysledek = vysledek / kolekceTvaru.size();
        return vysledek;
    }

    private static Double prumernyObvod(List<Tvar> kolekceTvaru) {
        Double vysledek = 0D;
        for (int i = 0; i < kolekceTvaru.size(); i++) {
            vysledek = vysledek + kolekceTvaru.get(i).circumference();
        }
        vysledek = vysledek / kolekceTvaru.size();
        return vysledek;
    }
}
