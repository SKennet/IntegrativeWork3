package model;
import model.*;

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
	
	public String showTeamInfo(){
		
		String msg = "\n";
		msg += "Nombre del equipo: " + teamName + "\n";
		msg += "Entrenador principal: " + mainTrainer.name + "\n";
		msg += "Asistentes técnicos: ";
		
		for(int i = 0 ; i < ASSISTANTS ; i++){
			if(assistants[i] != null){
				msg += assistants[i].name + ", ";
			}
		}
		return msg;
	}
	
	
	//This methods add employees to the team.
	public String addMainCoach(MainCoach mainCoach){
		String msg = "";
		
		if(mainTrainer == null){
			mainTrainer = mainCoach;
			msg = "Entrenador principal asignado correctamente.";
		}
		else{
			msg = "No se pudo asignar el entrenador principal. No hay cupo.";
		}
		return msg;
	}
	
	public String addPlayers(Player player){
		String msg = "";
		boolean space = false;
		
		for(int i = 0; i < MAXIMUM_PLAYERS && !space ; i++){
			if(players[i] == null){
				players[i] = player;
				msg = "Jugador asignado correctamente.";
			}
			else{
				msg = "No se pudo asignar al jugador. No hay cupo.";
			}
		}
		return msg;
	}
	
	public String addAssistantCoach(AssistantCoach technicalAssistant){
		String msg = "";
		boolean space = false;
		
		for(int i = 0; i < ASSISTANTS && !space ; i++){
			if(assistants[i] == null){
				assistants[i] = technicalAssistant;
				msg = "Asistente técnico asignado correctamente.";
			}
			else{
				msg = "No se pudo asignar al asistente técnico. No hay cupo.";
			}
		}
		return msg;
	}
}