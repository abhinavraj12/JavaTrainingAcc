package com.acc.lkm.accessdemo;
import java.util.Date;

import com.acc.lkm.JavaDay1.*;
public class AccessModifiersDemo {
	
	public static void main(String[] args) {
		Car car=new Car();
		Car car2=new Car("Audi","White",new Date());
		//Functioanlity of cars
		car.start();
		car2.start();
		System.out.println(car.details("BMW", "Black",new java.util.Date(System.currentTimeMillis()), "Camry"));
		System.out.println(car.details("Audi", "Red",new java.util.Date(System.currentTimeMillis()), "Civic"));
        car.stop();
        car2.stop();
        car.drive();
        car2.drive();
	}

}
