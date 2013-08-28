public class Output {
	private Alphabetizer alphabetizer;

	public Output(Alphabetizer alphabetizer) {
		this.alphabetizer = alphabetizer;
	}
	
	private String format(String line) {
		char firstChar = line.charAt(0);
		StringBuilder newLine = new StringBuilder(line);
		newLine.setCharAt(0, Character.toUpperCase(firstChar));
		return newLine.toString();
	}

	public void printOutput() {
		System.out.println("Result:");
		for (int i=0; i< alphabetizer.length(); i++) {
			String line = alphabetizer.getIndexedLineAtIndex(i);
			System.out.println(format(line));
		}
	}
}
