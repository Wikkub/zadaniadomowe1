/*
Zadanie 3
Stwórz klasę movie z polami:
- title
- yearOfRelease
oraz zaimplementuj wymagane metody.
Stwórz interfejs MovieRepositoryApi który będzie deklarować podstawowe operacji na tablicy obiektów typu Movie:
- add
- delete
- findAll
- findByTitle
Napisz implementację interfejsu MovieRepository, która będzie implementować metody z interfejsu MovieRepositoryApi
 */
package task03;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
@Getter
public class Movie {
    private String title;
    private int yearOfRelease;
}
