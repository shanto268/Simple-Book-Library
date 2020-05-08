
public class UseBook {
	
	public static void info(Book b) {
		System.out.println(b.getTitle() + " price is $ " + b.getPrice());
	}
	
	public static void main(String[] args) {
		Fiction b1 = new Fiction("Harry Potter");
		NonFiction b2 = new NonFiction("Nudge");
		BookArray b3 = new BookArray();
		
		info(b1);
		info(b2);
		b3.fillArray();
		
	}
	
}
