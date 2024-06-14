package com.acc.lkm.dao;

import com.acc.lkm.businessbean.EmployeeBean;

public interface EmployeeDAO {
	Integer addEmployee(EmployeeBean employeeBean)throws Exception;
	EmployeeBean getEmployeeDetails(Integer id)throws Exception;
}
