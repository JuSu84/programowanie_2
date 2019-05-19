package day2;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;


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

    @Test
    public void test5_peek(){
        QueueSDA queue = new QueueSDA(3);
        queue.push("a");
        queue.push("b");
        queue.push("c");
        Assert.assertEquals(queue.peek(), "a");
    }

    @Test
    public void test6_print(){
        QueueSDA queue = new QueueSDA(3);
        queue.push("a");
        queue.push("b");
        queue.push("c");

        Assert.assertEquals(queue.print(),"size: 3, elements: [ a, b, c ]" );

    }
    @Test
    public void test7_typyGeneryczne(){
        QueueSDA queue = new QueueSDA(3);
        queue.push("a");
        queue.push("1");
        queue.push(new Date());

        Assert.assertEquals(queue.getSize(), 3);

        QueueSDA<Integer> integerQueueSDA = new QueueSDA(4);
        QueueSDA<Double> doubleQueueSDA = new QueueSDA(5);
        QueueSDA<String> stringQueueSDA = new QueueSDA(7);
        QueueSDA<Date> dateQueueSDA = new QueueSDA(9);

        Assert.assertEquals(integerQueueSDA.getMaxSize(), 4);
        Assert.assertEquals(doubleQueueSDA.getMaxSize(), 5);
        Assert.assertEquals(stringQueueSDA.getMaxSize(), 7);
        Assert.assertEquals(dateQueueSDA.getMaxSize(), 9);
    }
    @Test
    public void test8_addingAndRemovingItems_moreAddsThanCapacity() {
        QueueSDA<Integer> queue = new QueueSDA<>(5);
        queue.push(1); // head 1
        queue.push(2); // head 2
        queue.push(3); // head 3
        queue.push(4); // head 4
        queue.push(5); // head 0
        queue.pop(); // tail 1
        queue.push(6);  // head 1
        queue.pop(); // tail 2
        queue.push(7);  // head 2
        queue.pop(); // tail 3
        queue.pop(); // tail 4
        queue.pop(); // tail 0
        queue.pop(); // tail 1
        queue.pop(); // tail 2
    }

}
