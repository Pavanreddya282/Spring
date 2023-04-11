package com.SpringDemoHello;

public class Employee1 {
	private int id;
	private String name;
	private String city;
	private Address address;
	private Question qt;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Question getQt() {
		return qt;
	}
	public void setQt(Question qt) {
		this.qt = qt;
	}
	public void display() {
		System.out.println("EmployeeID : "+id);
		System.out.println("EmployeeName : "+name);
		System.out.println("EmployeeCity : "+city);
		System.out.println("Address : " +address);
		System.out.println("Question :" +qt);
	}

}
