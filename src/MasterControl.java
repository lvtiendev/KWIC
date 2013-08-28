
public class MasterControl {
	public static void main(String[] args) {
		Storage storage = new Storage();
		Input input = new Input(storage);
		input.getInput();
		CircularShifter shifter = new CircularShifter();
		shifter.setup(storage);
		Alphabetizer alphabetizer = new Alphabetizer(shifter);
		alphabetizer.sort();
		Output output = new Output(alphabetizer);
		output.printOutput();
	}
}
