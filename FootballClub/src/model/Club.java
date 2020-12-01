package model;

public class Club {

	private int nit;
	private String name;
	private String fundationDate;

	public Club() {
		// TODO - implement Club.Club
		throw new UnsupportedOperationException();
	}

	public int getNit() {
		return this.nit;
	}

	/**
	 * 
	 * @param Nit
	 */
	public void setNit(int Nit) {
		this.nit = Nit;
	}

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public String getFundationDate() {
		return this.fundationDate;
	}

	/**
	 * 
	 * @param fundationDate
	 */
	public void setFundationDate(String fundationDate) {
		this.fundationDate = fundationDate;
	}

}