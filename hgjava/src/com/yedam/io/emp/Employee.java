package com.yedam.io.emp;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable {
	private int empNo;
	private String empName;
	private String email;
	private Date hireDate;
	private int salary;
	
	public Employee(int empNo, String empName, String email, Date hireDate, int salary) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.email = email;
		this.hireDate = hireDate;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", email=" + email + ", hireDate=" + hireDate
				+ ", salary=" + salary + "]";
	}
	
	
}
