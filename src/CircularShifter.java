import java.util.*;

public class CircularShifter {
	Storage storage;
	ArrayList<String> shiftedLines;
	
	public CircularShifter(Storage storage) {
		this.storage = storage;
		shiftedLines = new ArrayList<String>();
	}
	
	public int length() {
		return shiftedLines.size();
	}
	
	public String shiftedLineAtIndex(int index) {
		return shiftedLines.get(index);
	}
	
	public void setup() {
		shiftedLines.clear();
		for (int i = 0; i < storage.numberOfLines(); i++) {
			String line = storage.getLineAtIndex(i);
			shiftedLines.addAll(generateShiftedLines(line));
		}
	}
	
	private ArrayList<String> generateShiftedLines(String line) {
		ArrayList<String> results = new ArrayList<String>();
		String[] tokens = line.split("\\s+");
		for (int j = 0; j < tokens.length; j++) {
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
