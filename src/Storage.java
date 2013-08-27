import java.util.*; 

public class Storage {
	private ArrayList<String> lines;
	private ArrayList<String> ignoredWords;
	
	public Storage() {
		this.lines = new ArrayList<String>();
		this.ignoredWords = new ArrayList<String>();
	}
	
	public void addLine(String line) {
		lines.add(line);
	}
	
	public String getLineAtIndex(int index) {
		return lines.get(index);
	}
	
	public int numberOfLines() {
		return lines.size();
	}
	
	public void addIgnoredWord(String word) {
		ignoredWords.add(word);
	}
	
	public String getIgnoredWordAtIndex(int index) {
		return ignoredWords.get(index);
	}
	
	public int numberOfIgnoredWords() {
		return ignoredWords.size();
	}
	
	public boolean isIgnoredWord(String word) {
		return ignoredWords.contains(word);
	}
}
