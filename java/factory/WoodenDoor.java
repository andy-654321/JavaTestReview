public class WoodenDoor implements Door{
	private int width;
	private int height;

	public WoodenDoor(int width, int height){
		this.width = width;
		this.height = height;
	}

	public int getWidth(){
		return width;
	}
	public int getHeight(){
		return height;
	}
}
