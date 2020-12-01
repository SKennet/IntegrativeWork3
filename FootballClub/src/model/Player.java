package model;
import model;

public class Player extends Employee{
	int shirtNum, goles, marketValue;
	double markAverage;
	String position;
	
	public Player(int shirtNum, int goles, double markAverage, String position){
		this.shirtNum = shirtNum;
		this.goles = goles;
		this.markAverage = markAverage;
		this.position = position;
	}
}