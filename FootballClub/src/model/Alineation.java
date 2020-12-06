package model;

public class Alineation{
	String date, tactic, formatFormation;
	int [][] formationMatrix = new int [10][7];
	
	public Alineation(String date, String tactic, String formatFormation){
		this.date = date;
		this.tactic = tactic;
		createFormationMatrix(formatFormation);
	}
	

	public int[] getPlayersPerRow(String formation){
		String [] aux = formation.split("-");
		int[] playersPerRow = new int[aux.length];
		for(int i=0;i<aux.length;i++){
			playersPerRow[i]= Integer.parseInt(aux[i]);
		}
		return playersPerRow;
	}

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
	}

	public int [] readFormation(){
		boolean founded = false;
		String msg = "";
		int [] formationToMedia = new int [3];
		
		for(int i = 1; i < 4 ; i++){
			for(int j = 0; j < 7 ; j++){
				if(formationMatrix[i][j] == 1){
					formationToMedia[0] += 1;
				} 
			}
		}
		for(int i = 4; i < 7 ; i++){
			for(int j = 0; j < 7 ; j++){
				if(formationMatrix[i][j] == 1){
					formationToMedia[1] += 1;
				} 
			}
		}
		for(int i = 7; i < 10 ; i++){
			for(int j = 0; j < 7 ; j++){
				if(formationMatrix[i][j] == 1){
					formationToMedia[2] += 1;
				} 
			}
		}
		return formationToMedia;
	}

	public String getDate(){
		return date;
	}
}
