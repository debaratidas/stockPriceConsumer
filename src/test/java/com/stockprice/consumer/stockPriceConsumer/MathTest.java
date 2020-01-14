package com.stockprice.consumer.stockPriceConsumer;


import org.junit.Assert;
import org.junit.Test;

public class MathTest {

//    public static void main(String argv[]) {
//
//
//        testAdd();
//        testSubtraction();
//        testDivision();
//        testMultiplication();
//        testDivisionbyZero();
//
//    }
//     @Test
     public void testAdd() {
        Math math = new Math();
//         Assert.assertEquals(math.add(1,2,3),6,0);
        if(math.add(1,2,3)==6) {
            System.out.println("Pass Addion");
        }else {
            System.out.println("Fail");
        }
//         Assert.assertEquals(math.add(4,5,6),15,0);
        if(math.add(4,5,6)==14) {
            System.out.println("Pass Addion");
        }else {
            System.out.println("Fail");
        }
    }
    @Test
    public void testSubtraction() {
        Math math = new Math();
        Assert.assertEquals(math.subtract(75, 25), 50,0);
    if(math.subtract(75, 25) == 50) {
            System.out.println("Pass Subtraction");
        } else {
            System.out.println("Fail Subtraction");
        }

    }
    @Test
    public void testDivision() {
        Math math = new Math();
        Assert.assertEquals(math.divide(50,25),2, 0);

        if (math.divide(50, 25) == 2) {
            System.out.println("Pass divide");
        } else {
            System.out.println("Fail divide");
        }
    }
    @Test
    public void testMultiplication() {
        Math math = new Math();
        double actual = math.multiply(10,2);
        Assert.assertEquals(20, actual,0);

    }
    @Test
    public void testDivisionbyZero() {

        Math math = new Math();
       Assert.assertEquals(math.divide(50, 0), Double.POSITIVE_INFINITY,0);
//        System.out.println("value for division by zero"+math.divide(50, 0));
//        if (math.divide(50, 0) == 0) {
//            System.out.println("Pass divide");
//        } else {
//            System.out.println("Fail divide");
//        }
    }
}
