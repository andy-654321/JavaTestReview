public class Bulb implements BulbState{
	private BulbState state;

	public Bulb(){
		this.state = new BulbOff();
	}

	public void lookAt(){
		state.lookAt();
	}

	public void turnOn(){
		System.out.println("Bulb has been turned on");
		this.state = new BulbOn();
	}

	public void turnOff(){
		System.out.println("Bulb has been turned off");
		this.state = new BulbOff();
	}
}
