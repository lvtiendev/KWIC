
public class MasterControl {
	public static void main(String[] args) {
		Storage storage = new Storage();
		Input input = new Input(storage);
		input.getInput();
	}
}
