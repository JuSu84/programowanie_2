package day2;

import org.junit.Assert;
import org.junit.Test;

public class QueueSDATest {

    @Test
    public void test1_create(){
        QueueSDA queue = new QueueSDA(10);
        Assert.assertEquals(queue.getMaxSize(), 10);
    }
    @Test
    public void test2_addItemToFifo(){
        QueueSDA queue = new QueueSDA(10);
        queue.push("pierwszy element");
        queue.push("drugi element");

        Assert.assertEquals(queue.getSize(), 2);

        Assert.assertEquals(queue.pop(), "pierwszy element");
        Assert.assertEquals(queue.pop(), "drugi element");
    }

    @Test (expected = NoItemsInQueueException.class)
    public void test3_isEmptyException(){
        QueueSDA queue = new QueueSDA(10);
        queue.pop();

    }
    @Test(expected = QueueIsFullException.class)
    public void test4_isFullException(){
        QueueSDA queue = new QueueSDA(3);
        queue.push("a");
        queue.push("b");
        queue.push("c");
        queue.push("d");

    }
}
