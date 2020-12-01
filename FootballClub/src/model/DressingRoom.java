package model;

public class DressingRoom{
	private final static int MAXIMUM_PLAYERS;
	boolean space, userTeam;
	
	public DressingRoom(int MAXIMUM_PLAYERS, boolean space, boolean userTeam){
		this.MAXIMUM_PLAYERS = MAXIMUM_PLAYERS;
		this.space = space;
		this.userTeam = userTeam;
	}
}