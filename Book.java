package arrayprograms;

public class Book {
	private int id;
	private String name;
	private String publication;
	private int price;
	private int quantity;
	private String description;
	
	public Book(int id, String name, String publication, int price, int quantity, String description) {
		super();
		this.id = id;
		this.name = name;
		this.publication = publication;
		this.price = price;
		this.quantity = quantity;
		this.description = description;
	}
	Book()
	{
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", publication=" + publication + ", price="
				+ price + ", quantity=" + quantity + ", description=" + description + "]";
	}
	

}
