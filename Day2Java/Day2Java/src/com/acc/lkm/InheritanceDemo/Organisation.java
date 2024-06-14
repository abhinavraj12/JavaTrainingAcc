package com.acc.lkm.InheritanceDemo;

public  class Organisation {
	final String facility="KDC";
	
	protected Organisation() {
		System.out.println("ACcenture");
	}
	  
	
	/*Organisation(int id) {
		System.out.println(id);
		

	}*/
	protected void get() {
		
	}

	 protected void details(String name,int location_id) {
		System.out.println("Parent");
		System.out.println(name+" "+location_id);
	}
}
