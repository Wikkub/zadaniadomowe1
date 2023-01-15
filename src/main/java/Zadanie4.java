import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Zaimplementuj BubbleSort
 * Napisz ciało metody, która dla dowolnej tablicy int[] zwróci tablicę posortowaną za pomocą algorytmu bubble sort
 * Opis bubble sort masz np tu: https://www.youtube.com/watch?v=xli_FI7CuzA lub tu: https://www.geeksforgeeks.org/bubble-sort/
 */

public class Zadanie4 {
    static List<Integer> numbers2 = Arrays.asList(8, 3, 400, 900, 6543, 1, 65, 754, 21, 0);

    public static List<Integer> bubbleSort(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 1; j < numbers.size() - i; j++) {
                int currentNumber = numbers.get(j);
                int previousNumber = numbers.get(j - 1);
                if (previousNumber > currentNumber) {
                    numbers = swapNumbers(numbers, j - 1, j);
                }
            }
        }

        return numbers;
    }

    public static List<Integer> swapNumbers(List<Integer> tablica, int index1, int index2) {
        int number2 = tablica.get(index1);
        tablica.set(index1, tablica.get(index2));
        tablica.set(index2, number2);
        return tablica;
    }
}
