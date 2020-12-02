package model;
import model;

public class MainCoach extends Employee{
	int experienceYears, teamsManaged, championshipsWinned, salary;
	double marketValue, level;
	
	
	public MainCoach(int experienceYears, int teamsManaged, int championshipsWinned, String name, int id, boolean state, int salary){
		super(name, id, state, salary);
		
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
}