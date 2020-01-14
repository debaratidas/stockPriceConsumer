package com.stockprice.consumer.stockPriceConsumer;

import net.bytebuddy.implementation.bind.MethodDelegationBinder;

public class Math {
    public double add(double a, double b, double c){
        return a+b+c; // instruction for addition
    }

    public double add(double a, double b, double c,double d){
        return a+b+c+d; // instruction for addition
    }

    public double subtract (double a , double b){
        return a-b; //instruction for subtraction
    }

    public double divide (double a, double b){
        return a/b;
    }

    public double multiply(double a, double b){
        return a*b;
    }



}
