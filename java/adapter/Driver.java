public class Driver{
	public static void main(String[] args){
		WildDog dog = new WildDog();
		AfricanLion lion = new AfricanLion();

		WildDogAdapter doga = new WildDogAdapter(dog);

		Hunter hunter = new Hunter();

		hunter.hunt(lion);
		hunter.hunt(doga);
	}
}
