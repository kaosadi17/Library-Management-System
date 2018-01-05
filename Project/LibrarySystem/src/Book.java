import java.io.Serializable;

public class Book implements Serializable{
	
	private int isbn;
	private String title,author;
	private double price;
	
	public Book(int isbn, String title, String author, double price){
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	@Override
	public String toString(){
		return "\nisbn : " + isbn + "\ntitle : " + title +
				"\nauthor : " + author + "\nprice : " + price + "\n";
	}
}
