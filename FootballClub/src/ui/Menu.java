package ui;
import model.*;
import java.util.Scanner;

public class Menu {
	
	public Menu(){
		Scanner input = new Scanner(System.in);
		int optionChoosed = 0;
		String name;
		boolean clubCreated = false, finished = false;
		
		//This it's just to make the program works.
		Club newClub = new Club(0, "", "");
		
		//Employees variables.
		int salary, id, experienceYears, teamsManaged, championshipsWinned, goles, shirtNum, position;
		String state, wasPlayer, expertise;
		double markAverage;
		
		//Team variables.
		int teamChoosed;
		
		//Show variables.
		int typeChoosed;
		
		//Club variables.
		int nit;
		String fundationDate;
		
		//Alineation variables.
		String formation, date, tactic;
		
		//Updating variables.
		int coach, player;
		
		while(!finished){
			System.out.println("");
			System.out.println("Si desea crear un club, d�gite 1.");
			System.out.println("Si desea crear un equipo, d�gite 2.");
			System.out.println("");
			System.out.println("Si desea contratar a un entrenador principal, d�gite 3.");
			System.out.println("Si desea contratar a un asistente t�cnico, d�gite 4.");
			System.out.println("Si desea contratar un jugador, d�gite 5.");
			System.out.println("");
			System.out.println("Si desea despedir un entrenador principal, d�gite 6.");
			System.out.println("Si desea despedir un asistente t�cnico, d�gite 7.");
			System.out.println("Si desea despedir un jugador, d�gite 8.");
			System.out.println("");
			System.out.println("Si desea agregar un entrenador principal a un equipo, d�gite 9.");
			System.out.println("Si desea agregar un asistente t�cnico a un equipo, d�gite 10.");
			System.out.println("Si desea agregar un jugador a un equipo, d�gite 11.");
			System.out.println("");
			System.out.println("Si desea actualizar la informaci�n de un entrenador principal, d�gite 12.");
			System.out.println("Si desea actualizar la informaci�n de un asistente t�cnico , d�gite 13.");
			System.out.println("Si desea actualizar la informaci�n de un jugador, d�gite 14.");
			System.out.println("");
			System.out.println("Si desea mostrar toda la informaci�n, d�gite 15.");
			System.out.println("Si desea mostrar una informaci�n en particular (solo entrenadores principales, asistentes, etc.), d�gite 16.");
			System.out.println("");
			System.out.println("Si desea agregar una alineaci�n a un equipo, d�gite 17.");
			System.out.println("Si desea mostrar alguna alineaci�n a la prensa en formato defensores-volantes-delanteros , d�gite 18");
			System.out.println("");
			System.out.println("Si desea ubicar un entrenador en alguna oficina, d�gite 19.");
			System.out.println("Si desea ubicar un jugador en algun camerino, d�gite 20. Para poder ingresar a un camerino debe estar en algun equipo.");
			System.out.println("");
			System.out.println("Si desea buscar un entrenador en las oficinas, d�gite 21.");
			System.out.println("Si desea buscar un jugador en los camerinos, d�gite 22.");
			System.out.println("");
			System.out.println("Si desea cerrar el programa, d�gite 0.");
			System.out.println("");
			System.out.println("RECUERDE QUE PARA PODER USAR ESTAS OPCIONES (A EXCEPCI�N DE LA 1) DEBE HABER CREADO UN CLUB PRIMERO. DE LO CONTRARIO EL PROGRAMA FALLAR�.");
			System.out.println("");
			optionChoosed = input.nextInt();
			input.nextLine();
			
			switch(optionChoosed){
				case 1:
						System.out.println("Por favor, ingrese el nombre del club.");
						name = input.nextLine();
						System.out.println("Por favor ingrese la fecha de fundaci�n del club. D�a-Mes-A�o");
						fundationDate = input.nextLine();
						System.out.println("Por favor, ingrese el nit del club.");
						nit = input.nextInt();
						input.nextLine();
						System.out.println("");
						newClub = new Club(nit, name, fundationDate);
						System.out.println("Club creado exitosamente. Recuerde que para evitar problemas en el funcionamiento, no se debe crear m�s de un club.");
						clubCreated = true;
						break;
						
				case 2:
						System.out.println("Por favor, ingrese el nombre del equipo.");
						name = input.nextLine();
						System.out.println(newClub.addTeam(name));
						break;

				case 3:	
						System.out.println("Por favor, ingrese el nombre.");
						name = input.nextLine();
						System.out.println("Por favor, ingrese el salario.");
						salary = input.nextInt();
						System.out.println("Por favor, ingrese la identificaci�n. Recuerde que este n�mero es �nico.");
						id = input.nextInt();
						System.out.println("Por favor, ingrese los a�os de experiencia.");
						experienceYears = input.nextInt();
						System.out.println("Por favor, ingrese los equipos manejados.");
						teamsManaged = input.nextInt();
						System.out.println("Por favor, ingrese cu�ntos campeonatos ha ganado.");
						championshipsWinned = input.nextInt();
						System.out.println(newClub.addMainCoach(experienceYears, teamsManaged, championshipsWinned, name, id, "ACTIVO", salary));
						break;
								
				case 4:
						System.out.println("Por favor, ingrese el nombre.");
						name = input.nextLine();
						System.out.println("Por favor, ingrese el salario.");
						salary = input.nextInt();
						System.out.println("Por favor, ingrese la identificaci�n. Recuerde que este n�mero es �nico.");
						id = input.nextInt();
						System.out.println("Por favor, ingrese los a�os de experiencia.");
						experienceYears = input.nextInt();
						input.nextLine();
						System.out.println("�El entrenador ha sido jugador profesional? Escriba s� si es cierto, no si es falso.");
						wasPlayer = input.nextLine();
						System.out.println("�Cu�l es la experticia del entrenador? Ingrese el n�mero correspondiente (pueden ser: ofensivo 1, defensivo 2, posesi�n 3, jugadas de laboratorio 4).");
						expertise = input.nextLine();
						System.out.println(newClub.addAssistantCoach(experienceYears, wasPlayer, expertise, name, id, "ACTIVO", salary));
						break;
								
				case 5:
						System.out.println("Por favor, ingrese el nombre.");
						name = input.nextLine();
						System.out.println("Por favor, ingrese el salario.");
						salary = input.nextInt();
						System.out.println("Por favor, ingrese la identificaci�n. Recuerde que este n�mero es �nico.");
						id = input.nextInt();
						System.out.println("Por favor, ingrese el n�mero de la camiseta.");
						shirtNum = input.nextInt();
						System.out.println("Por favor, ingrese los goles que ha hecho el jugador.");
						goles = input.nextInt();
						System.out.println("Por favor, ingrese la calificaci�n promedio.");
						markAverage = input.nextDouble();
						System.out.println("Por favor, ingrese su posici�n dentro del campo de juego. Si es portero, ingrese 1; si es defensor, ingrese 2; si es volante, ingrese 3; o si es delantero, ingrese 4.");
						position = input.nextInt();	
						input.nextLine();
						System.out.println(newClub.addPlayer(shirtNum, goles, markAverage, position, name, id, "ACTIVO", salary));						
						break;
								
				case 6:
						System.out.println("Por favor, ingrese el n�mero del entrenador que quiere despedir. El primero corresponde al n�mero 1.");
						System.out.println(newClub.showMainCoaches());
						position = input.nextInt();
						input.nextLine();
						System.out.println(newClub.removeMainCoach(position));
						break;
						
				case 7:
						System.out.println("Por favor, ingrese el n�mero del asistente que quiere despedir. El primero corresponde al n�mero 1.");
						System.out.println(newClub.showAssistantCoaches());
						position = input.nextInt();
						input.nextLine();
						System.out.println(newClub.removeAssistantCoach(position));
						break;

				case 8:
						System.out.println("Por favor, ingrese el n�mero del jugador que quiere despedir. El primero corresponde al n�mero 1.");
						System.out.println(newClub.showPlayers());
						position = input.nextInt();
						input.nextLine();
						System.out.println(newClub.removePlayer(position));
						break;

				case 9:
						System.out.println("Por favor, ingrese el n�mero del equipo al que quiere asignar el entrenador.");
						System.out.println(newClub.showTeams());
						teamChoosed = input.nextInt();
						System.out.println("Por favor, ingrese el n�mero del entrenador que quiere asignar.");
						System.out.println(newClub.showMainCoaches());
						position = input.nextInt();
						System.out.println(newClub.assignMainCoach(position, teamChoosed));
						System.out.println("");
						break;

				case 10:
						System.out.println("Por favor, ingrese el n�mero del equipo al que quiere asignar el asistente.");
						teamChoosed = input.nextInt();
						System.out.println(newClub.showTeams());
						System.out.println("Por favor, ingrese el n�mero del asistente que quiere asignar.");
						System.out.println(newClub.showAssistantCoaches());
						position = input.nextInt();
						System.out.println(newClub.assignMainCoach(position, teamChoosed));
						break;

				case 11:
						System.out.println("Por favor, ingrese el n�mero del equipo al que quiere asignar el jugador.");
						System.out.println(newClub.showTeams());
						teamChoosed = input.nextInt();
						System.out.println("Por favor, ingrese el n�mero del jugador que quiere asignar.");
						System.out.println(newClub.showPlayers());
						position = input.nextInt();
						System.out.println(newClub.assignMainCoach(position, teamChoosed));
						break;

				case 12:
						System.out.println("Por favor, ingrese el nombre actualizado.");
						name = input.nextLine();
						System.out.println("Por favor, ingrese el salario actualizado.");
						salary = input.nextInt();
						System.out.println("Por favor, ingrese la identificaci�n actualizada.");
						id = input.nextInt();
						System.out.println("Por favor, ingrese los a�os de experiencia actualizados.");
						experienceYears = input.nextInt();
						System.out.println("Por favor, ingrese los equipos manejados actualizados.");
						teamsManaged = input.nextInt();
						System.out.println("Por favor, ingrese los campeonatos ganados actualizados.");
						championshipsWinned = input.nextInt();
						System.out.println("Por favor, ingrese el n�mero del entrenador cuya informaci�n quiere actualizar.");
						System.out.println(newClub.showMainCoaches());
						coach = input.nextInt();
						input.nextLine();
						System.out.println(newClub.updateMainCoachInfo(coach, experienceYears, teamsManaged, championshipsWinned, name, id, salary));
						break;

				case 13:
						System.out.println("");
						System.out.println("Por favor, ingrese el nombre actualizado.");
						name = input.nextLine();
						System.out.println("Por favor, ingrese el salario actualizado.");
						salary = input.nextInt();
						System.out.println("Por favor, ingrese la identificaci�n actualizada.");
						id = input.nextInt();
						System.out.println("Por favor, ingrese los a�os de experiencia actualizados.");
						experienceYears = input.nextInt();
						input.nextLine();
						System.out.println("�El entrenador ha sido jugador? Ingrese s� o no.");
						wasPlayer = input.nextLine();
						System.out.println("Por favor, ingrese la experticia actualizada del asistente t�cnico.");
						expertise = input.nextLine();
						System.out.println("Por favor, ingrese el n�mero del entrenador cuya informaci�n quiere actualizar.");
						System.out.println(newClub.showAssistantCoaches());
						coach = input.nextInt();
						input.nextLine();
						System.out.println(newClub.updateAssistantCoachInfo(coach, experienceYears, wasPlayer, expertise, name, id, salary));
						break;

				case 14:
						System.out.println("Por favor, ingrese el nombre actualizado.");
						name = input.nextLine();
						System.out.println("Por favor, ingrese el salario actualizado.");
						salary = input.nextInt();
						System.out.println("Por favor, ingrese la identificaci�n actualizada.");
						id = input.nextInt();
						System.out.println("Por favor, ingrese el n�mero de camiseta actualizado.");
						shirtNum = input.nextInt();
						System.out.println("Por favor, ingrese la posici�n actualizada. 1 si es portero; 2 si es defensor; 3 si es volante; 4 si es delantero.");
						position = input.nextInt();
						System.out.println("Por favor, ingrese los goles actualizados.");
						goles = input.nextInt();
						System.out.println("Por favor, ingrese la calificaci�n promedo actualizada.");
						markAverage = input.nextDouble();
						System.out.println("Por favor, ingrese el n�mero correspondiente al jugador cuya informaci�n quiere actualizar.");
						System.out.println(newClub.showPlayers());
						player = input.nextInt();
						input.nextLine();
						System.out.println(newClub.updatePlayerInfo(player, shirtNum, goles, markAverage, position, name, id, salary));							
						break;

				case 15:
						System.out.println(newClub.showAllInfo());
						break;

				case 16:
						System.out.println("Para ver la informaci�n de: entrenadores principales, d�gite 1; asistentes t�cnicos, d�gite 2; jugadores, d�gite 3.");
						System.out.println("Equipos, d�gite 4; club, d�gite 5; ");
						typeChoosed = input.nextInt();
						input.nextLine();
						System.out.println(newClub.showParticularInfo(typeChoosed));
						break;
							
				case 17:
						System.out.println("Por favor, ingrese la fecha de la alineaci�n. D�a/Mes/A�o");
						date = input.nextLine();
						System.out.println("Por favor, ingrese el tipo de t�cnica de la alineaci�n.");
						tactic = input.nextLine();
						System.out.println("Por favor, ingrese la formaci�n separada por guiones (-), debe tener entre 3 y 6 n�meros.");
						formation  = input.nextLine();
						System.out.println(newClub.addAlineation(date, tactic, formation));
						break;
					
				case 18:
						System.out.println("Por favor, ingrese la fecha de la alineaci�n que quiere mostrar a la prensa. D�a/Mes/A�o");
						date = input.nextLine();
						System.out.println(newClub.readAlineation(date));
						break;
							
				case 19:
						System.out.println("Si es un entrenador principal, d�gite 1. Si es un asistente t�cnico, d�gite 2.");
						typeChoosed = input.nextInt();
						if(typeChoosed == 1){
							System.out.println("Por favor, seleccione el n�mero del entrenador a ubicar en las oficinas.");
							System.out.println(newClub.showMainCoaches());
							position = input.nextInt();
						}
						else{
							System.out.println("Por favor, ingrese el n�mero del asistente a ubicar en las oficinas.");
							System.out.println(newClub.showAssistantCoaches());
							position = input.nextInt();
						}
						input.nextLine();
						System.out.println(newClub.useOffices(typeChoosed, position));
						break;
					
				case 20:
						System.out.println("Por favor, ingrese el n�mero del jugador a ubicar en los camerinos.");
						position = input.nextInt();
						input.nextLine();
						System.out.println(newClub.showPlayers());
						break;
				
				case 21:
						System.out.println("Si desea buscar un entrenador principal, d�gite 1. Si desea buscar un asistente t�cnico, d�gite 2.");
						typeChoosed = input.nextInt();
						if(typeChoosed == 1){
							System.out.println("Por favor, ingrese el n�mero del entrenador a buscar.");
							System.out.println(newClub.showMainCoaches());
						}
						else{
							System.out.println("Por favor, ingrese el n�mero del asistente a buscar.");
							System.out.println(newClub.showAssistantCoaches());
						}
						position = input.nextInt();
						input.nextLine();
						System.out.println(newClub.findCoach(position, typeChoosed));
						break;		
							
				case 22:
						System.out.println("Por favor, d�gite el n�mero del jugador a buscar.");
						System.out.println(newClub.showPlayers());
						position = input.nextInt();
						input.nextLine();
						System.out.println(newClub.findPlayer(position));
						break;
					
				default:
						System.out.println("");
						finished = true;
						break;	
			}					
		}
	}
}