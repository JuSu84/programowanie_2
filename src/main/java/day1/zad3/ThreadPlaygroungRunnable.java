package day1.zad3;

import java.util.concurrent.TimeUnit;

public class ThreadPlaygroungRunnable implements Runnable {

    public String name;

    public ThreadPlaygroungRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName() + " name: " + name + " licznik : " + i );

//            try {
//                TimeUnit.SECONDS.(1);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}
