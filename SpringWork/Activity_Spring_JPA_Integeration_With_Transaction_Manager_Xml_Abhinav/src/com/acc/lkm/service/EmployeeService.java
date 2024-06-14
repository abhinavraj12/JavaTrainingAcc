package com.acc.lkm.service;

import com.acc.lkm.businessbean.EmployeeBean;

public interface EmployeeService {
Integer addEmployee(EmployeeBean employeeBean)throws Exception;
EmployeeBean getEmployeeDetails(Integer id)throws Exception;
}
