package day2;

import org.junit.Assert;
import org.junit.Test;

public class QueueSDATest {

    @Test
    public void test1_create(){
        QueueSDA queue = new QueueSDA(10);
        Assert.assertEquals(queue.getMaxSize(), 10);
    }
}
