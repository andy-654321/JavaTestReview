public class Driver{
	public static void main(String args[]){
		TextEditor editor = new TextEditor(new Regular());
		editor.write("Hello");
		editor.setState(new UpperCase());
		editor.write("Hello in bold");
	}
}
