package model;

public class MainCoaches extends Employee {

	private int marketValue;
	private int experienceYears;
	private int teamsManaged;
	private int championshipsWinned;

	public int calculateCoachMarketValue() {
		// TODO - implement MainCoaches.calculateCoachMarketValue
		throw new UnsupportedOperationException();
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

	public int getExperienceYears() {
		return this.experienceYears;
	}

	/**
	 * 
	 * @param experienceYears
	 */
	public void setExperienceYears(int experienceYears) {
		this.experienceYears = experienceYears;
	}

	public int getTeamsManaged() {
		return this.teamsManaged;
	}

	/**
	 * 
	 * @param teamsManaged
	 */
	public void setTeamsManaged(int teamsManaged) {
		this.teamsManaged = teamsManaged;
	}

	public int getChampionshipsWinned() {
		return this.championshipsWinned;
	}

	/**
	 * 
	 * @param championshipsWinned
	 */
	public void setChampionshipsWinned(int championshipsWinned) {
		this.championshipsWinned = championshipsWinned;
	}

}