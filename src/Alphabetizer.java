import java.util.*;

public class Alphabetizer {
	CircularShifter shifter;
	ArrayList<String> indexedLines;
	public Alphabetizer(CircularShifter shifter) {
		this.shifter = shifter;
		indexedLines = new ArrayList<String>();
	}
	
	public void sort() {
		ArrayList<String> tempIndexedLines = new ArrayList<String>();
		for (int i = 0; i < shifter.length(); i++) {
			tempIndexedLines.add(shifter.shiftedLineAtIndex(i));
		}
		
		// Sort
		Collections.sort(tempIndexedLines, String.CASE_INSENSITIVE_ORDER);
		
		// Remove duplications
		if (!tempIndexedLines.isEmpty()) { indexedLines.add(tempIndexedLines.get(0)); }
		for (int i = 1; i < tempIndexedLines.size(); i++) {
			if (!tempIndexedLines.get(i).equals(tempIndexedLines.get(i-1))) {
				indexedLines.add(tempIndexedLines.get(i));
			}
		}
	}
	
	public int length() {
		return indexedLines.size();
	}
	
	public String getIndexedLineAtIndex(int index) {
		return indexedLines.get(index);
	}
}
