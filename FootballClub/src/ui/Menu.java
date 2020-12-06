package ui;
import model.*;
import java.util.Scanner;

public class Menu {
	
	public Menu(){
		Scanner input = new Scanner(System.in);
		int optionChoosed = 0;
		String name;
		boolean clubCreated = false, finished = false;
		
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
			System.out.println("Si desea crear un equipo, dígite 1.");
			System.out.println("");
			System.out.println("Si desea contratar a un entrenador principal, dígite 2.");
			System.out.println("Si desea contratar a un asistente técnico, dígite 3.");
			System.out.println("Si desea contratar un jugador, dígite 4.");
			System.out.println("");
			System.out.println("Si desea despedir un entrenador principal, dígite 5.");
			System.out.println("Si desea despedir un asistente técnico, dígite 6.");
			System.out.println("Si desea despedir un jugador, dígite 7.");
			System.out.println("");
			System.out.println("Si desea agregar un entrenador principal a un equipo, dígite 8.");
			System.out.println("Si desea agregar un asistente técnico a un equipo, dígite 9.");
			System.out.println("Si desea agregar un jugador a un equipo, dígite 10.");
			System.out.println("");
			System.out.println("Si desea actualizar la información de un entrenador principal, dígite 11.");
			System.out.println("Si desea actualizar la información de un asistente técnico , dígite 12.");
			System.out.println("Si desea actualizar la información de un jugador, dígite 13.");
			System.out.println("");
			System.out.println("Si desea mostrar toda la información, dígite 14.");
			System.out.println("Si desea mostrar una información en particular (solo entrenadores principales, asistentes, etc.), dígite 15.");
			System.out.println("");
			System.out.println("Si desea agregar una alineación a un equipo, dígite 16.");
			System.out.println("Si desea mostrar alguna alineación a la prensa en formato defensores-volantes-delanteros , dígite 17");
			System.out.println("");
			System.out.println("Si desea ubicar un entrenador en alguna oficina, dígite 18.");
			System.out.println("Si desea ubicar un jugador en algun camerino, dígite 19.");
			System.out.println("");
			System.out.println("Si desea buscar un entrenador en las oficinas, dígite 20.");
			System.out.println("Si desea buscar un jugador en los camerinos, dígite 21.");
			System.out.println("");
			System.out.println("Si desea cerrar el programa, dígite 0.");
			System.out.println("");
			optionChoosed = input.nextInt();
			input.nextLine();
			
			switch(optionChoosed){
				case 1:
						System.out.println("Por favor, ingrese el nombre del club.");
						name = input.nextLine();
						System.out.println("Por favor ingrese la fecha de fundación del club. Día-Mes-Año");
						input.nextLine();
						System.out.println("Por favor, ingrese el nit del club.");
						nit = input.nextInt();
						input.nextLine();
						System.out.println("");
						Club newClub = new Club(nit, name, fundationDate);
						System.out.println("Club creado exitosamente. Recuerde que para evitar problemas en el funcionamiento, no se debe crear más de un club.");
						clubCreated = true;
						break;
				if(clubCreated == true){		
					case 2:	
							System.out.println("Por favor, ingrese el nombre.");
							name = input.nextLine();
							System.out.println("Por favor, ingrese el salario.");
							salary = input.nextInt();
							System.out.println("Por favor, ingrese la identificación. Recuerde que este número es único.");
							id = input.nextInt();
							System.out.println("Por favor, ingrese los años de experiencia.");
							experienceYears = input.nextInt();
							System.out.println("Por favor, ingrese los equipos manejados.");
							teamsManaged = input.nextInt();
							System.out.println("Por favor, ingrese cuántos campeonatos ha ganado.");
							championshipsWinned = input.nextInt();
							System.out.println(newServer.addMainCoach(experienceYears, teamsManaged, championshipsWinned, name, id, "ACTIVO", salary));
							break;
							
					case 3:
							System.out.println("Por favor, ingrese el nombre.");
							name = input.nextLine();
							System.out.println("Por favor, ingrese el salario.");
							salary = input.nextInt();
							System.out.println("Por favor, ingrese la identificación. Recuerde que este número es único.");
							id = input.nextInt();
							System.out.println("Por favor, ingrese los años de experiencia.");
							experienceYears = input.nextInt();
							input.nextLine();
							System.out.println("¿El entrenador ha sido jugador profesional? Escriba sí si es cierto, no si es falso.");
							wasPlayer = input.nextLine();
							System.out.println("¿Cuál es la experticia del entrenador? (pueden ser: ofensivo, defensivo, posesión, jugadas de laboratorio).");
							expertise = input.nextLine();
							System.out.println(newServer.addAssistantCoach(experienceYears, wasPlayer, expertise, name, id, "ACTIVO", salary));
							break;
							
					case 4:
							System.out.println("Por favor, ingrese el nombre.");
							name = input.nextLine();
							System.out.println("Por favor, ingrese el salario.");
							salary = input.nextInt();
							System.out.println("Por favor, ingrese la identificación. Recuerde que este número es único.");
							id = input.nextInt();
							System.out.println("Por favor, ingrese el número de la camiseta.");
							shirtNum = input.nextInt();
							System.out.println("Por favor, ingrese los goles que ha hecho el jugador.");
							goles = input.nextInt();
							System.out.println("Por favor, ingrese la calificación promedio.");
							markAverage = input.nextDouble();
							System.out.println("Por favor, ingrese su posición dentro del campo de juego. Si es portero, ingrese 1; si es defensor, ingrese 2; si es volante, ingrese 3; o si es delantero, ingrese 4.");
							position = input.nextInt();	
							input.nextLine();
							System.out.println(newServer.addPlayer(shirtNum, goles, markAverage, position, name, id, "ACTIVO", salary));						
							break;
							
					case 5:
							System.out.println("Por favor, ingrese el número del entrenador que quiere despedir. El primero corresponde al número 1.");
							System.out.println(newServer.showMainCoaches());
							position = input.nextInt();
							input.nextLine();
							System.out.println(newServer.removeMainCoach(position));
							break;
					
					case 6:
							System.out.println("Por favor, ingrese el número del asistente que quiere despedir. El primero corresponde al número 1.");
							System.out.println(newServer.showAssistantCoaches());
							position = input.nextInt();
							input.nextLine();
							System.out.println(newServer.removeAssistantCoach(position));
							break;

					case 7:
							System.out.println("Por favor, ingrese el número del jugador que quiere despedir. El primero corresponde al número 1.");
							System.out.println(newServer.showPlayers());
							position = input.nextInt();
							input.nextLine();
							System.out.println(newServer.removePlayer(position));
							break;

					case 8:
							System.out.println("Por favor, ingrese el número del equipo al que quiere asignar el entrenador.");
							System.out.println(newServer.showTeams());
							teamChoosed = input.nextInt();
							System.out.println("Por favor, ingrese el número del entrenador que quiere asignar.");
							System.out.println(newServer.showMainCoaches());
							position = input.nextInt();
							System.out.println(newServer.assignMainCoach(position, teamChoosed));
							System.out.println("");
							break;

					case 9:
							System.out.println("Por favor, ingrese el número del equipo al que quiere asignar el asistente.");
							teamChoosed = input.nextInt();
							System.out.println(newServer.showTeams());
							System.out.println("Por favor, ingrese el número del asistente que quiere asignar.");
							System.out.println(newServer.showAssistantCoaches());
							position = input.nextInt();
							System.out.println(newServer.assignMainCoach(position, teamChoosed));
							break;

					case 10:
							System.out.println("Por favor, ingrese el número del equipo al que quiere asignar el jugador.");
							System.out.println(newServer.showTeams());
							teamChoosed = input.nextInt();
							System.out.println("Por favor, ingrese el número del jugador que quiere asignar.");
							System.out.println(newServer.showPlayers());
							position = input.nextInt();
							System.out.println(newServer.assignMainCoach(position, teamChoosed));
							break;

					case 11:
							System.out.println("Por favor, ingrese el nombre actualizado.");
							name = input.nextLine();
							System.out.println("Por favor, ingrese el salario actualizado.");
							salary.nextInt();
							System.out.println("Por favor, ingrese la identificación actualizada.");
							id = input.nextInt();
							System.out.println("Por favor, ingrese los años de experiencia actualizados.");
							experienceYears = input.nextInt();
							System.out.println("Por favor, ingrese los equipos manejados actualizados.");
							teamsManaged = input.nextInt();
							System.out.println("Por favor, ingrese los campeonatos ganados actualizados.");
							championshipsWinned = input.nextInt();
							System.out.println("Por favor, ingrese el número del entrenador cuya información quiere actualizar.");
							System.out.println(newServer.showMainCoaches());
							coach = input.nextInt();
							input.nextLine();
							System.out.println(newServer.updateMainCoachInfo(coach, experienceYears, teamsManaged, championshipsWinned, name, id, salary));
							break;

					case 12:
							System.out.println("");
							System.out.println("Por favor, ingrese el nombre actualizado.");
							name = input.nextLine();
							System.out.println("Por favor, ingrese el salario actualizado.");
							salary.nextInt();
							System.out.println("Por favor, ingrese la identificación actualizada.");
							id = input.nextInt();
							System.out.println("Por favor, ingrese los años de experiencia actualizados.");
							experienceYears = input.nextInt();
							input.nextLine();
							System.out.println("¿El entrenador ha sido jugador? Ingrese sí o no.");
							wasPlayer = input.nextLine();
							System.out.println("Por favor, ingrese la experticia actualizada del asistente técnico.");
							expertise = input.nextLine();
							System.out.println("Por favor, ingrese el número del entrenador cuya información quiere actualizar.");
							System.out.println(newServer.showAssistantCoaches());
							coach = input.nextInt();
							input.nextLine();
							System.out.println(newServer.updateAssistantCoachInfo(coach, experienceYears, wasPlayer, expertise, name, id, salary));
							break;

					case 13:
							System.out.println("Por favor, ingrese el nombre actualizado.");
							name = input.nextLine();
							System.out.println("Por favor, ingrese el salario actualizado.");
							salary.nextInt();
							System.out.println("Por favor, ingrese la identificación actualizada.");
							id = input.nextInt();
							System.out.println("Por favor, ingrese el número de camiseta actualizado.");
							shirtNum = input.nextInt();
							System.out.println("Por favor, ingrese la posición actualizada. 1 si es portero; 2 si es defensor; 3 si es volante; 4 si es delantero.");
							position = input.nextInt();
							System.out.println("Por favor, ingrese los goles actualizados.");
							goles = input.nextInt();
							System.out.println("Por favor, ingrese la calificación promedo actualizada.");
							markAverage = input.nextDouble();
							System.out.println("Por favor, ingrese el número correspondiente al jugador cuya información quiere actualizar.");
							System.out.println(newServer.showPlayers());
							player = input.nextInt();
							input.nextLine();
							System.out.println(newServer.updatePlayerInfo(player, shirtNum, goles, markAverage, position, name, id, salary));							
							break;

					case 14:
							System.out.println(newServer.showAllInfo());
							break;

					case 15:
							System.out.println("Para ver la información de: entrenadores principales, dígite 1; asistentes técnicos, dígite 2; jugadores, dígite 3.");
							System.out.println("Equipos, dígite 4; club, dígite 5; ");
							typeChoosed = input.nextInt();
							input.nextLine();
							System.out.println(newServer.showParticularInfo(typeChoosed));
							break;	

					case 16:
							System.out.println("Por favor, ingrese la fecha de la alineación. Día/Mes/Año");
							date = input.nextLine();
							System.out.println("Por favor, ingrese el tipo de técnica de la alineación.");
							tactic = input.nextLine();
							System.out.println("Por favor, ingrese la formación separada por guiones (-), debe tener entre 3 y 6 números.");
							formation  = input.nextLine();
							System.out.println(newServer.addAlineation(date, tactic, formation));
							break;

					case 17:
							System.out.println("Por favor, ingrese la fecha de la alineación que quiere mostrar a la prensa. Día/Mes/Año");
							date = input.nextLine();
							System.out.println(newServer.readAlineation(date));
							break;
							
					case 18:
							System.out.println("Si es un entrenador principal, dígite 1. Si es un asistente técnico, dígite 2.");
							typeChoosed = input.nextInt();
							if(typeChoosed == 1){
								System.out.println("Por favor, seleccione el número del entrenador a ubicar en las oficinas.");
								System.out.println(newServer.showMainCoaches());
								position = input.nextInt();
							}
							else{
								System.out.println("Por favor, ingrese el número del asistente a ubicar en las oficinas.");
								System.out.println(newServer.showAssistantCoaches());
							}
							position = input.nextInt();
							input.nextLine();
							System.out.println(newServer.useOffices(typeChoosed, position));
							break;

					case 19:
							System.out.println("Por favor, ingrese el número del jugador a ubicar en los camerinos.");
							position = input.nextInt();
							input.nextLine();
							System.out.println(newServer.showPlayers());
							break;

					case 19:
							System.out.println("Si desea buscar un entrenador principal, dígite 1. Si desea buscar un asistente técnico, dígite 2.");
							typeChoosed = input.nextInt();
							if(typeChoosed == 1){
								System.out.println("Por favor, ingrese el número del entrenador a buscar.");
								System.out.println(newServer.showMainCoaches());
							}
							else{
								System.out.println("Por favor, ingrese el número del asistente a buscar.");
								System.out.println(newServer.showAssistantCoaches());
							}
							position = input.nextInt();
							input.nextLine();
							System.out.println(newServer.findCoach(position, typeChoosed));
							break;		
							
					case 21:
							System.out.println("Por favor, dígite el número del jugador a buscar.");
							System.out.println(newServer.showPlayers());
							position = input.nextInt();
							input.nextLine();
							System.out.println(newServer.findPlayer());
							break;
				
				}		
				else{
						System.out.println("Por favor, primero cree un club.");
				}
				default:
						System.out.println("");
						finished = true;
						break;	
			}					
		}
	}
}