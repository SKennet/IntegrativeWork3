package model;
import model;

public class Team{
	
	private static final int MAXIMUM_PLAYERS = 25, ASSISTANTS = 3;
	String teamName;
	
	Player [] players;
	MainCoach mainTrainer;
	AssistantCoach [] assistants;
	ArrayList <Alineation> alineations;
		
	
	public Team(String teamName){
		this.teamName = teamName;
		players = new Player [MAXIMUM_PLAYERS];
		assistants = new AssistantCoach [ASSISTANTS];
		alineations  = new ArrayList <Alineation> ();
	}
}