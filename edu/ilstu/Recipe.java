package edu.ilstu;
/**
 * @author Heather Trausch
 */

import java.util.ArrayList;
import java.util.List;

public class Recipe {
	
	private String instructions;
	private int rating;
	private List<Ingredient> ingredients = new ArrayList<Ingredient>();
	private List<User> users = new ArrayList<User>();
	private List<Tag> tags = new ArrayList<Tag>();
	
	public void displayInstructions(){
		System.out.print(instructions);
	}
	
	public void displayRating(){
		System.out.print(rating);
	}
	
	public void displayIngredients(){
		Ingredient ingredient = new Ingredient();
		ingredient.display(ingredients);
	}
	
	public void displayUsers(){
		User user = new User();
		user.display(users);
	}
	
	public void displayTags(){
		Tag tag = new Tag();
		tag.display(tags);
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
	
	public void setTags(List<Tag> tags){
		this.tags = tags;
	}
	
	public List<Tag> getTags(){
		return tags;
	}
	
}