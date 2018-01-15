import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class MainSystem {

	static String fileName = null;
	static Library lib = new Library();
	static Scanner in = new Scanner(System.in);
	static Boolean running = true;

	public static void main(String args[]) throws IOException, ClassNotFoundException {
		while (running) {
			System.out.println("\nEnter 0: Load library" + "\nEnter 1: Save and Quit"
					+ "\nEnter 2: List all books in Library" + "\nEnter 3: Add book to Library");
			int answer = in.nextInt();
			switch (answer) {
			case 0:
				System.out.println("Enter file name to load");
				loadLibrary(in.next());
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

	private static void loadLibrary(String name) {
		FileInputStream fis = null;
		ObjectInputStream ino = null;
		File file = new File(name+".ser");
		if (file.exists()) {
			try {
				fis = new FileInputStream(file);
				ino = new ObjectInputStream(fis);
				try {
					lib = (Library)ino.readObject();
				} catch (ClassNotFoundException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				fis.close();
				in.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} else{
			System.out.println("\nThe file doesn't exist");
		}
		
	}

}
