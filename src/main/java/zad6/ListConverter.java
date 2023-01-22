package zad6;

import java.util.List;

public class ListConverter {

    public static List<Integer> convert (List<String> list) {
        return list.stream().map(value -> {
            try {
                return Integer.parseInt(value);
            } catch (Exception e) {
                return null;
            }
        }).toList();
    }
}
