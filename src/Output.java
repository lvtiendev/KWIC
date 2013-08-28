import java.util.*;

public class Output {
	private Alphabetizer alphabetizer;

	public Output(Alphabetizer alphabetizer) {
		this.alphabetizer = alphabetizer;
	}

	public void printOutput() {
		System.out.println("Result:");
		for (int i=0; i< alphabetizer.length(); i++) {
			System.out.println(alphabetizer.getIndexedLineAtIndex(i));
		}
	}
}
