package com.stockprice.consumer.stockPriceConsumer.repo;

import java.util.HashMap;
import java.util.Map;

public class LoginPassword {
    public static void main(String[] args) {
        String user_id;
        String password = new String();
        System.out.println(("login"));
        System.out.println("username");
        // user_id = logInPassword.next();
        System.out.println("password");
        //  password = password.next;
        // users check = new users ( user_id, password);
//        if(user_id.equals(user_id)  && password.equals(password))
//            System.out.println("logged in");

    }
    static Map<String, String>  loginPasswordMap= new HashMap<>();
    static {
        loginPasswordMap.put("test123","password1");
        loginPasswordMap.put("test345","password2");
        loginPasswordMap.put("test678","password3");
    }

    public boolean validateLogin(String userId,String password) {
        String passwordFromMap =loginPasswordMap.get(userId);
        if(passwordFromMap!=null){
            if(passwordFromMap.equals(password)) {
                return true;
            }else {
                return false;
            }

        }
        return false;
    }




}
