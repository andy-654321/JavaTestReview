public class Driver{
	public static void main(String[] args){
		Bulb bulb = new Bulb();
		LightSwitch switcher = new LightSwitch();

		TurnOn on = new TurnOn(bulb);
		TurnOff off = new TurnOff(bulb);

		switcher.submit(on);
		bulb.lookAt();
		bulb.lookAt();
		bulb.lookAt();
		bulb.lookAt();
		switcher.submit(off);
		bulb.lookAt();
		bulb.lookAt();
		bulb.lookAt();
	}
}

