package day1;

import org.junit.Assert;
import org.junit.Test;

import java.time.Duration;
import java.time.Instant;

public class FizzBuzzTest {

    @Test
    public void if_shouldBeNumber(){
        Assert.assertEquals(new FizzBuzz(1).toString(), "1");
        Assert.assertEquals(new FizzBuzz(4).toString(), "4");
    }

    @Test
    public void czyPodzielnePrzez_3_Fizz(){
        Assert.assertEquals(new FizzBuzz(3).toString(), "Fizz");
        Assert.assertEquals(new FizzBuzz(6).toString(), "Fizz");
    }
    @Test
    public void czyPodzielnePrzez_5_Buzz(){
        Assert.assertEquals(new FizzBuzz(5).toString(), "Buzz");
        Assert.assertEquals(new FizzBuzz(10).toString(), "Buzz");
    }
    @Test
    public void czyPodzielnePrzez_3_5_FizzBuzz(){
        Assert.assertEquals(new FizzBuzz(15).toString(), "FizzBuzz");
        Assert.assertEquals(new FizzBuzz(30).toString(), "FizzBuzz");
    }
    @Test
    public void test_czyPodzielna_v1(){
        Instant start = Instant.now();

        for (int i = 0; i < 1000000; i++) {
           // System.out.println(new FizzBuzz(i));
            new FizzBuzz(i).czyPodzielna_v1();
        }

        Instant end = Instant.now();

        long duration = Duration.between(start,end).toMillis();
        System.out.println("test_czyPodzielna_v1: Duration: " + duration + " millisecond");

//***************************************************************************************************

        start = Instant.now();

        for (int i = 0; i < 1000000; i++) {
           // System.out.println(new FizzBuzz(i));
            new FizzBuzz(i).czyPodzielna_v2();
        }

         end = Instant.now();

       duration = Duration.between(start,end).toMillis();
        System.out.println("test_czyPodzielna_v2: Duration: " + duration + " millisecond");
    }


}
