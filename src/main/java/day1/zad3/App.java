package day1.zad3;

public class App {

    private static Thread t1;
    private static Thread t2;
    private static Thread t3;
    private static Thread t4;


    public static void main(String[] args) {

        t1 = new Thread(new ThreadPlaygroungRunnable("watek 1"));
        t2 = new Thread(new ThreadPlaygroungRunnable("watek 2"));
        t3 = new Thread(new ThreadPlaygroungRunnable("watek 3"));
        t4 = new Thread(new ThreadPlaygroungRunnable("watek 4"));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
