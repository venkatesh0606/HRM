package com.kstrata.apps.hrm.dao;

import java.util.List;

import com.kstrata.apps.hrm.model.Employee;
import com.kstrata.apps.hrm.model.EmployeeLeave;

public interface LeaveDAO {
	
	public EmployeeLeave getEmployeeLeaveById(Long id);
	
	public void saveOrUpdate(EmployeeLeave employeeLeave);

	public List<EmployeeLeave> getLeavesByEmployee(Employee employee, List<String> statusList);

	public void deleteEmployeeLeave(EmployeeLeave employeeLeave);

	public void updateEmployeeLeave(EmployeeLeave employeeLeave);

	public double getTotalLeavesByType(Employee employee, String leaveTypeShortName, String status);

	List<EmployeeLeave> getEmployeeLeavesByStatus(String status);

	public List<EmployeeLeave> getEmployeePassedLeaves(Employee emp);

	public List<EmployeeLeave> getEmployeeCurrentLeaves(Employee emp);

}
