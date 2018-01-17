import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
				saveAndQuit();
				break;
			case 2:
				System.out.println(lib.toString());
				break;
			case 3:
				addBook();
				break;

			}

		}
		System.exit(0);

	}

	private static void addBook() {
		// TODO Auto-generated method stub
		int isbn;
		String title,author;
		double price;
		
		System.out.println("\nEnter isbn: ");
		isbn = in.nextInt();
		
		System.out.println("\nEnter title: ");
		title = in.next();
		
		System.out.println("\nEnter author: ");
		author = in.next();
		
		System.out.println("\nEnter price: ");
		price = in.nextDouble();
		
		Book b = new Book(isbn,title,author,price);
		lib.addBook(b);
		
		
	}

	private static void saveAndQuit() {
		// TODO Auto-generated method stub
		System.out.println("Enter the file name :");
		fileName = in.next();
		running = false;
		FileOutputStream fos = null;
		ObjectOutputStream out = null;
		try {
			fos = new FileOutputStream(fileName);
			out = new ObjectOutputStream(fos);
			out.writeObject(lib);
			fos.close();
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
