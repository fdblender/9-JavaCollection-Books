import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class BooksArrayList {

	public static ArrayList<String> AddItems() {
		ArrayList<String> books = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		String response = "";
		while (!response.toLowerCase().equals("x")) {
			System.out.println("Enter a book title or 'x' to exit: ");
			response = scan.nextLine();
			if (!response.toLowerCase().equals("x")) {
				books.add(response);
			}
		}
		return(books);
	}
	
	public static void printList(ArrayList<String> books) {
		for (String book: books) {
			System.out.println(book);
		}
	}
	
	public static void main(String[] args) {
		ArrayList<String> books;
		
		books = AddItems();
		
		Collections.sort(books);
		
		printList(books);
	}

}
