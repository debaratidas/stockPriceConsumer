package com.stockprice.consumer.stockPriceConsumer;

import org.junit.Assert;
import org.junit.Test;

public class IceCreamMakerTest {
    @Test
    public  void makeIceCreamTest(){
        IceCreamMaker iceCreamMaker =new IceCreamMaker();
        IceCream iceCream=iceCreamMaker.make(0,"Vanila","Cup");
        Assert.assertEquals("smallcup",iceCream.getContainerType());
    }
   }



