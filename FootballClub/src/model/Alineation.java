package model;

public class Alineation{
	String date, tactic, formatFormation;
	int [][] formationMatrix = new int [10][7];
	
	public Alineation(String date, String tactic, String formatFormation){
		this.date = date;
		this.tactic = tactic;
		createFormationMatrix(formatFormation);
	}
	
	public String formatStringAlineation(int [][] formationToChange){
		int defenders;
		int flyers;
		int forwards;
		
		for(int i = 0 ; i < 7 ; i++){
			if(formationToChange[2][i] == 1){
				defenders++;
			}
		}
		
		for(int i = 0 ; i < 7 ; i++){
			if(formationToChange[5][i] == 1){
				flyers++;
			}
		}
		
		for(int i = 0 ; i < 7 ; i++){
			if(formationToChange[9][i] == 1){
				forwards++;
			}
		}
		String msg = defenders + "-" + flyers + "-" + forwards;
		return msg;
	}
	
	/**
	Converts a String with the formation to an array of integers in order to facilitate the following operations<br>
	<b> pre: </b> <br>
	<b> post: </b> Returns an array of integers with the formation of the players <br>
	@param formation String that indicates the formation. Must be an String with numbers separated by "-". The minimum is 3, the maximum is 6
	@return playersPerRow
	*/
	public int[] getPlayersPerRow(String formation){
		String aux = formation.split("-");
		int[] playersPerRow = new int[aux.length];
		for(int i=0;i<aux.length;i++){
			playersPerRow[i]=(int) aux[i];
		}
		return playersPerRow;
	}
	/**
	Creates the formation matrix<br>
	<b> pre: </b> <br>
	<b> post: </b> The class now has a formation matrix based on the information the user gave <br>
	@param formation String that indicates the formation. Must be an String with numbers separated by "-". The minimum is 3, the maximum is 6
	*/
	public void createFormationMatrix(String formation){
		int[] formationIndicator = getPlayersPerRow(formation);
		switch(formationIndicator.length){
			case 3:
				organizeRows(2,formationIndicator[2]);
				organizeRows(5,formationIndicator[1]);
				organizeRows(8,formationIndicator[0]);
				break;
			case 4:
				organizeRows(2,formationIndicator[3]);
				organizeRows(4,formationIndicator[2]);
				organizeRows(6,formationIndicator[1]);
				organizeRows(8,formationIndicator[0]);
				break;
			case 5:
				organizeRows(2,formationIndicator[4]);
				organizeRows(3,formationIndicator[3]);
				organizeRows(5,formationIndicator[2]);
				organizeRows(6,formationIndicator[1]);
				organizeRows(8,formationIndicator[0]);
				break;
			case 6:
				organizeRows(2,formationIndicator[5]);
				organizeRows(3,formationIndicator[4]);
				organizeRows(4,formationIndicator[3]);
				organizeRows(5,formationIndicator[2]);
				organizeRows(6,formationIndicator[1]);
				organizeRows(8,formationIndicator[0]);
				break;
		}
	}
	/**
	Organizes the players according to the row they should be in<br>
	<b> pre: </b> <br>
	<b> post: </b> Players are ordered in their respective row in the matrix <br>
	@param rowIndicator Int that indicates the row in which the players are
	@param playersPerRow Int that indicates the number of players that are for each row
	*/
	public void organizeRows(int rowIndicator,int playersPerRow){
		
		switch(playersPerRow){
			case 1:
				formationMatrix[rowIndicator][3]=1;
				break;
			case 2:
				formationMatrix[rowIndicator][2]=1;
				formationMatrix[rowIndicator][4]=1;
				break;
			case 3:
				formationMatrix[rowIndicator][2]=1;
				formationMatrix[rowIndicator][3]=1;
				formationMatrix[rowIndicator][4]=1;
			case 4:
				formationMatrix[rowIndicator][1]=1;
				formationMatrix[rowIndicator][2]=1;
				formationMatrix[rowIndicator][3]=1;
				formationMatrix[rowIndicator][4]=1;
				break;
			case 5:
				formationMatrix[rowIndicator][1]=1;
				formationMatrix[rowIndicator][2]=1;
				formationMatrix[rowIndicator][3]=1;
				formationMatrix[rowIndicator][4]=1;
				formationMatrix[rowIndicator][5]=1;
				break;
			case 6:
				formationMatrix[rowIndicator][1]=1;
				formationMatrix[rowIndicator][2]=1;
				formationMatrix[rowIndicator][3]=1;
				formationMatrix[rowIndicator][4]=1;
				formationMatrix[rowIndicator][5]=1;
				formationMatrix[rowIndicator][6]=1;
				break;
			case 7:
				for(int i=0;i<6;i++){
					formationMatrix[rowIndicator][i]=1;
				}
				break;
		}
		return formationMatrix;
	}
}
