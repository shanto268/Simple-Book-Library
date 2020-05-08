
public class Fiction extends Book {
	
	public Fiction(String title) {
		super(title);
		setPrice(24.99);
	}

	
	public void setPrice(double price) {
		this.price = price;
	}
}
