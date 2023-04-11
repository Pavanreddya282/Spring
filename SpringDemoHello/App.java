package com.SpringDemoHello;

import org.springframework.context.ApplicationContext;

import org.springframework.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
   public static void main(String[] args) {       
       ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");       
       /*HelloWorld obj= (HelloWorld) context.getBean("helloWorld");       
       System.out.println(obj.getMessage());
       HelloWorld obj1= (HelloWorld) context.getBean("helloYou");
       System.out.println(obj1.getName());
       System.out.println(obj1.getMobile());
       System.out.println(obj1.getAddress());
       System.out.println(obj1.getRole());
       
       Employee obj2= (Employee) context.getBean("helConstructor");
       System.out.println(obj2.eno +" : "+obj2.ename+ " : "+obj2.esal);
       */
       
       Employee1 obj3= (Employee1)context.getBean("obj3");
       /*obj3.setId(33);
       obj3.setName("pavan");
       obj3.setCity("Bangalore");*/
       
       obj3.display();
       
       /*Question qt= (Question) context.getBean("qt");
       qt.display();*/
       
   
   }
}
