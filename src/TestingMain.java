import java.util.ArrayList;

public class TestingMain{
	
	public static void main(String[] args) {
		Pantry testPantry= new Pantry();
		Ingredient ing1 = new Ingredient("Flour", "Pounds", "Cups", 10, 2);
		testPantry.addIngredient(ing1);
		Ingredient ing2 = new Ingredient("Sugar", "Pounds", "Cups", 13, 1);
		testPantry.addIngredient(ing2);
		ArrayList<Ingredient> pan = testPantry.listIngredients();
		for(int i = 0; i < pan.size(); i++) {
			System.out.println(pan.get(i).getName() + ", " + pan.get(i).getAmount());
		}
	}
}