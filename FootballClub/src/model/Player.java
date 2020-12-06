package model;
import model.*;

public class Player extends Employee implements PriceAndLevel{
	int shirtNum, goals, position, salary, id;
	double markAverage, level, marketValue;
	Team playerTeam;
	private static final double LVL_CONSTANT = 0.9;
	
	
	public Player(int shirtNum, int goals, double markAverage, int position, String name, int id, String state, int salary){
		super(name, id, state, salary);
		
		this.salary = super.salary;
		this.shirtNum = shirtNum;
		this.goals = goals;
		this.markAverage = markAverage;
		this.position = position;
		this.id = id;
		this.playerTeam = playerTeam;
	}
	
	@Override
	public double calculateLevel(){
		double level;
		switch(position){
			case 1:
				level = markAverage*0.9;
				break;
			case 2:
				level = (markAverage*0.9)+(goals/100);
				break;
			case 3:
				level = (markAverage*0.9)+(goals/90);
				break;
			case 4:
				level = (markAverage*0.9)+(goals/80);
				break;
			default:
				level=0;
				break;
		}
		return level;
	}
	
	
	@Override
	public double getLevel(){
		return level;
	}
	
	@Override
	public void updateLevel(){
		level=calculateLevel();
	}

	@Override
	public double getPrice(){
		return marketValue;
	}
	
	@Override
	public void updatePrice(){
		marketValue=calculatePrice();
	}
	
	@Override
	public double calculatePrice(){
		double price;
		switch(position){
			case 1:
				price = (getSalary()*12)+(getMarkAverage()*150);
				break;
			case 2:
				price = (getSalary()*13)+(getMarkAverage()*125)+(getGoals()*100);
				break;
			case 3:
				price = (getSalary()*14)+(getMarkAverage()*135)+(getGoals()*125);
				break;
			case 4:
				price = (getSalary()*15)+(getMarkAverage()*145)+(getGoals()*150);
				break;
			default:
				price=0;
				break;
		}
		return price;
	}
	
	@Override
	public String showEmployeeInfo(){
		
		//This it's to update the level and marketValue.
		calculateLevel();
		calculatePrice();
		
		String msg = super.showEmployeeInfo();
		msg += "Su número de camiseta es: " + shirtNum + "\n";
		msg += "Ha hecho: " + goals + " goals."+ "\n";
		msg += "Su calificación promedio es:  " + markAverage + "\n";
		msg += "Su posición es: " + position + "\n";
		msg += "Su nivel es: " + level + "\n";
		msg += "Su valor en el mercado es: $" + marketValue + "\n";
		msg += "\n";
		
		return msg;
	}
	
	//Getters.
	@Override
	public int getId(){
		return super.getId();
	}
	
	@Override
	public int getSalary(){
		return super.getSalary();
	}
	
	@Override
	public String getName(){
		return super.getName();
	}
	
	@Override
	public String getState(){
		return super.getState();
	}
	
	public int getShirtNum(){
		return shirtNum;
	}
	public int getGoals(){
		return goals;
	}
	public int getPosition(){
		return position;
	}
	public double getMarkAverage(){
		return markAverage;
	}

	public Team getTeam(){
		return playerTeam;
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
	public void setState(String newState){
		super.setState(newState);
	}
	
	public void setShirtNum(int newShirt){
		shirtNum = newShirt;
	}
	public void setGoles(int newGoles){
		goals = newGoles;
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
	public void setTeam(Team newTeam){
		playerTeam = newTeam;
	}
	
	
}