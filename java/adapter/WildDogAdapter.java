public class WildDogAdapter implements Lion{
	private WildDog dog;

	public WildDogAdapter(WildDog dog){
		this.dog = dog;
	}

	public void roar(){
		dog.bark();
	}
}
