package model;
import model;

public class AssistantCoach extends Employee{
	int experienceYears;
	boolean wasPlayer;
	String expertise;
	
	public AssistantCoach(int experienceYears, boolean wasPlayer, String expertise){
		this.experienceYears = experienceYears;
		this.wasPlayer = wasPlayer;
		this.expertise = expertise;
	}
}