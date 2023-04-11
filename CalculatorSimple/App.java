package com.CalculatorSimple;

import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context= new ClassPathXmlApplicationContext("ApplicationContext.xml");
    	
    	CalculatorService calc = (CalculatorService) context.getBean("simpleCalculator");
    	
    	double a=25.0;
    	double b=5.0;
    	
    	double ad = calc.add(a, b);
    	double su = calc.substract(a, b);
    	double mu = calc.multiply(ad, su);
    	double dv = calc.divide(a, b);
    	
    	
    	System.out.println("Addition : "+ad+ ",  Substraction : "+su+",  Multiplication : "+mu+",  Division : "+dv);
    }
}
