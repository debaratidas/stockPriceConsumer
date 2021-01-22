package com.stockprice.consumer.stockPriceConsumer;

import myjava.learning.CalculateArea;
import org.junit.Assert;
import org.junit.Test;

import java.lang.Math;

public class CalculateAreaTest {


    @Test
    public void  testarea(){

        CalculateArea x = new CalculateArea();
        int area = x.calculateAreaOfRectanle(10,8);
        Assert.assertEquals(80, area);

    }

    @Test
    public void  testCircleArea(){
        CalculateArea y = new CalculateArea();
        double area = Math.ceil( y.calculateAreaOfCircle(8.0));
        Assert.assertEquals(  201, area,1l);
    }


}


