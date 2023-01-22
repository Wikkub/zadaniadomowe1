package zad4;

/*
Zadanie 4
Stwórz klasę enum Continent, która będzie zawierać informację o nazwie kontynentu oraz jego powierzchni (https://pl.wikipedia.org/wiki/Kontynent).
W ramach enuma zdeklaruj wszystkie kontynenty oraz metody statyczne do:
- zwracania największego kontynentu (skorzystaj z metody values())
- zwracania najmniejszego kontynentu (skorzystajc z metody values
 */

import java.util.Arrays;

public enum Continent {
    AFRICA(30.4),
    SOUTH_AMERICA(17.8),
    NORTH_AMERICA(24.2),
    ANTARCTICA(13.2),
    AUSTRALIA(7.7),
    EURASIA(54.8);

    private double area;

    Continent(double area) {
        this.area = area;
    }

    public static Continent getLargestContinent() {
        Continent[] continents = Continent.values();
        Continent largestContinent = continents[0];

        for (int i = 1; i < continents.length; i++) {
            if (continents[i].area > largestContinent.area) {
                largestContinent = continents[i];
            }
        }
        return largestContinent;
    }

    public static Continent getSmallestContinent() {
        Continent[] continents = Continent.values();
        Continent smallestContinent = continents[0];

        for (int i = 1; i < continents.length; i++) {
            if (continents[i].area < smallestContinent.area) {
                smallestContinent = continents[i];
            }
        }
        return smallestContinent;
    }


}
