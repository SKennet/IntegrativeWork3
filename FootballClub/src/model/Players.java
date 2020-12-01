package model;

public class Players extends Employee {

	private int shirtNum;
	private int goles;
	private double markAverage;
	private String position;
	private int marketValue;

	public Players() {
		// TODO - implement Players.Players
		throw new UnsupportedOperationException();
	}

	public int calculateMarketValue() {
		// TODO - implement Players.calculateMarketValue
		throw new UnsupportedOperationException();
	}

	public int getShirtNum() {
		return this.shirtNum;
	}

	/**
	 * 
	 * @param shirtNum
	 */
	public void setShirtNum(int shirtNum) {
		this.shirtNum = shirtNum;
	}

	public int getGoles() {
		return this.goles;
	}

	/**
	 * 
	 * @param goles
	 */
	public void setGoles(int goles) {
		this.goles = goles;
	}

	public double getMarkAverage() {
		return this.markAverage;
	}

	/**
	 * 
	 * @param markAverage
	 */
	public void setMarkAverage(double markAverage) {
		this.markAverage = markAverage;
	}

	public String getPosition() {
		return this.position;
	}

	/**
	 * 
	 * @param position
	 */
	public void setPosition(String position) {
		this.position = position;
	}

	public int getMarketValue() {
		return this.marketValue;
	}

	/**
	 * 
	 * @param marketValue
	 */
	public void setMarketValue(int marketValue) {
		this.marketValue = marketValue;
	}

}