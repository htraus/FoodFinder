package foodfindergui;

import java.util.ArrayList;
import java.util.List;

/**
 * This class holds all the information for a recipe.
 * It also has methods to display the information.
 * 
 * @author Heather Trausch
 *
 */
public class Recipe {
	
	private String name;
	private String instructions;
	private int rating;
	private List<Ingredient> ingredients = new ArrayList<Ingredient>();
	private List<User> users = new ArrayList<User>();
	private List<Tags> tags = new ArrayList<Tags>();
	
	
	public Recipe(String name, String instructions, int rating, List<Ingredient> ingredients, List<User> users, List<Tags> tags){
		this.instructions = instructions;
		this.rating = rating;
		this.ingredients = ingredients;
		this.users = users;
		this.tags = tags;
	}
	
	/**
	 * This method returns the name in String format.
	 * 
	 * @return the name
	 */
	public String displayName(){
		return name;
	}
	
	/**
	 * This method returns the instructions in String format.
	 * 
	 * @return the instructions
	 */
	public String displayInstructions(){
		return instructions;
	}
	
	/**
	 * This method returns the ratings in String format.
	 * 
	 * @return the ratings
	 */
	public String displayRating(){
		return Integer.toString(rating);
	}
	
	/**
	 * This method returns the ingredients in String format.
	 * 
	 * @return the ingredients
	 */
	public String displayIngredients(){
		String listOfIng = "";
		
		for(int i = 0; i < this.ingredients.size(); i++){
			Ingredient ing = this.ingredients.get(i);
			listOfIng = listOfIng + ing.getName() + "\n";
		}	
		
		return listOfIng;
	}
	
	/**
	 * This method returns the users in String format.
	 * 
	 * @return the users
	 */
	public String displayUsers(){
		String listOfUsers = "";
		
		for(int i = 0; i < this.users.size(); i++){
			User user = this.users.get(i);
			listOfUsers = listOfUsers + user.getName() + "\n";
			// adapt to user info ^^
		}
		
		return listOfUsers;
	}
	
	/**
	 * This method returns the tags in String format.
	 * 
	 * @return the tags
	 */
	public String displayTags(){
		String listOfTags = "";
		
		for(int i = 0; i < this.tags.size(); i++){
			Tags tag = this.tags.get(i);
			listOfTags = listOfTags +tag.displayTag() + "\n";
		}
		
		return listOfTags;
	}
	
	/**
	 * This method returns all the information for a recipe in a single String
	 * 
	 * @return all recipe information
	 */
	public String displayRecipe(){
		String recipe = null;
		recipe = name + "\n" + rating + "\n" + tags + "\n" + users + "\n" + ingredients + "\n" + instructions;
		return recipe;
	}
	
	// Getters and setters for all instance variables
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setInstructions(String instructions){
		this.instructions = instructions;
	}
	
	public String getInstructions(){
		return instructions;
	}
	
	public void setRating(int rating){
		this.rating = rating;
	}
	
	public int getRating(){
		return rating;
	}
	
	public void setIngredients(List<Ingredient> ingredients){
		this.ingredients = ingredients;
	}
	
	public List<Ingredient> getIngredients(){
		return ingredients;
	}
	
	public void setUsers(List<User> users){
		this.users = users;
	}
	
	public List<User> getUser(){
		return users;
	}
	
	public void setTags(List<Tags> tags){
		this.tags = tags;
	}
	
	public List<Tags> getTags(){
		return tags;
	}
	
}
