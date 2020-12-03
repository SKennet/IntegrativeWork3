package model;

public class Alineation{
	String date, tactic, formatFormation;
	int [][] formation = new int [10][7];
	
	public Alineation(String date, String tactic, String formatFormation){
		this.date = date;
		this.tactic = tactic;
		this.formatFormation = formatFormation;
	}
	
	public int [][] (String stringFormation){
		String [] parts = stringFormation.split("-");
		 
		int defenders = Integer.parseInt (parts[0]);
		int flyers = Integer.parseInt (parts[1]);
		int forwards = Integer.parseInt (parts[2]);
		
		
		int spaceDefenders = (int)(7/defenders);
		int spaceFlyers = (int)(7/flyers);
		int spaceForwards = (int)(7/forwards);
		
		for(int i = 0 ; i < 7 && defenders != 0; i++){
			if(formation[2][i-1] == 0){
				formation[2][i] = 1;
				defenders--;
			}
		}
		
		for(int i = 1 ; i < 6 && flyers != 0; i++){
			if(formation[5][i-1] == 0){
				formation[5][i] = 1;
				flyers--;
			}
		}
		
		for(int i = 1 ; i < 6 && forwards != 0; i++){
			if(formation[9][i-1] == 0){
				formation[9][i] = 1;
				forwards--;
			}
		}
		return formation;
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
}
