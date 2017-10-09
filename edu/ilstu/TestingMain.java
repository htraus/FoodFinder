package ilstu;
import java.util.ArrayList;

/*
 * This is just a class meant to test the functionality of the classes.
 * Not meant to be permanent at all, or even that useful outside of 
 * checking for stupid errors.
 */
public class TestingMain{
	
	public static void main(String[] args) {
		Pantry testPantry= new Pantry();
		
		Ingredient ing1 = new Ingredient("Flour", "Pounds", "Cups", 10, 2);
		testPantry.addIngredient(ing1);
		
		Ingredient ing2 = new Ingredient("Sugar", "Pounds", "Cups", 13, 1);
		testPantry.addIngredient(ing2);
		
		Ingredient ing3 = new Ingredient();
		ing3.setName("Flour");
		
		ArrayList<Ingredient> pan = testPantry.listIngredients();
		
		for(int i = 0; i < pan.size(); i++) {
			System.out.println(pan.get(i).getName() + ", " + pan.get(i).getAmount());
			if(pan.get(i).equals(ing3)){
				System.out.println("The flours are equal");
				testPantry.deleteIngredient(ing3);
			}
			else
				System.out.println("The sugar is not.");
		}
		
		
	}
}