package model;
import model.*;

public class MainCoach extends Employee{
	int experienceYears, teamsManaged, championshipsWinned, salary;
	double marketValue, level;
	String name;
	
	
	public MainCoach(int experienceYears, int teamsManaged, int championshipsWinned, String name, int id, String state, int salary){
		super(name, id, state, salary);
		
		this.name = name;
		this.salary = super.salary;
		this. experienceYears = experienceYears;
		this.teamsManaged = teamsManaged;
		this.championshipsWinned = championshipsWinned;
		
		this.level = calculateLevel();
		this.marketValue = calculateMarketValue();
	}
	
	public double calculateLevel(){		
		level = 5 + (championshipsWinned/10);
		return level;		
	}
	
	public double calculateMarketValue(){
		marketValue = (salary*10) + (experienceYears * 100) + (championshipsWinned * 50);
		return marketValue;
	}
	
	@Override
	public String showEmployeeInfo(){
		
		calculateLevel();
		calculateMarketValue();
		
		String msg = super.showEmployeeInfo();
		msg += "Años de experiencia: " + experienceYears + "\n";
		msg += "Ha dirijido " + teamsManaged + " equipos."+ "\n";
		msg += "Ha ganado " + championshipsWinned + " torneos."+ "\n";
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
	
	public int getExperienceYears(){
		return experienceYears;
	}
	public int getTeamsManaged(){
		return teamsManaged;
	}
	public int getChampionshipsWinned(){
		return championshipsWinned;
	}
	public double getLevel(){
		return level;
	}
	public double getMarketValue(){
		return marketValue;
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
	
	public void setExperienceYears(int newExperience){
		experienceYears = newExperience;
	}
	public void setMarketValue(double newValue){
		marketValue = newValue;
	}
	public void setLevel(double newLevel){
		level = newLevel;
	}
	public void setTeamsManaged(int newTeamsManaged){
		teamsManaged = newTeamsManaged;
	}
	public void setChampionshipsWinned(int newWinned){
		championshipsWinned = newWinned;
	}
	
	
}