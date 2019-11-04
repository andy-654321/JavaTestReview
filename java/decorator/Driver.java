public class Driver{
	public static void main(String args[]){
		DecoratedDrink drink = new Drink("Coffee");
		System.out.println(drink.type + ": " + drink.getPrice());
		System.out.println("Adding milk...");
		drink = new Milk(drink);
		System.out.println(drink.type + ": " + drink.getPrice());
	}
}
