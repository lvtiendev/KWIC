import java.util.*;

public class Input {
	private Storage storage;
	
	public Input(Storage storage) {
		this.storage = storage;
	}
	
	public void getInput() {
		System.out.println("Please enter lines: (Enter a blank line to stop)");
		Scanner sc = new Scanner(System.in);

		while (true) {
			String line = sc.nextLine();
			if (line.trim().compareTo("")!= 0) {
				storage.addLine(line);
			} else {
				System.out.print("Do you want to stop? y/n: ");
				line = sc.nextLine();
				if (line.toLowerCase().compareTo("y")==0) {
					break;
				} else {
					System.out.println("Please enter lines: (Enter a blank line to stop)");
				}
			}
		}

		System.out.println();
		System.out.println("Please enter words to ignore: (Enter a blank line to stop)");
		
		while (true) {
			String line = sc.nextLine();
			if (line.trim().compareTo("")!=0) {
				String[] words = line.split("\\s+");
				for (int i=0; i<words.length; i++) {
					storage.addIgnoredWord(words[i]);
				}
			} else {
				System.out.print("Do you want to stop? y/n: ");
				line = sc.nextLine();
				if (line.toLowerCase().compareTo("y")==0) {
					break;
				} else {
					System.out.println("Please enter words to ignore: (Enter a blank line to stop)");
				}
			} 
		}
	}
}
