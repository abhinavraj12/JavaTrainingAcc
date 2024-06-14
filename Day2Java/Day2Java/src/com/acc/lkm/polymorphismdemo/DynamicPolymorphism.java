package com.acc.lkm.polymorphismdemo;

public class DynamicPolymorphism {

	public static void main(String[] args) {
		Market europe,functions,market;
		europe=new Europe();//Upcasting
		functions=new Functions();
		market=new Market();
		System.out.println(market.marketrevenue(11.56));
		System.out.println(functions.marketrevenue(17.833));
		System.out.println(europe.marketrevenue(31.663));

	}

}
