package library_managment_system;

public class Book {
	
	//attributes
	private int id;
	private static int nextId=1;
	private int amount;
	private double price;
	private String author;
	private String name;
	private String description;
	private String type;
	static private int numberOfBooks;
	
	//constructors
	Book()
	{
	numberOfBooks ++;
	this.id = nextId++;
	}
	
	
	Book(int amount,double price ,String description, String name,String author,String type)
	{
	numberOfBooks ++;
	this.amount = amount;
	this.name = name;
	this.author = author;
	this.price = price;
	this.description = description;
	this.type = type;
	this.id = nextId++;
	}
	
	//getters 
	
	//1-id
	public int getId()
	{
		return id;
	}
	
	//2-amount
	public int getAmount()
	{
		return amount;
	}
	
	//3-price
	public double getPrice()
	{
		return price;
	}
		
	//4-author
	public String getAuthor()
	{
		return author;
	}
		
	//5-name
	public String getName()
	{
		return name;
	}
		
	//6-description
	public String getDescription()
	{
		return description;
	}
	
	//7-type
	public String getType()
	{
		return type;
	}
	
	//8-book info
		public void getBookInfo() 
	{
		System.out.println("name is " + name);
		
		System.out.println("ID is " + id);
		
		System.out.println("author is " + author);
		
		System.out.println("description is " + description);
		
		System.out.println("amount is " + amount);
		
		System.out.println("type is " + type);
		
		System.out.println("price is " + price);
		
	}
		
	//9-number of books
		public int getNumberOfBooks()
	{
		return numberOfBooks;
	}

	
	
	//setters 
	
		//1-id
		public void setId(int id)
		{
			this.id = id;
		}
		
		//2-amount
		public void setAmount(int amount)
		{
			this.amount = amount;
		}
		
		//3-price
		public void setPrice(double price)
		{
			this.price = price;
		}
			
		//4-author
		public void setAuthor(String author)
		{
			this.author = author;
		}
			
		//5-name
		public void setName(String name)
		{
			this.name = name;
		}
			
		//6-description
		public void setDescription(String description)
		{
			this.description = description;
		}
		
		//7-type
		public void setType(String type)
		{
			this.type = type;
		}
		
		
	
	
	

}
