import java.util.*;

public class CircularShifter implements Shifter{
	Storage storage;
	ArrayList<String> shiftedLines;
	
	public int length() {
		return shiftedLines.size();
	}
	
	public String shiftedLineAtIndex(int index) {
		return shiftedLines.get(index);
	}
	
	public void setup(Storage _storage) {
		storage = _storage;
		shiftedLines = new ArrayList<String>();
		for (int i = 0; i < storage.numberOfLines(); i++) {
			String line = storage.getLineAtIndex(i);
			shiftedLines.addAll(generateShiftedLines(line));
		}
	}
	
	// Generate all circular shifted lines from one original line
	private ArrayList<String> generateShiftedLines(String line) {
		ArrayList<String> results = new ArrayList<String>();
		String[] tokens = line.split("\\s+");
		for (int j = 0; j < tokens.length; j++) {
			// Check if keyword is ignored
			if (!storage.isIgnoredWord(tokens[j])) {
				String newLine = tokens[j];
				for (int k = j + 1; k < tokens.length; k++) { newLine += " " + tokens[k]; }
				for (int k = 0; k < j; k++) { newLine += " " + tokens[k]; }
				results.add(newLine);
			}
		}
		return results;
	}
}
