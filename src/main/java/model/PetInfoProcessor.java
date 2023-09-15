/**
 * @author tehli - lbellison
 * CIS175 - Fall 2023
 * Sep 15, 2023
 */
package model;

/**
 * @author LILY ELLISON - LBELLISON
 * CIS175 - FALL 2023
 * Sep 15, 2023
 */
public class PetInfoProcessor {
	private String pName;
	private String pSex;
	private String pGender;
	
	public PetInfoProcessor() {
		super();
	}
	
	public PetInfoProcessor(String pName, String pSex) {
		super();
		this.pName = pName;
		this.pSex = pSex;
		setpGender(pSex);
		
	}
	
	public void setPetInfo(String pName, String pGender) {
		this.pName = pName;
		this.pGender = pGender;
		
	}
	
	public void setpGender(String pSex) {
		if(pSex.equals("Male")) {
			this.pGender = "boy";
		} else if(pSex.equals("Female")) {
			this.pGender = "girl";
		}
	}

	/**
	 * @return the pName
	 */
	public String getpName() {
		return pName;
	}

	/**
	 * @param pName the pName to set
	 */
	public void setpName(String pName) {
		this.pName = pName;
	}

	/**
	 * @return the pSex
	 */
	public String getpSex() {
		return pSex;
	}

	/**
	 * @param pSex the pSex to set
	 */
	public void setpSex(String pSex) {
		this.pSex = pSex;
		setpGender(pSex);
	}

	/**
	 * @return the pGender
	 */
	public String getpGender() {
		return pGender;
	}
	
	@Override
	public String toString() {
		return "Hello " + pName + "! You're such a good " + pGender + "!"; 
	}

}


