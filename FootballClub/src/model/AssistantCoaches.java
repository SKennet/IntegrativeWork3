package model;

public class AssistantCoaches extends Employee {

	private int experienceYears;
	private boolean wasPlayer;
	private String expertise;

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

	public boolean getWasPlayer() {
		return this.wasPlayer;
	}

	/**
	 * 
	 * @param wasPlayer
	 */
	public void setWasPlayer(boolean wasPlayer) {
		this.wasPlayer = wasPlayer;
	}

	public String getExpertise() {
		return this.expertise;
	}

	/**
	 * 
	 * @param expertise
	 */
	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}

}