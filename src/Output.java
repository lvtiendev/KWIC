public class Output {
	private Sorter sorter;

	public Output(Sorter sorter) {
		this.sorter = sorter;
	}
	
	// Uppercase the first character in the string
	private String format(String line) {
		char firstChar = line.charAt(0);
		StringBuilder newLine = new StringBuilder(line);
		newLine.setCharAt(0, Character.toUpperCase(firstChar));
		return newLine.toString();
	}

	public void printOutput() {
		System.out.println("Result:");
		for (int i=0; i< sorter.length(); i++) {
			String line = sorter.getIndexedLineAtIndex(i);
			System.out.println(format(line));
		}
		System.out.println("Total: " + sorter.length() + " results");
	}
}
