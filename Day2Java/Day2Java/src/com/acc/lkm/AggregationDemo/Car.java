package com.acc.lkm.AggregationDemo;

import java.util.Date;

public class Car {
	String car_name;
	Date purchase_date;

	public Car(String car_name, Date purchase_date) {
		super();
		this.car_name = car_name;
		this.purchase_date = purchase_date;
	}

	public String getCar_name() {
		return car_name;
	}

	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}

	public Date getPurchase_date() {
		return purchase_date;
	}

	public void setPurchase_date(Date purchase_date) {
		this.purchase_date = purchase_date;
	}

}
