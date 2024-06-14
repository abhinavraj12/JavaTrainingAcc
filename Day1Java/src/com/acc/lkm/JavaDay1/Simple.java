package com.acc.lkm.JavaDay1;

public class Simple {
 int a=100;//instance var
 static String org="Accenture";
 void set(int x) {  //local var
	 System.out.println(x);
 }
 void diplay() {
	// System.out.println(a);
 }
 static {
	 System.out.println(org);
 }
 { 
	 a=500;
	 System.out.println(a);
 }
	public static void main(String[] args) {
		
		Simple simple=new Simple();
		System.out.println(simple);
		simple.set(300);
		System.out.println(simple.a);
		Car car=new Car();
		car.default_access();
		//System.out.println(org);

	}

}
