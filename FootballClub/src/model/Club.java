package model;
import model.*;
import java.util.ArrayList;

public class Club{
	int nit;
	String name, fundationDate;
	
	//Employees.
	ArrayList <Player> allPlayers = new ArrayList <Player>();
	ArrayList <MainCoach> allMainCoaches = new ArrayList <MainCoach>();
	ArrayList <AssistantCoach>  allAssistantCoaches = new ArrayList <AssistantCoach>();
	ArrayList <Team> allTeams = new ArrayList <Team>();
	ArrayList <Alineation> allAlineations = new ArrayList <Alineation>();
	
	//Offices.
	private final static int officesColumns = 6, officesRows = 6;
	int[][] offices = new int[officesColumns][officesRows];
	
	
	//Dreesing rooms.
	Team teamUsing1, teamUsing2;
	private final static int dreesingRoomColumns1 = 7, dreesingRoomRows1 = 6;
	private final static int dreesingRoomColumns2 = 7,	dreesingRoomRows2 = 7;
	
	int[][] dreesingRoom1 = new int[dreesingRoomColumns1][dreesingRoomRows1];
	int[][] dreesingRoom2 = new int[dreesingRoomColumns2][dreesingRoomRows2];

	
	
	public Club(int nit, String name, String fundationDate){
		this.nit = nit;
		this.name = name;
		this.fundationDate = fundationDate;
		
		offices[0][0] = 0;
		dreesingRoom1[0][0] = 0;
		dreesingRoom2[0][0] = 0;
	}
	
	//Shows the info  that the user it's asking for.
	public String showParticularInfo(int type){
		boolean space = false;
		String msg = "";
		int elements = 0;
		
		switch(type){
			case 1: 
					while(allMainCoaches.size() > elements){
						msg += allMainCoaches.get(elements).showEmployeeInfo();
						elements++;
					}
					if(allMainCoaches.size() == 0){
						msg = "Aún no hay entrenadores principales.";
					}
					break;
					
			case 2: 
					while(allAssistantCoaches.size() > elements){
						msg += allAssistantCoaches.get(elements).showEmployeeInfo();
						elements++;
					}
					if(allAssistantCoaches.size() == 0){
						msg = "Aún no hay asistentes técnicos.";
					}
					break;		
			
			case 3: 
					while(allPlayers.size() > elements){
						msg += allPlayers.get(elements).showEmployeeInfo();
						elements++;
					}
					if(allPlayers.size() == 0){
						msg = "Aún no hay jugadores.";
					}
					break;
			
			case 4: 
					while(allTeams.size() > elements){
						msg += allTeams.get(elements).showTeamInfo();
						elements++;
					}
					if(allTeams.size() == 0){
						msg = "Aún no hay equipos.";
					}
					break;
					
			case 5:	
				msg = "Información del club: \n";
					msg += "Nit: " + nit + "\n";
					msg += "Nombre: " + name + "\n";
					msg += "Fecha de fundación:" + fundationDate + "\n";
					msg += "\n";	
					break;
					
			default: 
					msg = "Tipo de información inexistente. Número inválido.";
					break;
		}
		return msg;
	}
	
	//Shows all the info.
	public String showAllInfo(){
		boolean space = false;
		String msg = "";
		int elements = 0;
		
		//Club info.
		msg = "Información del club: \n";
		msg += "Nit: " + nit + "\n";
		msg += "Nombre: " + name + "\n";
		msg += "Fecha de fundación:" + fundationDate + "\n";
		msg += "\n";
		
		//Teams info.
		msg += "Información de los equipos: \n";
		while(allTeams.size() >= elements){
				msg += allTeams.get(elements).showTeamInfo();	
				elements++;
		}
		elements = 0;
		msg += "\n";
		space = false;
		
		//Employees info.
		msg += "Información de los empleados: \n";
		while(allPlayers.size() >= elements){
			msg += allMainCoaches.get(elements).showEmployeeInfo();
			elements++;
		}
		elements = 0;
		msg += "\n";
		space = false;
		
		while(allMainCoaches.size() >= elements){
				msg += allMainCoaches.get(elements).showEmployeeInfo();
				elements++;
		}	
		elements = 0;
		msg += "\n";
		space = false;
		
		while(allAssistantCoaches.size() >= elements){
				msg += allAssistantCoaches.get(elements).showEmployeeInfo();
				elements++;
		}
		msg += "\n";
		return msg;
	}
	
