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
//systax of funtion
    // {access specifier}  {return type} {name of function}( input variables ) { body };
    public double multiply(double a, double b){
        return a*b;
    }
//    public double squareRoot(double a) { return a

    public int factorial(int n){
        if (n==0) return 1;
        int result =1;
        for ( int i=1;i<=n;){
            result=i*result;
            i=i+1;
//        else return( n* factorial(n-1));
        
        }
        return result;

    }
}
