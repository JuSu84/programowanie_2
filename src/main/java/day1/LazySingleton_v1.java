package day1;


public class LazySingleton_v1 {


    private static LazySingleton_v1 INSTANCE;

    private LazySingleton_v1() {
    }

    public synchronized static LazySingleton_v1 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazySingleton_v1();
        }
        return INSTANCE;
    }
}

class LazySingleton_v2 {
    private LazySingleton_v2() {
    }

    private static class LazyHolder {
        static final LazySingleton_v2 INSTANCE = new LazySingleton_v2();
    }

    public static LazySingleton_v2 getInstance() {
        return LazyHolder.INSTANCE;
    }
}