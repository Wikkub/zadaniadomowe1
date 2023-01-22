package zad5;

public class Pair <first, second> {
    private first pairFirstElement;
    private second pairSecondElement;

    public Pair (first first, second second) {
        this.pairFirstElement = first;
        this.pairSecondElement = second;
    }

    public first first () {
        return this.pairFirstElement;
    }

    public second second () {
        return this.pairSecondElement;
    }

    public String toString () {
        return this.pairFirstElement.toString() + " " + this.pairSecondElement.toString();
    }

}
