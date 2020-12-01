package model;

public class Team {

	private String teamName;
	private String mainTrainer;
	private Players players;
	private int MAXIMUM_PLAYERS;
	private Employee technicalAsisstants;
	private boolean teamUsing;

	public Team() {
		// TODO - implement Team.Team
		throw new UnsupportedOperationException();
	}

	public String getTeamName() {
		return this.teamName;
	}

	/**
	 * 
	 * @param teamName
	 */
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getMainTrainer() {
		return this.mainTrainer;
	}

	/**
	 * 
	 * @param mainTrainer
	 */
	public void setMainTrainer(String mainTrainer) {
		this.mainTrainer = mainTrainer;
	}

	public Players getPlayers() {
		return this.players;
	}

	/**
	 * 
	 * @param players
	 */
	public void setPlayers(Players players) {
		this.players = players;
	}

	public int getMAXIMUM_PLAYERS() {
		// TODO - implement Team.getMAXIMUM_PLAYERS
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param MAXIMUM_PLAYERS
	 */
	public void setMAXIMUM_PLAYERS(int MAXIMUM_PLAYERS) {
		// TODO - implement Team.setMAXIMUM_PLAYERS
		throw new UnsupportedOperationException();
	}

	public Employee getTechnicalAsisstants() {
		return this.technicalAsisstants;
	}

	/**
	 * 
	 * @param technicalAsisstants
	 */
	public void setTechnicalAsisstants(Employee technicalAsisstants) {
		this.technicalAsisstants = technicalAsisstants;
	}

	public boolean getTeamUsing() {
		return this.teamUsing;
	}

	/**
	 * 
	 * @param teamUsing
	 */
	public void setTeamUsing(boolean teamUsing) {
		this.teamUsing = teamUsing;
	}

}