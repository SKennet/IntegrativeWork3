package model;
import model;

public class AssistantCoach extends Employee{
	int experienceYears;
	boolean wasPlayer;
	String expertise, name;
	
	public AssistantCoach(int experienceYears, boolean wasPlayer, String expertise, String name, int id, boolean state, int salary){
		super(name, id, state, salary);
		
		this.name = name;
		this.experienceYears = experienceYears;
		this.wasPlayer = wasPlayer;
		this.expertise = expertise;
		
		String player = "";
		if(wasPlayer == true){
			player = "Sí"; 
		}
		else{
			player = "No";
		}
	}
	
	@Override
	public String showEmployeeInfo(){
		String msg = super.showEmployeeInfo();
		msg += "Años de experiencia: " + experienceYears + "\n";
		msg += player + "ha sido jugador profesional antes." + "\n";
		msg += "Su experticia es: " + expertise + "\n";
		msg += "\n";
	}
	
	//Getters.
	@Override
	public int getId(){
		return super.getId();
	}
	
	@Override
	public int getSalary(){
		return super.getSalary;
	}
	
	@Override
	public String getName(){
		return super.getName();
	}
	
	@Override
	public boolean getState(){
		return super.getState();
	}
	
	public int getExperienceYears(){
		return experienceYears;
	}
	public boolean getWasPlayer(){
		return wasPlayer;
	}
	public String getExpertise(){
		return expertise;
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
	public void setState(boolean newState){
		super.setState(newState);
	}
	
	public void setExperienceYears(int newExperience){
		experienceYears = newExperience;
	}
	public void setWasPlayer(boolean newPast){
		wasPlayer = newPast;
	}
	public void setExpertise(String newExpertise){
		expertise = newExpertise;
	}
}