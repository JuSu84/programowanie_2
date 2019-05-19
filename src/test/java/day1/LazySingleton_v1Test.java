package day1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LazySingleton_v1Test {

    @Test
    public void getInstance_true() {

        Assert.assertEquals(LazySingleton_v1.getInstance(), LazySingleton_v1.getInstance());

    }
    @Test
    public void getInstance_false() {

        Assert.assertNotEquals(LazySingleton_v1.getInstance(), LazySingleton_v1.getInstance());

    }
}