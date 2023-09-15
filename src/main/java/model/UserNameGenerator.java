/**
 * @author tehli - lbellison
 * CIS175 - Fall 2023
 * Sep 14, 2023
 */
package model;

/**
 * @author LILY ELLISON - LBELLISON
 * CIS175 - FALL 2023
 * Sep 14, 2023
 */
public class UserNameGenerator {
	
	private String firstName;
	private String lastName;
	private String userName;
	private final int FIRST_INDEX = 0;
	
	
	public UserNameGenerator() {
		super();
	}
	
	public UserNameGenerator(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		setUserName(firstName, lastName);
	}
	
	public void setNames(String firstName, String lastName) {
		this.firstName =firstName;
		this.lastName = lastName;
		setUserName(firstName, lastName);
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String firstName, String lastName) {
		this.userName = firstName.charAt(FIRST_INDEX) + "." + lastName;
	}
	
	@Override
	public String toString() {
		return "Welcome, " + firstName + "! Your username is: " + userName + ".";
	}

}
