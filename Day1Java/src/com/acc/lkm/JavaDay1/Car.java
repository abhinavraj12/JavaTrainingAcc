package com.acc.lkm.JavaDay1;

import java.util.Date;

public class Car {
public Car() {
		//super();
	System.out.println("This is Car class");
	}


public Car(String car_name, String color, Date date_of_purchase) {
	//super();
	this();
	this.car_name = car_name;
	this.color = color;
	this.date_of_purchase = date_of_purchase;
	System.out.println(car_name+" "+color+" "+date_of_purchase);
}


String car_name,color;
Date date_of_purchase;
String model;

 public void start() {
	System.out.println("Car has started");
}
 public void stop() {
	System.out.println("Car has stopped");
}
 public void drive() {
	System.out.println("Driver is driving ");
}
 void default_access() {
	 System.out.println("Accessing default members");
 }
public String details(String car_name,String color,Date date_of_purchase,String model) {
	this.drive();
	this.car_name=car_name;
	this.color=color;
	this.date_of_purchase=date_of_purchase;
	this.model=model;
	return this.car_name+"\n"+this.color+"\n"+this.date_of_purchase+"\n"+this.model;
}
	

}
