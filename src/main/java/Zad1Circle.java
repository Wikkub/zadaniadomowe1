/*
Zad. 1
Napisz klasę Circle, która będzie zawierać infomrację taką jak:
- promień
Ukryj dostęp do pola klasy. Upublicznij mechanizm obliczania:
- pola koła
- obwodu okręgu
 */

import static java.lang.Math.PI;

public class Zad1Circle {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double circleArea() {
        return PI * (this.radius * this.radius);
    }

    public double circleCircuit() {
        return 2 * PI * radius;
    }
}
