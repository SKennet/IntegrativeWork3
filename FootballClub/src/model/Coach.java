package model;
import model.*;

public class Coach extends Employee{
	
	//Coach variables.
	int experienceYears;
	
	//Super variables.
	int id, salary;
	String name, state;
	
	public Coach(String name, int id, String state, int salary, int experienceYears){
		super(name, id, state, salary);
		this.id = id;
		this.salary = salary;
		this.name = name;
		this.state = state;
		this.experienceYears = experienceYears;
	}
	
	@Override
	public String showEmployeeInfo(){
		String msg = super.showEmployeeInfo();
		msg += "Años de experiencia: " + experienceYears + "\n";
		return msg;
	}
	
	//Getters.
	@Override
	public int getId(){
		return super.getId();
	}
	
	@Override
	public int getSalary(){
		return super.getSalary();
	}
	
	@Override
	public String getName(){
		return super.getName();
	}
	
	@Override
	public String getState(){
		return super.getState();
	}
	
	public int getExperienceYears(){
		return experienceYears;
	}
	
	//Setters.
	@Override
	public void setId(int newId){
		super.setId(newId);
	}
	
	@Override
	public void setSalary(int newSalary){
		super.setSalary(newSalary);
	}
	
	@Override
	public void setName(String newName){
		super.setName(newName);
	}
	
	@Override
	public void setState(String newState){
		super.setState(newState);
	}
	
	public void setExperienceYears(int newExperience){
		experienceYears = newExperience;
	}
}