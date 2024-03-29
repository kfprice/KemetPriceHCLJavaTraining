package com.kfprice.ems.service;

import java.util.List;

import com.kfprice.ems.dao.EmployeeDAOMySqlImpl;
import com.kfprice.ems.dao.IEmployeeDAO;
import com.kfprice.ems.dto.Employee;
import com.kfprice.ems.exceptions.EmployeeNotFoundException;

public class EmployeeServiceImpl implements IEmployeeService{
	
	private IEmployeeDAO empDao = new EmployeeDAOMySqlImpl();
	
	@Override
	public void addEmployee(Employee e) {
		
		empDao.addEmployee(e);
	}
	
	@Override
	public void deleteEmployee(int empid) {
		
		empDao.deleteEmployee(empid);
	}

	@Override
	public void updateEmployee(Employee e) {
		empDao.updateEmployee(e);
	}

	@Override
	public Employee findEmployee(Employee e) throws EmployeeNotFoundException{
		return empDao.findEmployee(e);
		
	}

	@Override
	public List<Employee> showAllEmployee(){
		
		return empDao.showAllEmployee();
		
	}

}
