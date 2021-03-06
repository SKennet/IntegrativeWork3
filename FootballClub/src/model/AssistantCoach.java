package model;
import model.*;

public class AssistantCoach extends Coach{
	int experienceYears;
	boolean wasPlayer;
	String expertise, name, player;
	
	public AssistantCoach(int experienceYears, boolean wasPlayer, String expertise, String name, int id, String state, int salary){
		super(name, id, state, salary, experienceYears);
		
		this.name = name;
		this.experienceYears = experienceYears;
		this.wasPlayer = wasPlayer;
		this.expertise = expertise;
		
		player = "";
		if(wasPlayer == true){
			player = "S�"; 
		}
		else{
			player = "No";
		}
	}
	
	@Override
	public String showEmployeeInfo(){
		String msg = super.showEmployeeInfo();
		msg += player + "ha sido jugador profesional antes." + "\n";
		msg += "Su experticia es: " + expertise + "\n";
		msg += "\n";
		
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
	public void setState(String newState){
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