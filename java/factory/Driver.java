public class Driver{
	public static void main(String[] args){
		DoorFactory factory = new DoorFactory();
		WoodenDoor door = factory.makeDoor(84, 36);
		System.out.println(door.getHeight() + "x" + door.getWidth());
	}
}
