package com.acc.lkm.UIController;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.acc.lkm.businessbean.EmployeeBean;
import com.acc.lkm.service.EmployeeService;

public class UiTest {
	
	@SuppressWarnings("res")

	public static void main(String[] args) {
		EmployeeService employeeService=null;
		try {
			ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/acc/lkm/resources/cst_main_config.xml");
			employeeService=(EmployeeService)applicationContext.getBean("employeeServiceImpl");
			//Add Employee
			addEmployee(employeeService);
			
			//Retrieve Data
			//getEmployeeDetails(employeeService);
		}catch(Exception ex) {
			System.out.println(ex);
		}

	}

	private static void getEmployeeDetails(EmployeeService employeeService) {
		try {
			EmployeeBean employeeBean=employeeService.getEmployeeDetails(2);
			if(employeeBean==null) {
				System.out.println("Invalid Employee ID");
			}else {
				System.out.println("Employee Details:");
				System.out.println("Employee Name is:"+employeeBean.getName());
				System.out.println("Salary is:"+employeeBean.getSalary());
				System.out.println("Role is:"+employeeBean.getRole());
			}
		}catch(Exception ex) {
			System.out.println(ex);
		}
		
	}

	private static void addEmployee(EmployeeService employeeService) {
		EmployeeBean bean=new EmployeeBean();
		bean.setName("Aaron");
		bean.setRole("SSE");
		bean.setSalary(94000.00);
		bean.setInsert_time(new Date());
		try {
			int id=employeeService.addEmployee(bean);
			System.out.println("Employee Registered Successfully:"+id);
		}catch(Exception ex) {
			System.out.println(ex);
		}
		
	}

}
