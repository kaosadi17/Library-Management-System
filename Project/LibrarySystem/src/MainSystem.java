import java.util.Scanner;

public class MainSystem {

	static String fileName = null;
	static Library lib = new Library();
	static Scanner in = new Scanner(System.in);
	static Boolean running = true;

	public static void main(String args[]) {
		while (running) {
			System.out.println("\nEnter 0: Load library" + "\nEnter 1: Save and Quit"
					+ "\nEnter 2: List all books in Library" + "\nEnter 3: Add book to Library");
			int answer = in.nextInt();
			switch(answer){
			case 0:
				break;
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
				
			}
			
		}

	}

}
