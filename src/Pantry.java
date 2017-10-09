/*
 * Filename: Pantry.java
 *
 * Programmer: Camden Coe
 * ULID: 848056490
 *
 */

import java.util.ArrayList;

/**
 * @author Camden Coe
 *
 */
public class Pantry {
	
	ArrayList<Ingredient> ingredientList;
	
	Pantry(){
		ingredientList = new ArrayList<Ingredient>();
	}
	
	public void addIngredient(Ingredient ing){
		ingredientList.add(ing);
	}
	
	public void addIngredient() {
		Ingredient newIngredient = new Ingredient();
		ingredientList.add(newIngredient);
	}

	public void deleteIngredient(Ingredient ing){
		ingredientList.remove(ing);
	}
	
	public Ingredient searchIngredient(Ingredient ing){
		return ingredientList.get(ingredientList.indexOf(ing));
	}
	
	public ArrayList<Ingredient> listIngredients(){
		return ingredientList;
	}
}