package model;
import model;

public class Player extends Employee{
	int shirtNum, goles, position, salary, id;
	double markAverage, level, marketValue;
	private static final double LVL_CONSTANT = 0.9;
	
	
	public Player(int shirtNum, int goles, double markAverage, int position, String name, int id, boolean state, int salary){
		super(name, id, state, salary);
		
		this.salary = super.salary;
		this.shirtNum = shirtNum;
		this.goles = goles;
		this.markAverage = markAverage;
		this.position = position;
		this.id = id;
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
	
	//Getters.
	@Override
	public int getId(){
		return super.getId();
	}
	
	@Override
	public int getSalary(){
		return super.getSalary;
	}
	
	@Override
	public String getName(){
		return super.getName();
	}
	
	@Override
	public boolean getState(){
		return super.getState();
	}
	
	public int getShirtNum(){
		return shirtNum;
	}
	public int getGoles(){
		return goles;
	}
	public int getPosition(){
		return position;
	}
	public double getMarkAverage(){
		return markAverage;
	}
	public double getMarketValue(){
		return calculateMarketValue();
	}
	public double getLevel(){
		return calculateLevel();
	}
	
	//Setters.
	@Override
	public void setId(int newId){
		super.setId(newId);
	}
	
	@Override
	public void setSalary(int newSalary){
		super.setSalary(newSalary);
	}
	
	@Override
	public void setName(String newName){
		super.setName(newName);
	}
	
	@Override
	public void setState(boolean newState){
		super.setState(newState);
	}
	
	public void setShirtNum(int newShirt){
		shirtNum = newShirt;
	}
	public void setGoles(int newGoles){
		goles = newGoles;
	}
	public void setPosition(int newPosition){
		position = newPosition;
	}
	public void setMarkAverage(double newMark){
		markAverage = newMark;
	}
	public void setLevel(double newLevel){
		level = newLevel;
	}
	public void setMarketValue(double newValue){
		marketValue = newValue;
	}
	
	
}