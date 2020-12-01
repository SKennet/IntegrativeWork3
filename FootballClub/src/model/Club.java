package model;
import model;

public class Club{
	int nit;
	String name, fundationDate;
	
	//Employees constants.
	private final static int MAXIMUM_PLAYERS = 50, MAXIMUM_MAIN_COACHES = 2, MAXIMUM_ASSISTANT_COACHES = 6;
	
	//Employees.
	Players [] allPlayers = new Players [MAXIMUM_PLAYERS];
	MainCoach allMainCoaches = new MainCoach [MAXIMUM_MAIN_COACHES];
	AssistantCoach allAssistantCoach = new AssistantCoach[MAXIMUM_ASSISTANT_COACHES];
	
	
	public Club(int nit, String name, String fundationDate){
		this.nit = nit;
		this.name = name;
		this.fundationDate = fundationDate;
	}
	
	//This methods are for "hiring" employees.
	public String addPlayer(int shirtNum, int goles, double markAverage, int position){
		String msg = "";
		boolean space = false;
		
		for(int i = 0; i < MAXIMUM_PLAYERS && !space ; i++){
			if(allPlayers[i] != null){
				space = true;
				allPlayers [i] = new Player(shirtNum, goles, markAverage, position);
				msg = "Jugador agregado correctamente.";
			}
			else{
				msg = "No se pudo agregar el jugador. Espacio insuficiente.";
			}
		}
		return msg;		
	}
	
	public String addMainCoach(int experienceYears, int teamsManaged, int championshipsWinned){
		String msg = "";
		boolean space = false;
		
		for(int i = 0; i < MAXIMUM_MAIN_COACHES && !space ; i++){
			if(allMainCoaches[i] != null){
				space = true;
				allMainCoaches[i] = new MainCoach(experienceYears, teamsManaged, championshipsWinned);
				msg = "Entrenador principal añadido correctamente.";
			}
			else{
				msg = "No se pudo agregar al entrenador principal. Espacio insuficiente.";
			}
		}
		return msg;
	}
	
	public String addAssistantCoach(int experienceYears, boolean wasPlayer, String expertise){
		String msg = "";
		boolean space = false;
		
		for(int i = 0; i < MAXIMUM_ASSISTANT_COACHES && !space ; i++){
			if(allAssistantCoach[i] != null){
				space = true;
				allMainCoaches[i] = new AssistantCoach(experienceYears, wasPlayer, expertise);
				msg = "Asistente técnico añadido correctamente.";
			}
			else{
				msg = "No se pudo agregar al asistente técnico. Espacio insuficiente.";
			}
		}
		return msg;
	}
}