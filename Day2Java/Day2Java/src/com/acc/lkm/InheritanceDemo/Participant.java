package com.acc.lkm.InheritanceDemo;

public class Participant extends Organisation{
	String facility="BDC";
	Participant(){
		super();
		//super(500);
		//super.facility="PDC";
		System.out.println("Learning Java Inheritance");
		System.out.println(super.facility);
	}
	
	void learning(String stream1,String stream2) {
		
		System.out.println(stream1+" "+stream2);
		//super.details("Accenture", "Mumbai");
	}
	void session() {
		System.out.println("Inheritance");
	}

	public static void main(String[] args) {
		Organisation organisation=new Organisation();
		Participant  participant=new Participant();
		Trainer trainer=new Trainer();
		Trainer trainer2=new Trainer();
		participant.learning("Java","Python");
		trainer.details("Bikash", 73);
		trainer2.details("Accenture", 31);
		//participant.training("Java SE");
		

	}

}
