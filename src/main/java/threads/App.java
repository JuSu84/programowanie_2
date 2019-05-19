import threads.MyThread;

public class App {

    public static void main(String[] args) {

        MyThread s1 = new MyThread();
        MyThread s2 = new MyThread();
        MyThread s3 = new MyThread();

        s1.start();
        s2.start();
        s3.start();
    }
}
