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
	
	//Shows the info that the user it's asking for.
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
			
			case 4: if(allTeams != null){
						msg = allTeams[position].showTeamInfo();
					}
					break;
					
			case 5:	msg = "Información del club: \n";
					msg += "Nit: " + nit + "\n";
					msg += "Nombre: " + name + "\n";
					msg += "Fecha de fundación:" + fundationDate + "\n";
					msg += "\n";	
					break;
			
			default: msg = "Tipo de información inexistente.";
					break;
		}
	}
	
	//Shows all the info.
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
		msg += "Información de los equipos: \n";
		for(int i = 0; i < MAXIMUM_TEAMS ! space ; i++){
			if(allTeams[i] != null){
				msg += allTeams[i].showTeamInfo();
			}
		}
		msg += "\n";
		space = false;
		
		//Employees info.
		msg += "Información de los empleados: \n";
		for(int i = 0; i<MAXIMUM_MAIN_COACHES && !space ; i++){
			if(allMainCoaches[i] != null){
				msg += allMainCoaches[i].showEmployeeInfo();
				space = true;
			}
		}
		msg += "\n";
		space = false;
		
		for(int i = 0; i<MAXIMUM_MAIN_COACHES && !space ; i++){
			if(allMainCoaches[i] != null){
				msg += allMainCoaches[i].showEmployeeInfo();
				space = true;
			}
		}
		msg += "\n";
		space = false;
		
		for(int i = 0; i<MAXIMUM_MAIN_COACHES && !space ; i++){
			if(allMainCoaches[i] != null){
				msg += allMainCoaches[i].showEmployeeInfo();
				space = true;
			}
		}
		msg += "\n";
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
			if(allAssistantCoaches[i] != null){
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
	
	//This methods are for firing people.
	public String removeMainCoach(int position){
		position = position-1;
		
		MainCoach [] temporalArray = new MainCoach[MAXIMUM_MAIN_COACHES];
		
		if(allMainCoaches[i] != allMainCoaches[position]){
			temporalArray[i] = allMainCoaches[i];
		}
		
		allMainCoaches = temporalArray;
		
		String msg = "Entrenador principal despedido exitosamente.";
		return msg;
	}
	
	public String removeAssistantCoach(int position){
		position = position-1;
		
		AssistantCoach [] temporalArray = new AssistantCoach[MAXIMUM_ASSISTANT_COACHES];
		
		if(allAssistantCoaches[i] != allAssistantCoaches[position]){
			temporalArray[i] = allAssistantCoaches[i];
		}
		
		allAssistantCoaches = temporalArray;
		
		String msg = "Asistente técnico despedido exitosamente.";
		return msg;
	}
	
	public String removePlayer(int position){
		position = position-1;
		
		Player [] temporalArray = new Player[MAXIMUM_PLAYERS];
		
		if(allPlayers[i] != allPlayers[position]){
			temporalArray[i] = allPlayers[i];
		}
		
		allPlayers = temporalArray;
		
		String msg = "Jugador despedido exitosamente.";
		return msg;
	}

	//This methods shows the info. Are going to be used in the menu selection.
	public String showMainCoaches(){
		String msg = "";
		boolean space = false;
		
		for(int i = 0; i < MAXIMUM_MAIN_COACHES && !space ; i++){
			if(allMainCoaches[i] != null){
				msg += allMainCoaches[i].showEmployeeInfo();
			}
			else{
				space = true;
			}
		}
	}
	
	public String showAssistantCoaches(){
		String msg = "";
		boolean space = false;
		
		for(int i = 0; i < MAXIMUM_MAIN_COACHES && !space ; i++){
			if(allMainCoaches[i] != null){
				msg += allMainCoaches[i].showEmployeeInfo();
			}
			else{
				space = true;
			}
		}
	}
}