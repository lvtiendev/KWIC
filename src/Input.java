import java.util.*;

public class Input {
	private Storage storage;
	
	public Input(Storage storage) {
		this.storage = storage;
	}
	
	public void getInput() {
		System.out.println("Please enter lines:");
		Scanner sc = new Scanner(System.in);

		while (true) {
			String line = sc.nextLine();
			if (line.compareTo("")!= 0) {
				storage.addLine(line);
			} else {
				System.out.println("Do you want to stop? y/n: ");
				line = sc.nextLine();
				if (line.toLowerCase().compareTo("y")==0) {
					break;
				} if (line.toLowerCase().compareTo("n")==0) {
					System.out.println("Please enter lines:");
				} else {
					System.out.println("Please enter lines:");
				}
			}
		}
	}
}
