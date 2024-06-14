package com.acc.lkm.InheritanceDemo;

public class Trainer extends Organisation {

	public Trainer() {
		//super(200);
		System.out.println("Training on Java");
	}
	protected void set() {
		
	}
	public void training(String stream) {
		System.out.println(stream);
	}
	protected void details(String name,int base_id) {
		System.out.println("Child");
		System.out.println(name+" "+base_id);
	}
}
