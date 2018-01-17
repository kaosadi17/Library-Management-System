import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Library implements Serializable{
	
	private List<Book> books;
	
	public Library(){
		List<Book> books = new ArrayList<Book>();
	}

	public void addBook(Book book){
		books.add(book);
	}
	
	@Override
	public String toString(){
		String total = "\n";
		for(int i=0; i< books.size(); i++){
			Book b = books.get(i);
			total = total + b.toString();
		}
		return total;
	}
	
}
