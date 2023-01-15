/**
 * Zasada komplentarności w genetyce dotyczy łączenia się zasad azotowych, które występują w kwasach nukleinowych (np. DNA)
 * Zgodnie z zasadą zasady azotowe DNA łączą się ze sobą zgodnie ze schematem:
 * cytozyna (C) ←→ guanina (G)
 * tymina (T) ←→ adenina (A)
 * <p>
 * Napisz ciało metody findComplementaryChain, która dla dowolnego łańcucha DNA zwróci łańcuch komplementarny
 * <p>
 * np: GAGAAACGGGA ma zamienić się na CTCTTTCCCT
 */

public class Zadanie2 {

    public String findComplementaryChain(String chain) {
        String complementaryChain = "";
        for (int i = 0; i < chain.length(); i++) {
            char currentElement = chain.charAt(i);

//            if (currentElement == 'G') {
//                currentElement = 'C';
//            } else if (currentElement == 'A') {
//                currentElement = 'T';
//            } else if (currentElement == 'C') {
//                currentElement = 'G';
//            } else if (currentElement == 'T') {
//                currentElement = 'A';
//            }

            switch (currentElement) {
                case 'G' -> currentElement = 'C';
                case 'C' -> currentElement = 'G';
                case 'A' -> currentElement = 'T';
                case 'T' -> currentElement = 'A';
            }

            complementaryChain = complementaryChain + currentElement;
        }


        return complementaryChain;
    }
}
