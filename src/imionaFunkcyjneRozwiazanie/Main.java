package imionaFunkcyjneRozwiazanie;

import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        List<String> imiona = Arrays.asList("Jakub", "Magdalena", "Kamil", "Aleksandra", "Paweł", "Zuzanna");

        long licznik = imiona.stream().
                filter(imie -> imie.length() == 9).
                count();

        System.out.println("Znaleziono " + licznik + " imie.");
    }
}
