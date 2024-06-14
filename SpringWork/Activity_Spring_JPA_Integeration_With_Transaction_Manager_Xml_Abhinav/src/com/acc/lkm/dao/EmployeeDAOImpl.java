package com.acc.lkm.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.acc.lkm.businessbean.EmployeeBean;
import com.acc.lkm.entity.EmployeeEntity;


@Repository
@SuppressWarnings("unchechecked")
public class EmployeeDAOImpl implements EmployeeDAO{
	//@Autowired
	@PersistenceContext
	//private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;
    
	@Override
	//@Transactional(value="txManager")
	//@Transactional(value="txManager",readOnly=true)//Connection is read-only,Queries leading to data modification are not allowed
	@Transactional(value="txManager",timeout=7)
	public Integer addEmployee(EmployeeBean employeeBean) throws Exception {
     Integer employeeID=0;
    // EntityManager entityManager=null;
     EmployeeEntity employeeEntityBean=convertBeanToEntity(employeeBean);
     try {
    	 //entityManager=entityManagerFactory.createEntityManager();
    	// entityManager.getTransaction().begin();
    	 Thread.currentThread().sleep(5000);
    	 entityManager.persist(employeeEntityBean);
    	// entityManager.getTransaction().commit();
    	 employeeID=employeeEntityBean.getId();
    	 
     }catch(Exception ex) {
    	 throw ex;
     }finally {
    	 if(entityManager!=null) {
    		 entityManager.close();
    	 }
     }
    
		return employeeID;
	}

	

	@Override
	public EmployeeBean getEmployeeDetails(Integer id) throws Exception {
		EmployeeBean employeeBean=null;
		//EntityManager entityManager=null;
		try {
			//entityManager=entityManagerFactory.createEntityManager();
			EmployeeEntity employeeEntity=(EmployeeEntity)entityManager.find(EmployeeEntity.class, id);
			if(employeeEntity!=null) {
				employeeBean=convertEntityToBean(employeeEntity);
			}
		}catch(Exception ex) {
			throw ex;
		}finally {
			if(entityManager!=null) {
				entityManager.close();
			}
		}
		return employeeBean;
	}
	
	private EmployeeBean convertEntityToBean(EmployeeEntity employeeEntity) {
		EmployeeBean employee=new EmployeeBean();
		BeanUtils.copyProperties(employeeEntity,employee);
		return employee;
	}



	private EmployeeEntity convertBeanToEntity(EmployeeBean employeeBean) {
		EmployeeEntity employeeEntity=new EmployeeEntity();
		BeanUtils.copyProperties(employeeBean,employeeEntity);
		return employeeEntity;
	}

}
