package com.employees.pojo;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {

	private int employee_id;
	private String first_name;
	private String last_name;
	private String email;
	private String phone_number;
	private Date hire_date;
	private int job_id;
	private BigDecimal salary;
	private int manager_id;
	private int department_id;
	
	public int getEmployee_id() {
		return employee_id;
	}
	
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	
	public String getFirst_name() {
		return first_name;
	}
	
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	
	public String getLast_name() {
		return last_name;
	}
	
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhone_number() {
		return phone_number;
	}
	
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	
	public Date getHire_date() {
		return hire_date;
	}
	
	public void setHire_date(Date hire_date) {
		this.hire_date = hire_date;
	}
	
	public int getJob_id() {
		return job_id;
	}
	
	public void setJob_id(int job_id) {
		this.job_id = job_id;
	}
	
	public BigDecimal getSalary() {
		return salary;
	}
	
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	
	public int getManager_id() {
		return manager_id;
	}
	
	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}
	
	public int getDepartment_id() {
		return department_id;
	}
	
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}

	public String getFormattedHireDate() {
        if (hire_date == null) {
            return null;
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return dateFormat.format(hire_date);
    }

   
    public void setFormattedHireDate(String formattedDate) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            this.hire_date = new Date(dateFormat.parse(formattedDate).getTime());
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }
    }
    
    
    public Employee(int employee_id, String first_name, String last_name, String email, String phone_number, Date hire_date, int job_id, BigDecimal salary, int manager_id, int department_id) {
    	this.employee_id = employee_id;
    	this.first_name = first_name;
    	this.last_name = last_name;
    	this.email = email;
    	this.phone_number = phone_number;
    	this.hire_date = hire_date;
    	this.job_id = job_id;
    	this.salary = salary;
    	this.manager_id = manager_id;
    	this.department_id = department_id;
    }
	
	
}
