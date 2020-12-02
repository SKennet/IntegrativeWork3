package model;
import model;

public class Club{
	int nit;
	String name, fundationDate;
	
	//Employees constants.
	private final static int MAXIMUM_PLAYERS = 50, MAXIMUM_MAIN_COACHES = 2, MAXIMUM_ASSISTANT_COACHES = 6, MAXIMUM_TEAMS = 2;
	
	//Employees.
	Players [] allPlayers = new Players [MAXIMUM_PLAYERS];
	MainCoach [] allMainCoaches = new MainCoach [MAXIMUM_MAIN_COACHES];
	AssistantCoach [] allAssistantCoaches = new AssistantCoach[MAXIMUM_ASSISTANT_COACHES];
	Team [] allTeams = new Team [MAXIMUM_TEAMS];
	
	
	public Club(int nit, String name, String fundationDate){
		this.nit = nit;
		this.name = name;
		this.fundationDate = fundationDate;
	}
	
	public String showParticularInfo(int type, int position){
		boolean space = false;
		String msg = "";
		position = position-1;
		
		switch(type){
			case 1: if(allMainCoaches != null){
						msg = allMainCoaches[position].showEmployeeInfo();
					}
					break;
					
			case 2: if(allAssistantCoaches != null){
						msg = allAssistantCoaches[position].showEmployeeInfo();
					}
					break;		
			
			case 3: if(allPlayers != null){
						msg = allPlayers[position].showEmployeeInfo();
					}
					break;
			
			default: msg = "Tipo de empleado inexistente.";
					break;
		}
	}
	
	public String showAllInfo(){
		boolean space = false;
		String msg = "";
		
		//Club info.
		msg = "Información del club: \n";
		msg += "Nit: " + nit + "\n";
		msg += "Nombre: " + name + "\n";
		msg += "Fecha de fundación:" + fundationDate + "\n";
		msg += "\n";
		
		//Teams info.
		
		//Employees info.
		msg += "Información de los empleados: \n";
		for(int i = 0; i<MAXIMUM_MAIN_COACHES && !space ; i++){
			if(allMainCoaches[i] != null){
				msg += allMainCoaches[i].showEmployeeInfo();
				space = true;
			}
		}
		space = false;
		
		for(int i = 0; i<MAXIMUM_MAIN_COACHES && !space ; i++){
			if(allMainCoaches[i] != null){
				msg += allMainCoaches[i].showEmployeeInfo();
				space = true;
			}
		}
		space = false;
		
		for(int i = 0; i<MAXIMUM_MAIN_COACHES && !space ; i++){
			if(allMainCoaches[i] != null){
				msg += allMainCoaches[i].showEmployeeInfo();
				space = true;
			}
		}
		return msg;
	}
	
	//This methods are for assign employees to the teams.
	public assignPlayer(int playerPosition, int teamChoosed){
		Player playerToAsign;
		
		//Because the arrays starts from zero.
		playerPosition = playerPosition-1;
		teamChoosed = teamChoosed-1;
		
		playerToAsign = allPlayers[playerPosition];
		

		if(allPlayers[playerPosition] != null){
			if(allTeams[teamChoosed] != null){
				msg = allTeams[teamChoosed].addPlayer(playerToAsign);
			}
			else{
				msg = "No se pudo asignar. Equipo inexistente.";
			}
		}
		else{
			msg = "No se pudo asignar. Empleado inexistente." 
		}
		
		return msg;
	}
	
	public String assignMainCoach(int coachPosition, int teamChoosed){
		MainCoach coachToAsign;
		
		//Because the arrays starts from zero.
		coachPosition = coachPosition-1;
		teamChoosed = teamChoosed-1;
		
		coachToAsign = allMainCoaches[coachPosition];
		
		
		if(allMainCoaches[coachPosition] != null){
			if(allTeams[teamChoosed] != null){
				msg = allTeams[teamChoosed].addMainCoach(coachToAsign);
			}
			else{
				msg = "No se pudo asignar. Equipo inexistente.";
			}
		}
		else{
			msg = "No se pudo asignar. Empleado inexistente." 
		}
		return msg;
	}
	
	public String assignAssistantCoach(int coachPosition, int teamChoosed){
		AssistantCoach coachToAsign;
		
		//Because the arrays starts from zero.
		coachPosition = coachPosition-1;
		teamChoosed = teamChoosed-1;
		
		coachToAsign = allAssistantCoaches[coachPosition];
		
		
		if(allMainCoaches[coachPosition] != null){
			if(allTeams[teamChoosed] != null){
				msg = allTeams[teamChoosed].addAssistantCoach(coachToAsign);
			}
			else{
				msg = "No se pudo asignar. Equipo inexistente.";
			}
		}
		else{
			msg = "No se pudo asignar. Empleado inexistente." 
		}
		return msg;
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
				allAssistantCoaches[i] = new AssistantCoach(experienceYears, wasPlayer, expertise);
				msg = "Asistente técnico añadido correctamente.";
			}
			else{
				msg = "No se pudo agregar al asistente técnico. Espacio insuficiente.";
			}
		}
		return msg;
	}
}