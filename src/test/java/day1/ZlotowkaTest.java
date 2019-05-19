package day1;

import org.junit.Assert;
import org.junit.Test;

public class ZlotowkaTest {

    @Test
    public void test1_toString() {
        Assert.assertEquals("2,00 PLN", new Zlotowka(2).toString());
        Assert.assertEquals("4,00 PLN", new Zlotowka(4).toString());
    }

    @Test
    public void test2_toString() {
        Assert.assertEquals("7,50 PLN", new Zlotowka(7.50).toString());
        Assert.assertEquals("15,25 PLN", new Zlotowka(15.25).toString());
    }

    @Test
    public void test3_equals() {
        Zlotowka z1 = new Zlotowka(7.5);
        Zlotowka z2 = new Zlotowka(7.5);
        Assert.assertEquals(z1, z2);
    }

    @Test
    public void test4_notEquals() {
        Zlotowka z1 = new Zlotowka(7.5);
        Zlotowka z2 = new Zlotowka(8.5);
        Assert.assertNotEquals(z1, z2);
    }

    @Test
    public void test5_odejmowanie() {
        Zlotowka z1 = new Zlotowka(7.5);
        Zlotowka z2 = new Zlotowka(8.5);

        Assert.assertEquals(new Zlotowka(1.03).minus(new Zlotowka(0.42)), new Zlotowka(0.61));
    }

}
