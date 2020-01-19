package com.stockprice.consumer.stockPriceConsumer;
import org.junit.Assert;
import org.junit.Test;


public class LogInPasswordTest {
    @Test
    public  void testvalidatelogin(){


        LoginPassword loginPassword = new LoginPassword();
        boolean actualResult1= loginPassword.validateLogin("test123", "password1");

        Assert.assertEquals(true,actualResult1);

        boolean actualResult2= loginPassword.validateLogin("testasd23", "password1");

        Assert.assertEquals(false,actualResult2);
    }

}
