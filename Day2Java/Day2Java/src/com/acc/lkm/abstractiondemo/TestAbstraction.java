package com.acc.lkm.abstractiondemo;

public class TestAbstraction {

	public static void main(String[] args) {
		Technology tech1,tech2;
		Metaverse  metaverse=new Metaverse();
		tech1=new GenAI();
		tech2=new Metaverse();
		tech1.project("Azure");
		tech1.tech_code(11);
		tech2.project("SFDC");
		tech2.tech_code(33);
		System.out.println(metaverse.org("Accenture"));

	}

}
