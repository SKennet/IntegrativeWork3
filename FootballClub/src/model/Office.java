package model;
import model;

public class Office{
	boolean space;
	Employee employeeAtOffice;
	
	public Office(boolean hasSpace){
		this.space = hasSpace;
	}
	
	public String addCoach(Employee employeeToAdd){
		
		if(space == true){
			employeeAtOffice = employeeToAdd;
			hasSpace = false;
		}
	}
	
	public boolean hasSpace(){
		return space;
	}
}