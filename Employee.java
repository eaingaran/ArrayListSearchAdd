package com;

public class Employee 
{
	private int empId;
	private String empName;
	private String city;
	public Employee(int empId, String empName, String city) 
	{
		super();
		this.empId = empId;
		this.empName = empName;
		this.city = city;
	}
	
	public Employee() 
	{
		super();
	}

	public int getEmpId() 
	{
		return empId;
	}
	public void setEmpId(int empId) 
	{
		this.empId = empId;
	}
	public String getEmpName() 
	{
		return empName;
	}
	public void setEmpName(String empName) 
	{
		this.empName = empName;
	}
	public String getCity() 
	{
		return city;
	}
	public void setCity(String city) 
	{
		this.city = city;
	}
	
}
