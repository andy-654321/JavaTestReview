public class BurgerBuilder{
	public String size;
	public String cheese = "n";
	public String doubled = "n";
	public String veggies = "n";

	public BurgerBuilder(String size){
		this.size = size;
	}

	public BurgerBuilder addCheese(){
		cheese = "y";
		return this;
	}

	public BurgerBuilder doubleIt(){
		doubled = "y";
		return this;
	}
	public BurgerBuilder addVeggies(){
		veggies = "y";
		return this;
	}
	public BurgerBuilder build(){
		return this;
	}
}
