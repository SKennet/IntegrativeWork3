package model;
import model;

public class MainCoach extends Employee{
	int experienceYears, teamsManaged, championshipsWinned, salary;
	double marketValue, level;
	
	
	public MainCoach(int experienceYears, int teamsManaged, int championshipsWinned){
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
}