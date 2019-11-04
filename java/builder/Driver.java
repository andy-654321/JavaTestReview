public class Driver{
	public static void main(String[] args){
		Burger burger = new Burger(new BurgerBuilder("Large").addCheese().doubleIt().build());
		System.out.println(burger.toString());
	}
}
