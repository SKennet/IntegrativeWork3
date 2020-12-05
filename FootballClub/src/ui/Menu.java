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
			System.out.println("Si desea crear un equipo, d�gite 1.");
			System.out.println("");
			System.out.println("Si desea contratar a un entrenador principal, d�gite 2.");
			System.out.println("Si desea contratar a un asistente t�cnico, d�gite 3.");
			System.out.println("Si desea contratar un jugador, d�gite 4.");
			System.out.println("");
			System.out.println("Si desea despedir un entrenador principal, d�gite 5.");
			System.out.println("Si desea despedir un asistente t�cnico, d�gite 6.");
			System.out.println("Si desea despedir un jugador, d�gite 7.");
			System.out.println("");
			System.out.println("Si desea agregar un entrenador principal a un equipo, d�gite 8.");
			System.out.println("Si desea agregar un asistente t�cnico a un equipo, d�gite 9.");
			System.out.println("Si desea agregar un jugador a un equipo, d�gite 10.");
			System.out.println("");
			System.out.println("Si desea actualizar la informaci�n de un entrenador principal, d�gite 11.");
			System.out.println("Si desea actualizar la informaci�n de un asistente t�cnico , d�gite 12.");
			System.out.println("Si desea actualizar la informaci�n de un jugador, d�gite 13.");
			System.out.println("");
			System.out.println("Si desea mostrar toda la informaci�n, d�gite 14.");
			System.out.println("Si desea mostrar la informaci�n de un entrenador principal, d�gite 15.");
			System.out.println("Si desea mostrar la informaci�n de un asistente t�cnico, d�gite 16.");
			System.out.println("Si desea mostrar la informaci�n de un jugador, d�gite 17.");
			System.out.println("Si desea mostrar la informaci�n del club, d�gite 18.");
			System.out.println("Si desea mostrar la informaci�n de las instalaciones, d�gite 19.");
			System.out.println("");
			System.out.println("Si desea agregar una alineaci�n a un equipo, d�gite 20.");
			System.out.println("");
			System.out.println("Si desea ubicar un entrenador en alguna oficina, d�gite 21.");
			System.out.println("Si desea ubicar un jugador en algun camerino, d�gite 22.");
			System.out.println("");
			System.out.println("Si desea buscar un entrenador en las oficinas, d�gite 23.");
			System.out.println("Si desea buscar un jugador en los camerinos, d�gite 24.");
			System.out.println("");
			System.out.println("Si desea cerrar el programa, d�gite 0.");
			System.out.println("");
			optionChoosed = input.nextInt();
			input.nextLine();
			
			switch(optionChoosed){
				case 1:
						System.out.println("Por favor, ingrese el nombre del club.");
						name = input.nextLine();
						System.out.println("Por favor ingrese la fecha de fundaci�n del club. D�a-Mes-A�o");
						input.nextLine();
						System.out.println("Por favor, ingrese el nit del club.");
						nit = input.nextInt();
						input.nextLine();
						System.out.println("");
						Club newClub = new Club(nit, name, fundationDate);
						System.out.println("Club creado exitosamente. Recuerde que para evitar problemas en el funcionamiento, no se debe crear m�s de un club.");
						clubCreated = true;
						break;
				if(clubCreated == true){		
					case 2:	
							System.out.println("Por favor, ingrese el nombre.");
							name = input.nextLine();
							System.out.println("Por favor ingrese el salario.");
							salary = input.nextInt();
							System.out.println("Por favor ingrese la identificaci�n. Recuerde que este n�mero es �nico.");
							id = input.nextInt();
							System.out.println("Por favor, ingrese los a�os de experiencia.");
							experienceYears = input.nextInt();
							System.out.println("Por favor, ingrese los equipos manejados.");
							teamsManaged = input.nextInt();
							System.out.println("Por favor, ingrese cu�ntos campeonatos ha ganado.");
							championshipsWinned = input.nextInt();
							System.out.println(newServer.addMainCoach(experienceYears, teamsManaged, championshipsWinned, name, id, "ACTIVO", salary));
							break;
							
					case 3:
							System.out.println("Por favor, ingrese el nombre.");
							name = input.nextLine();
							System.out.println("Por favor ingrese el salario.");
							salary = input.nextInt();
							System.out.println("Por favor ingrese la identificaci�n. Recuerde que este n�mero es �nico.");
							id = input.nextInt();
							break;
							
					case 4:
							System.out.println("Por favor, ingrese el nombre.");
							name = input.nextLine();
							System.out.println("Por favor ingrese el salario.");
							salary = input.nextInt();
							System.out.println("Por favor ingrese la identificaci�n. Recuerde que este n�mero es �nico.");
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