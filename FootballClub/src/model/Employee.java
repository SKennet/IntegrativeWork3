package model;

public abstract class Employee{
	String employeeName;
	int id;
	String state;
	int salary;
	
	public Employee(String employeeName, int id, String state, int salary){
		this.employeeName = employeeName;
		this.id = id;
		this.state = state;
		this.salary = salary;
	}
	
	public String showEmployeeInfo(){
		String msg = "";
		
		msg += "\n";
		msg += "Nombre: " + employeeName + "\n";
		msg += "Id: " + id + "\n";
		msg += "Estado: " + state + "\n";
		msg += "Salario: $" + salary + "\n";
		
		return msg;
	}
	
	
	//Setters.
	public void setId(int newId){
		id = newId;
	}
	public void setName(String newName){
		employeeName = newName;
	}
	public void setState(String newState){
		state = newState;
	}
	public void setSalary(int newSalary){
		salary = newSalary;
	}
	
	//Getters.
	public int getId(){
		return id;
	}
	public String getName(){
		return employeeName;
	}
	public String getState(){
		return state;
	}
	public int getSalary(){
		return salary;
	}
}