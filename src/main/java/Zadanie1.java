import java.util.ArrayList;
import java.util.List;

/**
 * Liczba doskonała to liczba, której suma dzielników bez niej samej równa jest tej liczbie
 * 6 jest liczbą doskonałą, bo jej dzielniki to: 1,2,3,6 a 1+2+3 = 6
 * 28 jest liczbą doskonałą, bo jej dzielniki to: 1,2,4,7,28 a 1+2+4+7 = 28
 * <p>
 * Zadanie: napisz ciało metody findNPerfectNumbers, która znajdzie n pierwszych liczb doskonałych i zwróci je w postaci tablicy int[]
 */

public class Zadanie1 {

    public List<Integer> findNPerfectNumbers(int n) {
        int x = 1;
        int found = 0;

        ArrayList<Integer> perfectNumbersList = new ArrayList();

        while (found != n) {
            if (isPerfectNumber(x) == true) {
                perfectNumbersList.add(x);
                found = found + 1;
            }
            x++;
        }
        return perfectNumbersList;
    }

    private boolean isPerfectNumber(int x) {
        int sum = 0;
        for (int i = 1; i < x; i++) {
            if (x % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == x) {
            return true;
        }
        return false;
    }
}

