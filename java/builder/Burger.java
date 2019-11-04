public class Burger{
	private String size;
	private String cheese = "n";
	private String doubled = "n";
	private String veggies = "n";
	
	public Burger(BurgerBuilder builder){
		this.size = builder.size;
		this.doubled = builder.doubled;
		this.veggies = builder.veggies;
		this.cheese = builder.cheese;
	}
	
	public String toString(){
		return "Size: " +
			size +
			"\nCheese: " +
			cheese + 
			"\nDoubled: " +
			doubled + 
			"\nVeggies: " +
			veggies;
	}
}
