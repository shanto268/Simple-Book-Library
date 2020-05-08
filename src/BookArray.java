import java.util.Scanner;  // Import the Scanner class

public class BookArray {
	public Book[] books = new Book[10];
	public int index = 0;
	
	public BookArray() {
		
	}
	
	public void fillBook() {
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.print("Enter book title: ");
	    String title = myObj.nextLine();  // Read user input
	    System.out.print("Enter book type (\"f\" or \"nf\"): ");
	    String type = myObj.nextLine();
	    if (type=="f") {
	    	Fiction f = new Fiction(title);
	    	books[index] = f;
	    }
	    else {
	    	NonFiction f = new NonFiction(title);
	    	books[index] = f;
	    }
		index++;
		myObj.close();
	}
	
	public void fillArray() {
		while(index!=10) {
			fillBook();
		}
		Print();
	}
	
	public void Print() {
		for (int i = 0; i<10; i++) {
			System.out.println("Title: " + books[i].getTitle());
			System.out.println("Price: $ " + books[i].getPrice());
			System.out.println("Book ID: " + i);
			System.out.println();
		}
	}
}