	public String addTeam(String name){
		allTeams.add(new Team(name));
		String msg = "Equipo creado exitosamente.";
		return msg;
	}
	//This methods are for assign employees to the teams.
	public String assignPlayer(int playerPosition, int teamChoosed){
		Player playerToAsign;
		int elements;
		String msg = "";
		//Because the arrays starts from zero.
		playerPosition = playerPosition-1;
		teamChoosed = teamChoosed-1;
		
		playerToAsign = allPlayers.get(playerPosition);
		

		if(allPlayers.size() >= playerPosition){
			if(allTeams.size() >= teamChoosed){
				msg = allTeams.get(teamChoosed).addPlayer(playerToAsign);
			}
			else{
				msg = "No se pudo asignar. Equipo inexistente.";
			}
		}
		else{
			msg = "No se pudo asignar. Empleado inexistente.";
		}
		
		return msg;
	}
	
	public String assignMainCoach(int coachPosition, int teamChoosed){
		MainCoach coachToAsign;
		String msg = "";
		
		//Because the arrays starts from zero.
		coachPosition = coachPosition-1;
		teamChoosed = teamChoosed-1;
		
		coachToAsign = allMainCoaches.get(coachPosition);
		
		
		if(allMainCoaches.size() >= coachPosition){
			if(allTeams.size() >= teamChoosed){
				msg = allTeams.get(teamChoosed).addMainCoach(coachToAsign);
			}
			else{
				msg = "No se pudo asignar. Equipo inexistente.";
			}
		}
		else{
			msg = "No se pudo asignar. Empleado inexistente."; 
		}
		return msg;
	}
	
	public String assignAssistantCoach(int coachPosition, int teamChoosed){
		AssistantCoach coachToAsign;
		String msg = "";
		//Because the arrays starts from zero.
		coachPosition = coachPosition-1;
		teamChoosed = teamChoosed-1;
		
		coachToAsign = allAssistantCoaches.get(coachPosition);
		
		
		if(allMainCoaches.size() > coachPosition){
			if(allTeams.size() > teamChoosed){
				msg = allTeams.get(teamChoosed).addAssistantCoach(coachToAsign);
			}
			else{
				msg = "No se pudo asignar. Equipo inexistente.";
			}
		}
		else{
			msg = "No se pudo asignar. Empleado inexistente.";
		}
		return msg;
	}
	
	//This methods are for "hiring" employees.
	public String addPlayer(int shirtNum, int goles, double markAverage, int position, String name, int id, String state, int salary){
		String msg = "";
		
		allPlayers.add(new Player(shirtNum, goles, markAverage, position, name, id, state, salary));
		msg = "Jugador agregado correctamente.";

		return msg;		
	}
	
	public String addMainCoach(int experienceYears, int teamsManaged, int championshipsWinned, String name, int id, String state, int salary){
		String msg = "";
		
		allMainCoaches.add(new MainCoach(experienceYears, teamsManaged, championshipsWinned, name, id, state, salary));
		msg = "Entrenador principal añadido correctamente.";
			
		return msg;
	}
	
	public String addAssistantCoach(int experienceYears, String wasPlayer, String expertise, String name, int id, String state, int salary){
		String msg = "";
		boolean player = false;
		
		if(wasPlayer.equalsIgnoreCase("sí")){
			player = true;
		}
		
		allAssistantCoaches.add(new AssistantCoach(experienceYears, player, expertise, name, id, state, salary));
		msg = "Asistente técnico añadido correctamente.";

		return msg;
	}
	
	//This methods are for firing people.
	public String removeMainCoach(int position){
		position = position-1;
		
		allMainCoaches.get(position).setState("INACTIVO.");
		
		String msg = "Entrenador principal despedido exitosamente.";
		return msg;
	}
	
	public String removeAssistantCoach(int position){
		position = position-1;
		
		allAssistantCoaches.get(position).setState("INACTIVO.");
		
		String msg = "Asistente técnico despedido exitosamente.";
		return msg;
	}
	
	public String removePlayer(int position){
		position = position-1;

		allPlayers.get(position).setState("INACTIVO.");
		
		String msg = "Jugador despedido exitosamente.";
		return msg;
	}

	//This methods shows the info. Are going to be used in the menu selection.
	public String showMainCoaches(){
		String msg = "";
		boolean space = false;
		int i = 0;
		
		while(allMainCoaches.size() > i){
			msg += allMainCoaches.get(i).showEmployeeInfo();
			i++;
		}	
		return msg;
	}
	
	public String showAssistantCoaches(){
		String msg = "";
		boolean space = false;
		int i = 0;
		
		while(allAssistantCoaches.size() > i){
			msg += allAssistantCoaches.get(i).showEmployeeInfo();
			i++;
		}	
		return msg;
	}
	
