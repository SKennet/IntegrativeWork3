package model;
import model;

public class DressingRoom{
	private final static int MAXIMUM_PLAYERS;
	boolean space, userTeam;
	int column, row;
	int [][] lockerRoom;
	
	public DressingRoom(int MAXIMUM_PLAYERS, boolean userTeam, int column, int row){
		this.MAXIMUM_PLAYERS = MAXIMUM_PLAYERS;
		this.space = space;
		this.userTeam = userTeam;
		this.column = column;
		this.row = row;
		
		lockerRoom = new int [column][row];
	}
	
	
	public String addPlayer(Player playerToAdd, boolean team){
		space = false;
		for(int i = 0; i < column && !space; i++){
			for(int j = 0; j < row !space ; j++){
				if(userTeam == team){
					if(lockerRoom[i][j-1] != 1 && lockerRoom[i-1][j] != 1){
						
						lockerRoom[i][j+1] = 0;
						lockerRoom[i+1][j] = 0;
						
						lockerRoom[i][j] = 1;
						
						space = true;
						msg = "Jugador añadido correctamente.";
					}
					else{
						msg = "No hay espacio suficiente.";
					}
				}
				else{
					msg = "El jugador es de un equipo distinto al equipo que ya lo está usando.";
				}
			}
		}
		return msg;
	}  
}