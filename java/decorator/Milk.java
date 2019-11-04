public class Milk extends DecoratedDrink{
	private DecoratedDrink drink;
	public Milk(DecoratedDrink drink){
		this.drink = drink;
		this.type = drink.type + " with milk";
	}
	
	public double getPrice(){
		return drink.getPrice() + .5;
	}
}
