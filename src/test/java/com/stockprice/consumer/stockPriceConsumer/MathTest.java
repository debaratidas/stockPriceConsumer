package com.stockprice.consumer.stockPriceConsumer;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathTest {



    @Test
    public void testfactorial(){
        Math math = new Math();
        int actual = math.factorial(4);
        Assertions.assertEquals(24, actual,24);
    }
}
