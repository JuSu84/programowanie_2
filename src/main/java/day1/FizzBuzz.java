package day1;

public class FizzBuzz {

    private int liczba;



    public FizzBuzz(int liczba) {
        this.liczba = liczba;
    }

    public String czyPodzielna_v1() {
        String result = "" + this.liczba;

        if (this.liczba % 3 == 0) result = "Fizz";
        if (this.liczba % 5 == 0) result = "Buzz";
        if (this.liczba % 3 == 0 && this.liczba % 5 == 0) result = "FizzBuzz";
        if (this.liczba == 0) result = "0";
        return result;
    }

    public String czyPodzielna_v2() {
        String result;
        switch (this.liczba % 15) {
            case 3:
            case 6:
            case 9:
            case 12: // reszta z dzielenia podzielna przez 3
                result = "Fizz";
                break;
            case 5:
            case 10: // reszta z dzielenia podzielna przez 5
                result = "Buzz";
                break;
            case 0:
                result = "FizzBuzz";
                break;
            default:
                result = "" + this.liczba;
        }
        return result;
    }


    @Override
    public String toString() {
        return czyPodzielna_v1();
    }
}
