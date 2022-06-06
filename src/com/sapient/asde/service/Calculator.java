package com.sapient.asde.service;

public class Calculator {
    public double add(double number1,double number2){
        return number1+number2;
    }

    public double sub(double number1,double number2){
        return number1-number2;
    }

    public double mul(double number1,double number2){
        return number1*number2;
    }

    public double div(double number1,double number2){
        try {
            if(number2==0.0){
                throw new Exception("denominator cannot be zero")
            }
            return number1 / number2;
        }catch(Exception e){
            e.printStackTrace();
        }
        return 0.0;
    }
}
