package model;
import model.*;

public class MainCoach extends Coach implements PriceAndLevel{
	int experienceYears, teamsManaged, championshipsWinned, salary;
	double marketValue, level;
	String name;
	
	
	public MainCoach(int experienceYears, int teamsManaged, int championshipsWinned, String name, int id, String state, int salary){
		super(name, id, state, salary, experienceYears);
		
		this.name = name;
		this.salary = super.salary;
		this. experienceYears = experienceYears;
		this.teamsManaged = teamsManaged;
		this.championshipsWinned = championshipsWinned;
		
		this.level = calculateLevel();
		this.marketValue = calculatePrice();
	}
	
	@Override
	public double calculateLevel(){
		double level = 5+(championshipsWinned/10);
		return level;
	}
	
	@Override
	public void updateLevel(){
		level=calculateLevel();
	}
	
	@Override
	public double getLevel(){
		return level;
	}
	
	@Override
	public double calculatePrice(){
		double price = (getSalary()*10)+(getExperienceYears()*100)+(getChampionshipsWinned()*50);
		return price;
	}
	
	@Override
	public void updatePrice(){
		marketValue=calculatePrice();
	}
	
	@Override
	public double getPrice(){
		return marketValue;
	}
	
	@Override
	public String showEmployeeInfo(){
		
		calculateLevel();
		calculatePrice();
		
		String msg = super.showEmployeeInfo();
		msg += "Ha dirijido " + teamsManaged + " equipos."+ "\n";
		msg += "Ha ganado " + championshipsWinned + " torneos."+ "\n";
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
	@Override
	public int getExperienceYears(){
		return experienceYears;
	}
	
	public int getTeamsManaged(){
		return teamsManaged;
	}
	public int getChampionshipsWinned(){
		return championshipsWinned;
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
	
	@Override
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