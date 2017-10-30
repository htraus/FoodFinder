package edu.ilstu;

import java.util.ArrayList;

public class RecipeBook
{
	
	private ArrayList<Recipe> recipeList;
	
	RecipeBook(Recipe r)
	{
		recipeList = new ArrayList<Recipe>().add(r);
	}
	
	RecipeBook()
	{
		recipeList = new ArrayList<Recipe>();
	}
	
	public void addRecipe(Recipe newRecipe)
	{
		recipeList.addRecipe;
	}
	
	public void deleteRecipe(Recipe oldRecipe)
	{
		recipeList.delete(oldRecipe);
	}
	
	public void sort()
	{
		//Sort with different parameters
	}
	
	public boolean save()
	{
		//Need database info first
	}
	
	public void load()
	{
		//Need database info first
	}
	
	public void displayAllRecipes()
	{
		//Need UI info
	}
	
}
