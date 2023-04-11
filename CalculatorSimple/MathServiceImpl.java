package com.CalculatorSimple;

class PavanException extends Exception {
	public PavanException(String str) {
		super(str);
	}
}

public class MathServiceImpl implements MathService {
	

	public double add(double a, double b) {
		
		return a+b;
	}

	public double substract(double a, double b) {
		
		return a-b;
	}

	public double multiply(double a, double b) {
		
		return a*b;
	}

	public double divide(double a, double b) {
		double r;
		
		try {
			 r=a/b;
			if (b==0 || b>a)
				throw new PavanException("Do not want to print Zero or infinity");
		} catch(PavanException e) {
			 r=a/1;
			System.out.println("Thats your default value : " +e);
			}
		return r;
	}


}
