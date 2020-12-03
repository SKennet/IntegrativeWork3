package model;
import model;

public class Office{
	boolean space;
	Employee employeeAtOffice;
	int [][] offices; 
	
	public Office(){
		offices = new int [6][6];
	}	
	
	//The coaches can be founded using theirs id.
	public String addCoach(Employee coachToAdd){
		space = false;
		int id = coachToAdd.getId();
		for(int i = 0; i < column && !space; i++){
			for(int j = 0; j < row !space ; j++){
				if(offices[i][j-1] != 0 && offices[i-1][j] != 0){
							
					offices[i][j+1] = 0;
					offices[i+1][j] = 0;
							
					offices[i][j] = id;
							
					space = true;
					msg = "Entrenador añadido correctamente.";
				}
				else{
					msg = "No hay espacio suficiente.";
				}
			}
		}
		return msg;
	} 
	
	
	public boolean hasSpace(){
		return space;
	}
}