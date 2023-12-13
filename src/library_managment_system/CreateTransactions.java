package library_managment_system;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateTransactions {
	
	private static ArrayList<Transaction> transactionListBorrow = new ArrayList<>();
	private static ArrayList<Transaction> transactionListSell = new ArrayList<>();
	public static double income;
	
	public static void addTransactionBorrow(int bookId , int userId)
	{
		Transaction newTransaction = new Transaction(bookId,userId);
		transactionListBorrow.add(newTransaction);
	}
	
	public static void addTransactionSell(int bookId , int userId)
	{
		Transaction newTransaction = new Transaction(bookId,userId);
		transactionListSell.add(newTransaction);
	}
	
	public static void borrowBook()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("enter the id of the user: ");
		int userId = in.nextInt();
		in.nextLine();
		System.out.println("enter the id of the book: ");
		int bookId = in.nextInt();
		in.nextLine();
		boolean found=false;
		for(Book x: CreateBook.bookList)
		{
			if( bookId  == x.getId())
			{
				income += 20;
				addTransactionBorrow(bookId,userId);
				found = true;
				x.setAmount(x.getAmount()-1);
				for(Transaction i: transactionListBorrow)
				{
					if(bookId == i.getBookId())
					{
						i.getTransactionInfo();
					}
				}
				
			}
		}
		if(!found) {System.out.println("invlaid");}
	}
	
	public static void sellBook()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("enter the id of the user: ");
		int userId = in.nextInt();
		in.nextLine();
		System.out.println("enter the id of the book: ");
		int bookId = in.nextInt();
		in.nextLine();	
		boolean found=false;
		for(Book x: CreateBook.bookList)
		{
			if( bookId  == x.getId())
			{
				income += x.getPrice();
				addTransactionSell(bookId,userId);
				found = true;
				x.setAmount(x.getAmount()-1);
			}
		}
		if(!found) {System.out.println("invlaid");}
	}
	
	public static void returnBook()
	{
		Scanner in = new Scanner(System.in);
	    System.out.println("Enter the ID of the user: ");
	    int userId = in.nextInt();
	    in.nextLine();
	    System.out.println("Enter the ID of the book to return: ");
	    int bookId = in.nextInt();
	    in.nextLine();

	    boolean found = false;

	    for (Transaction transaction : transactionListBorrow) {
	        if (userId == transaction.getUserId() && bookId == transaction.getBookId()) 
	        {
	            found = true;       
	            transactionListBorrow.remove(transaction);
	            for (Book x : CreateBook.bookList) {
	                if (bookId == x.getId()) {
	                    x.setAmount(x.getAmount() + 1);
	                    System.out.println("Book returned successfully.");
	                    break;
	                }
	            }
	            break;
	        }
	    }

	    if (!found) {
	        System.out.println("Invalid user ID or book ID for return.");
	    }
	}
	
	public static void allTransactionBorrow()
	{
		for(Transaction x: transactionListBorrow)
		{
			x.getTransactionInfo();
			System.out.println("________________________");
		}
	}
	
	public static void allTransactionSell()
	{
		for(Transaction x: transactionListSell)
		{
			x.getTransactionInfo();
			System.out.println("________________________");
		}
	}
	
	public static void getIncome()
	{
		System.out.println("your income is: " + income);
	}
}
