package model;
import model;

public class Player extends Employee{
	int shirtNum, goles, position, salary;
	double markAverage, level, marketValue;
	private static final double LVL_CONSTANT = 0.9;
	
	
	public Player(int shirtNum, int goles, double markAverage, int position, String name, int id, boolean state, int salary){
		super(name, id, state, salary);
		
		this.salary = super.salary;
		this.shirtNum = shirtNum;
		this.goles = goles;
		this.markAverage = markAverage;
		this.position = position;
	}
	
	public double calculateLevel(){
		level = 0;
		
		if(position == 1){
			level = (markAverage) * (LVL_CONSTANT);
		}
		else if(position == 2){
			level = (markAverage*LVL_CONSTANT) + (goles/100);
		}
		else if(position == 3){
			level = (markAverage*LVL_CONSTANT) + (goles/90);
		}
		else if(position == 4){
			level = (markAverage*LVL_CONSTANT) + (goles/80);
		}
		return level;
	}
	
	public double calculateMarketValue(){
		marketValue = 0;
		
		if(position == 1){
			marketValue = (salary * 12) + (markAverage*150);
		}
		else if(position == 2){
			marketValue = (salary * 13) + (markAverage*125) + (goles*100);
		}
		else if(position == 3){
			marketValue = (salary * 14) + (markAverage*135) + (goles*125);
		}
		else if(position == 4){
			marketValue = (salary * 15) + (markAverage*145) + (goles*150);
		}
		
		return marketValue;
	}
	
	@Override
	public String showEmployeeInfo(){
		
		//This it's to update the level and marketValue.
		calculateLevel();
		calculateMarketValue();
		
		String msg = super.showEmployeeInfo();
		msg += "Su número de camiseta es: " + shirtNum + "\n";
		msg += "Ha hecho: " + goles + " goles."+ "\n";
		msg += "Su calificación promedio es:  " + markAverage + "\n";
		msg += "Su posición es: " + position + "\n";
		msg += "Su nivel es: " + level + "\n";
		msg += "Su valor en el mercado es: $" + marketValue + "\n";
		msg += "\n";
	}
	
	
}