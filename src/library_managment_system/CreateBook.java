package library_managment_system;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateBook {
	
	public static ArrayList<Book> bookList = new ArrayList<>();
	
	private static void addBook(int amount, double price , String author , String name ,String description , String type)
	{
		Book newBook = new Book(amount,price,description,name,author,type);
		bookList.add(newBook);
	}
	
	public static void createNewBook()
	{
		int amount;
		double price;
		String author , description , type , name;
		Scanner in = new Scanner(System.in);
		System.out.println("enter the book name: ");
		name = in.nextLine();
		System.out.println("enter the book type: ");
		type = in.nextLine();
		System.out.println("enter the book description: ");
		description = in.nextLine();
		System.out.println("enter the book author: ");
		author = in.nextLine();
		System.out.println("enter the book amount: ");
		amount = in.nextInt();
		in.nextLine();
		System.out.println("enter the book price: ");
		price = in.nextInt();
		in.nextLine();
		
		addBook(amount,price ,author ,name ,description ,type);
	}
	
	private static void removeBook(Book x)
	{
		bookList.remove(x);
	}
	
	public static void deleteBook()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("enter the id of the book you want to delete: ");
		int id = in.nextInt();
		in.nextLine();
		boolean found = false;
		for(Book x: bookList)
		{
			if( id  == x.getId())
			{
				removeBook(x);
				found = true;
				//System.out.println("deleted successfully");
			}
		}
		if(!found) {System.out.println("invlaid");}
		
		
	}
	
	
	public static void getBookById()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("enter the id of the book you want: ");
		int id = in.nextInt();
		in.nextLine();
		boolean found = false;
		for(Book x: bookList)
		{
			if( id  == x.getId())
			{
				x.getBookInfo();
				found = true;
				System.out.println("_______________________");
			}
		}
		if(!found) {System.out.println("invlaid");}
	}
	
	public static void getBookByAuthor()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("enter the author of the book you want: ");
		String author = in.nextLine();
		boolean found = false;
		for(Book x: bookList)
		{
			if( author.equals(x.getAuthor()))
			{
				x.getBookInfo();
				found = true;
				System.out.println("_______________________");
			}
		}
		if(!found) {System.out.println("invlaid");}
	}
	
	public static void getBookByName()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("enter the name of the book you want: ");
		String name = in.nextLine();
		boolean found = false;
		for(Book x: bookList)
		{
			if( name.equals(x.getName()))
			{
				x.getBookInfo();
				found = true;
				System.out.println("_______________________");
			}
		}
		if(!found) {System.out.println("invlaid");}
	}
	
	public static void getBookByType()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("enter the type of the book you want: ");
		String type = in.nextLine();
		boolean found = false;
		for(Book x: bookList)
		{
			if( type.equals(x.getType()))
			{
				x.getBookInfo();
				found = true;
				System.out.println("_______________________");
			}
		}
		if(!found) {System.out.println("invlaid");}
	}
	
	public static void allBooks()
	{
		for(Book x: bookList)
		{
			x.getBookInfo();
			System.out.println("_________________________");
		}
	}
	
	public static void getBookByAmount()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("enter the amount of the book you want: ");
		int amount = in.nextInt();
		in.nextLine();
		boolean found = false;
		for(Book x: bookList)
		{
			if( amount  == x.getAmount())
			{
				x.getBookInfo();
				found = true;
				System.out.println("_______________________");
			}
		}
		if(!found) {System.out.println("invlaid");}
	}

}
