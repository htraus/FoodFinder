public class Conversion {
	private double conversionRate;
	private String homeUnit;
	private String commercialUnit;
	private String ingredientName;  

	
	public Conversion(double conversionRate, String homeUnit, String commercialUnit, String ingredientName){
		this.conversionRate = conversionRate;
		this.commercialUnit = commercialUnit; 
		this.ingredientName = ingredientName;
	}
	
	public double convert(double input){
		return input * this.conversionRate;
	}
	
	public String returnIngredientName(){
		return ingredientName;
	}
	
	public String returnHomeUnit(){
		return homeUnit;
	}
	
	public String returnCommericalUnit(){
		return commercialUnit;
	}
	

}
