package day1;

import java.util.Objects;

public class Zlotowka {

    private int value;

    public Zlotowka(double value) {
        this.value = (int) (value * 100.0);
    }

    @Override
    public String toString() {
        return String.format("%.2f PLN", (double) value / 100);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zlotowka zlotowka = (Zlotowka) o;
        return Double.compare(zlotowka.value, value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    public Zlotowka minus(Zlotowka v) {
        Zlotowka result = new Zlotowka(0);
        result.value = value - v.value;
        return result;
    }
}
