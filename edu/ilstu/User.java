package edu.ilstu;

public class User
{
	private String firstName;
	private String lastName;
	
	User(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	public String getName()
	{
		return firstName + " " + lastName;
	}
}
