package edu.ilstu;

import java.util.ArrayList;


/*
 * This is just a class meant to test the functionality of the classes.
 * Not meant to be permanent at all, or even that useful outside of 
 * checking for stupid errors.
 */
public class TestingMain{
	
	public static void main(String[] args) 
	{
		Recipe r = new Recipe();
		
		ArrayList<Ingredient> ingredientList = new ArrayList<Ingredient>();
		
		Ingredient flour = new Ingredient();
		flour.setName("flour");
		
		ingredientList.add(flour);
		
		r.setInstructions("Step one: Put toast in toaster");
		r.setIngredients(ingredientList);
		System.out.println("Hello");
	}
}