	public String showPlayers(){
		String msg = "";
		boolean space = false;
		int i = 0;
		
		while(allPlayers.size() > i){
			msg += allPlayers.get(i).showEmployeeInfo();
			i++;
		}	
		return msg;
	}
	
	public String showTeams(){
		String msg = "";
		int i = 0;
		while(allTeams.size() > i){
			msg += allTeams.get(i).showTeamInfo();
			i++;
		}
		return msg;
	}
	
	//Use instalations methods.
	public String useOffices(int type, int coach){
		String msg = "";
		coach = coach-1;
		int coachToAsign;
		boolean space = false;
		
		if(type ==1){
			coachToAsign = allMainCoaches.get(coach).getId();
		}
		else{
			coachToAsign = allAssistantCoaches.get(coach).getId();
		}
		
		for(int i = 0; i < officesColumns && !space; i++){
			for(int j = 0; j < officesRows && !space; j++){
				if(offices[i][j] == 0){
					offices[i][j] = coachToAsign;
					offices[i][j+1] = 1;
					offices[i+1][j] = 1;
					space = true;
					msg = "El entrenador pudo entrar a una oficina exitosamente.";
				}
				else if(space != true){
					msg += "El entrenador NO pudo entrar a ninguna oficina. Espacio insuficiente.";
				}
			}
		}
		return msg;
	}
	
	public String useDreesingRooms(int player, Team playerTeam){
		player = player-1;
		Team teamPlayer = allPlayers.get(player).getTeam();
		String msg = "";
		boolean space = false;
		
		//I take the id because this must be unique. And it's easier to find the players this way.
		int playerToAdd = allPlayers.get(player).getId();
		
		//Dreesing room 1.
		if(dreesingRoom1[0][0] == 0){
			dreesingRoom1[0][0] = playerToAdd;
			teamUsing1 = teamPlayer;
		}
		else if(teamUsing1 == teamPlayer){
			for(int i = 0; i < dreesingRoomColumns1 && !space; i++){
				for(int j = 0; j < dreesingRoomRows1 ; j++){
					if(dreesingRoom1[i][j] == 0){
						msg = "Jugador añadido correctamente al camerino 1.";
						if(i == 7){
							dreesingRoom1[i][j+1] = 1;
						}
						else{
							dreesingRoom1[i+1][j+1] = 1;
						}
						dreesingRoom1[i][j] = playerToAdd;
						space = true;
					}
					else{
						msg = "El jugador no pudo ser añadido al camerino 1 por falta de espacio.";
					}
				}
			}
		}
		
		if(dreesingRoom2[0][0] == 0 && !space){
			dreesingRoom2[0][0] = playerToAdd;
			teamUsing2 = teamPlayer;
		}
		else if(teamUsing2 == teamPlayer){
			for(int i = 0; i <dreesingRoomColumns2 && !space; i++){
				for(int j = 0; j < dreesingRoomRows2 ; j++){
					if(dreesingRoom2[i][j] == 0){
						msg = "Jugador añadido correctamente al camerino 2.";
						if(i == 7 && j != 7){
							dreesingRoom2[i][j+1] = 1;
						}
						else if(i == 7 && j == 7){
							;
						}
						else if(i != 7 && j ==7){
							dreesingRoom2[i+1][j] = 1;
						}
						else{
							dreesingRoom2[i+1][j+1] = 1;
						}
						dreesingRoom2[i][j] = playerToAdd;
						space = true;
					}
					else{
						msg = "El jugador no pudo ser añadido al camerino 2 por falta de espacio.";
					}
				}
			}
		}
		else{
			msg = "El jugador no pudo ser agregado a ningun camerino, porque los están usando equipos distintos al suyo.";
		}
		return msg;
	}
	
	//Find employees methods.
	public String findCoach(int coachToFind, int type){
		coachToFind = coachToFind-1;
		int coachId = 0, officeFounded = 0;
		boolean founded = false;
		String msg = "";
		
		if(type == 1){
			coachId = allMainCoaches.get(coachToFind).getId();
		}
		else{
			coachId = allAssistantCoaches.get(coachToFind).getId();
		}
		
		for(int i = 0; i < officesColumns && !founded; i++){
			for(int j = 0; j < officesRows && !founded; j++){
				officeFounded ++;
				if(offices[i][j] == coachId){
					msg = "Entrenador encontrado en la oficina [" + i + "]" + "[" + j + "]" + " , es decir, en la oficina: " + officeFounded;
					founded = true;
				}
				else{
					msg = "El entrenador no se encuentra en ninguna oficina.";
				}
			}
		}
		return msg;
	}
	
