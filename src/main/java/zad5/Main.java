package zad5;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pair <Integer, String> pair = new Pair<>(5, "kot");
        Pair <Integer, Pair<String, String>> pair2 = new Pair<>(8, new Pair<>("pies", "kot"));
        System.out.println(pair);
        System.out.println(pair2);

        List<Integer> list = Arrays.asList(5,6,8,9);
        Pair <List, String> pair3 = new Pair<>(list, "OK");
        System.out.println(pair3);

    }
}
