package Tvary;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Loader {
    public List<Tvar> loadShapes(String fileName) throws IOException {
        BufferedReader reader;
        List<Tvar> vysledek = new ArrayList<>();
        reader = new BufferedReader(new FileReader(fileName));
        String radek = reader.readLine();
        while (radek != null) {
            Tvar tvar = tvarZRadku(radek);
            vysledek.add(tvar);
            radek = reader.readLine();
        }
        reader.close();
        return vysledek;
    }

    private Tvar tvarZRadku(String radek) {
        switch (radek.charAt(0)) {
            case 'S':
                return ctverecZRadku(radek);
            case 'R':
                return obdelnikZRadku(radek);
            case 'C':
                return kruhZRadku(radek);
        }
        return null;
    }

    private Obdelnik obdelnikZRadku(String radek) {
        String[] rozdeleni = radek.split(" ");
        return new Obdelnik(Double.parseDouble(rozdeleni[1]), Double.parseDouble(rozdeleni[2]));
    }

    private Ctverec ctverecZRadku(String radek) {
        String[] rozdeleni = radek.split(" ");
        return new Ctverec(Double.parseDouble(rozdeleni[1]));
    }

    private Kruh kruhZRadku(String radek) {
        String[] rozdeleni = radek.split(" ");
        return new Kruh(Double.parseDouble(rozdeleni[1]));
    }
}
