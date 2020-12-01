package model;

public class Employee{
	String employeeName;
	int id;
	boolean state;
	int salary;
	
	public Employee(String employeeName, int id, boolean state, int salary){
		this.employeeName = employeeName;
		this.id = id;
		this.state = state;
		this.salary = salary;
	}
}