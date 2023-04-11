package com.SpringDemoHello;

//import jdk.incubator.vector.VectorOperators.Test;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Employee {
	
	int eno;
	String ename;
	double esal;
	Test t;

	public Employee(int eno,String ename,double esal,Test t) {
		super();
		this.eno=eno;
		this.ename=ename;
		this.esal=esal;
		this.t=t;
	}
	@Override
	public String toString() {
	return eno+ename+esal+(t.toString());
	}
}
