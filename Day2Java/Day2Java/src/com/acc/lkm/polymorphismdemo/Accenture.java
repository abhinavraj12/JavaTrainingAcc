package com.acc.lkm.polymorphismdemo;

public class Accenture extends DynamicUpcasting {
void project(long projid) {
	System.out.println("Hii");
	System.out.println(projid);
}
void project(String proj) {
	//System.out.println("Hii");
	System.out.println(proj);
}
void project(String proj1,String Proj2) {
	//System.out.println("Hii");
	System.out.println(proj1+" "+Proj2);
}
void set() {
	System.out.println("method of child");
}
void stream(String name) {
	System.out.println(name);
}
{
	System.out.println(EID);
}
	public static void main(String[] args) {
		DynamicUpcasting dynamicUpcasting=(DynamicUpcasting)new Accenture();//Upcasting
		DynamicUpcasting dynamicUpcasting2=(DynamicUpcasting)new Accenture();//Upcasting
		dynamicUpcasting.project(234567L);
		dynamicUpcasting.set();
		dynamicUpcasting2.set();
		
		//dynamicUpcasting.stream("Java");
		//DownCasting
		Accenture accenture=(Accenture)dynamicUpcasting;//Downcasting
		accenture.project(44);
		accenture.EID=4552111L;
		accenture.project("Hybris");
		accenture.project("Hybris","Java");
		

	}

}
