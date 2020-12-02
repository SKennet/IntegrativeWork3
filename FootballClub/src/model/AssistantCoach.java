package model;
import model;

public class AssistantCoach extends Employee{
	int experienceYears;
	boolean wasPlayer;
	String expertise;
	
	public AssistantCoach(int experienceYears, boolean wasPlayer, String expertise, String name, int id, boolean state, int salary){
		super(name, id, state, salary);
		
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
}