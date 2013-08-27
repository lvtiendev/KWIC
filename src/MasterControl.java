
public class MasterControl {
	public static void main(String[] args) {
		Storage storage = new Storage();
		Input input = new Input(storage);
		input.getInput();
		CircularShifter shifter = new CircularShifter(storage);
		shifter.setup();
		Alphabetizer alphabetizer = new Alphabetizer(shifter);
		alphabetizer.sort();
	}
}
