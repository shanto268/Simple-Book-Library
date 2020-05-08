
public abstract class Book {
	public String title;
	public double price;
	
	public Book(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public abstract void setPrice(double price);
	
}
