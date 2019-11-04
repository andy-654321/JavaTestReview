public class Drink extends DecoratedDrink{
	public Drink(String type){
		this.type = type;
		this.price = 1.0;
	}

	public double getPrice(){
		return price;
	}
}