	public String findPlayer(int player){
		player = player-1;
		int playerToFind = allPlayers.get(player).getId();
		int placeFounded = 0;
		String msg = "";
		boolean founded = false;
		
		for(int i = 0; i < dreesingRoomColumns1 && ! founded; i++){
			for(int j = 0; j < dreesingRoomRows1 ; j++){
				placeFounded++;
				if(dreesingRoom1[i][j] == playerToFind){
					msg = "Jugador encontrado en la posición [" + i + "] [" + j +"], es decir, en el espacio: " + placeFounded + ". Del camerino 1." ;
					founded = true;
				}
			}
		}
		
		for(int i = 0; i < dreesingRoomColumns2 && ! founded; i++){
			for(int j = 0; j < dreesingRoomRows2 ; j++){
				placeFounded++;
				if(dreesingRoom2[i][j] == playerToFind){
					msg = "Jugador encontrado en la posición [" + i + "] [" + j +"], es decir, en el espacio: " + placeFounded + ". Del camerino 2." ;
					founded = true;
				}
				else{
					msg = "El jugador no se encuentra en ningun camerino.";
				}
			}
		}
		return msg;
	}

	public String updateMainCoachInfo(int coach, int experienceYears, int teamsManaged, int championshipsWinned, String name, int id, int salary){
		coach = coach-1;
		String msg = "";
		MainCoach coachToUpdate;
		if(allMainCoaches.size() > coach){
			coachToUpdate = allMainCoaches.get(coach);
			
			coachToUpdate.setExperienceYears(experienceYears);
			coachToUpdate.setTeamsManaged(teamsManaged);
			coachToUpdate.setChampionshipsWinned(championshipsWinned);
			coachToUpdate.setName(name);
			coachToUpdate.setId(id);
			coachToUpdate.setSalary(salary);
			msg = "Información actualizada correctamente.";
		}
		else{
			msg = "No se pudo actualizar la información porque ese entrenador no existe.";
		}
		return msg;
	}
	
	public String updateAssistantCoachInfo(int coach, int experienceYears, String wasPlayer, String expertise, String name, int id, int salary){
		coach = coach-1;
		String msg = "";
		AssistantCoach coachToUpdate;
		boolean player = false;
		if(wasPlayer.equalsIgnoreCase("sí")){
			player = true;
		}
		
		if(allAssistantCoaches.size() > coach){
			coachToUpdate = allAssistantCoaches.get(coach);
			
			coachToUpdate.setExperienceYears(experienceYears);
			coachToUpdate.setWasPlayer(player);
			coachToUpdate.setExpertise(expertise);
			coachToUpdate.setName(name);
			coachToUpdate.setId(id);
			coachToUpdate.setSalary(salary);
			msg = "Información actualizada correctamente.";
		}
		else{
			msg = "No se pudo actualizar la información porque ese entrenador no existe.";
		}
		return msg;
	}
	
	public String updatePlayerInfo(int player, int shirtNum, int goles, double markAverage, int position, String name, int id, int salary){
		player = player-1;
		String msg = "";
		Player playerToUpdate;
		
		if(allPlayers.size() > player){
			playerToUpdate = allPlayers.get(player);
			
			playerToUpdate.setShirtNum(shirtNum);
			playerToUpdate.setGoles(goles);
			playerToUpdate.setMarkAverage(markAverage);
			playerToUpdate.setPosition(position);
			playerToUpdate.setName(name);
			playerToUpdate.setId(id);
			playerToUpdate.setSalary(salary);
			msg = "Información actualizada correctamente.";
		}
		else{
			msg = "No se pudo actualizar la información porque ese jugador no existe.";
		}
		return msg;
	}
	
	public String addAlineation(String date, String tactic, String formation){
		allAlineations.add(new Alineation(date, tactic, formation));
		String msg = "Formación añadida correctamente.";
		return msg;
	}
	
	public String readAlineation(String date){
		String msg = "";
		int [] formationFounded;
		boolean founded = false;
		
		for(int i = 0; i < allAlineations.size() && !founded; i++ ){
			if(allAlineations.get(i).getDate().equals(date)){
				formationFounded = allAlineations.get(i).readFormation();
				msg = formationFounded[0] + "-" + formationFounded[1] + "-" + formationFounded[2];
			}
			else{
				msg ="Error. No hay ninguna alineación para esa fecha.";
			}
		}
		return msg;
	}
}