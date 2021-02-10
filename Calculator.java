package com.epam.java_basic.calculator;
import static java.lang.Math.round;

public class Calculator {
	static int p;
    public Calculator(int precision) {
        p=precision;
    }

    public double add(double a, double b) {
    	double c;
        c=a+b;
        return (Math.round(c*p*10)/(p*10));
    }

    public double subtract(double a, double b) {
        double d;
        d=a-b;
        return (Math.round(d*p*10)/(p*10));
    }

    public double multiply(double a, double b) 
    {
    	 double d;
         d=a*b;
         return (Math.round(d*p*10)/(p*10));
    }

    public double div(double a, double b) {
   	 double d;
        d=a/b;
        return (Math.round(d*p*10)/(p*10));
   }
}
