package com.acc.lkm.InheritanceDemo;

public class Entity implements emp1,emp2 {

	public static void main(String[] args) {
		Entity entity=new Entity();
		ProjectLead projectl=new Entity();
		System.out.println(entity.details1("Sunil"));
		System.out.println(entity.details2("Aman"));
		entity.project(100);
		System.out.println(ProjectLead.org("Accenture"));
		projectl.id(45556);

	}

	@Override
	public void project(int project_id) {
		System.out.println(project_id);
		
	}

	@Override
	public String details2(String emp_name) {
		// TODO Auto-generated method stub
		return emp_name;
	}

	@Override
	public String details1(String emp_name) {
		// TODO Auto-generated method stub
		return emp_name;
	}

	

}
