package com.CalculatorSimple;


public class CalculatorService {
	
	private MathService mathService;

	public void setMathService(MathService mathService) {
		this.mathService = mathService;
	}

	public double add(double x, double y) {
		return mathService.add(x,y);
	}
	
	public double substract(double x, double y) {
		return mathService.substract(x,y);
	}
	
	public double multiply(double x, double y) {
		return mathService.multiply(x,y);
	}
	
	public double divide(double x, double y) {
		return mathService.divide(x,y);
	}

}

