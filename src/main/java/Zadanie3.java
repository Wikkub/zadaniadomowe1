import java.util.*;

/**
 * Lista imion może zawierać duplikaty, których chcemy uniknąć.
 * Napisz ciało metody removeDuplicates, która zwróci listę imion bez duplikatów
 */

public class Zadanie3 {


    private final List<String> imiona = Arrays.asList("Tomek", "Damian", "Damian", "Kamil", "Karol", "Janusz", "Karol");

    public List<String> removeDuplicates(List<String> names) {
        ArrayList<String> newList = new ArrayList();
        newList.add(names.get(0));

//        Set<String> s = new HashSet<>();
//        s.addAll(names);
//        return s.stream().toList();

        for (int i = 1; i < names.size(); i++) {
            String currentElement = names.get(i);
            boolean duplicated = false;
            for (int j = 0; j < newList.size(); j++) {
                String newListElement = newList.get(j);
                if (currentElement.equals(newListElement)) {
                    duplicated = true;
                }
            }
            if (!duplicated) {
                newList.add(currentElement);
            }
        }
        return newList;
    }
}
