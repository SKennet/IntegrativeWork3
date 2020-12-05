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
		int salary, id, experienceYears, teamsManaged, championshipsWinned;
		String state;
		
		//Club variables.
		int nit;
		String fundationDate;
		
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
			System.out.println("Si desea mostrar la información de un entrenador principal, dígite 15.");
			System.out.println("Si desea mostrar la información de un asistente técnico, dígite 16.");
			System.out.println("Si desea mostrar la información de un jugador, dígite 17.");
			System.out.println("Si desea mostrar la información del club, dígite 18.");
			System.out.println("Si desea mostrar la información de las instalaciones, dígite 19.");
			System.out.println("");
			System.out.println("Si desea agregar una alineación a un equipo, dígite 20.");
			System.out.println("");
			System.out.println("Si desea ubicar un entrenador en alguna oficina, dígite 21.");
			System.out.println("Si desea ubicar un jugador en algun camerino, dígite 22.");
			System.out.println("");
			System.out.println("Si desea buscar un entrenador en las oficinas, dígite 23.");
			System.out.println("Si desea buscar un jugador en los camerinos, dígite 24.");
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
							System.out.println("Por favor ingrese el salario.");
							salary = input.nextInt();
							System.out.println("Por favor ingrese la identificación. Recuerde que este número es único.");
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
							System.out.println("Por favor ingrese el salario.");
							salary = input.nextInt();
							System.out.println("Por favor ingrese la identificación. Recuerde que este número es único.");
							id = input.nextInt();
							break;
							
					case 4:
							System.out.println("Por favor, ingrese el nombre.");
							name = input.nextLine();
							System.out.println("Por favor ingrese el salario.");
							salary = input.nextInt();
							System.out.println("Por favor ingrese la identificación. Recuerde que este número es único.");
							id = input.nextInt();
							break;
							
					case 5:
					
							break;
					
					case 6:
					
							break;

					case 7:
					
							break;

					case 8:
					
							break;

					case 9:
					
							break;

					case 10:
					
							break;

					case 11:
					
							break;

					case 12:
					
							break;

					case 13:
					
							break;

					case 14:
					
							break;

					case 15:
					
							break;	

					case 16:
					
							break;

					case 17:
					
							break;

					case 18:
					
							break;

					case 19:
					
							break;		
							
					case 20:
					
							break;
							
					case 21:
					
							break;

					case 22:
					
							break;

					case 23:
					
							break;
					
					case 24:
					
							break;
				}		
				else{
						System.out.println("Por favor, primero cree un club.");
				}
				default:
							finished = true;
						break;	
			}					
		}
	}
}