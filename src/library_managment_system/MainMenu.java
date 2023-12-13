package library_managment_system;

import java.util.Scanner;

public class MainMenu {
	public static Scanner in = new Scanner(System.in);
	private static String userName,password;
	
	public static void mainMenu()
	{
		System.out.println("[1] sign up.");
		System.out.println("[2] login.");
		System.out.println("[3] exit.");
		System.out.print("_______________\n");
	}
	
	public static void login()
	{
		
		boolean found = false;
		System.out.println("enter your username: ");
		userName = in.nextLine();
		for(User x: CreateUserAccount.userAccounts)
		{
			if(userName.equals(x.getName()) )
			{
				System.out.println("enter you password: ");
				password = in.nextLine();
				if(password.equals(x.getPassword()))
				{
					afterLoginMenu();
				}
				else {System.out.println("incorrect password");}
				found = true;
				break;
			}
		}
		if(!found) {System.out.println("your account was not found");}
		
		
	}
//----------------------------------------------------------------------------------------------------------//	
	public static void afterLoginMenu()
	{
		int choice,bookChoice,searchChoice;
		boolean exitInnerLoob=false,exitSearchLoob = false;
	
		while(true)
		{
			System.out.print("________________________________\n");
		System.out.println("Library managment system app: ");
        System.out.println("[1] book related");
        System.out.println("[2] Borrow Books");
        System.out.println("[3] Return Books");
        System.out.println("[4] User Profile");
        System.out.println("[5] Change Password");
        System.out.println("[6] Logout");
        System.out.println("[7] Exit Application");
        System.out.println("[8] income");
        System.out.println("[9] sell a book");
		System.out.print("_______________\n");
        choice = in.nextInt();
        in.nextLine();
		switch(choice)
		{
		case 1:
			while(true)
			{
			 System.out.println("[1] Add new book");
		     System.out.println("[2] Delete a book");
		     System.out.println("[3] Search for a Book");
		     System.out.println("[4] All Books");
		     System.out.println("[5] the previous list");
				System.out.print("_______________\n");
		     bookChoice=in.nextInt();
		     in.nextLine();
		     switch(bookChoice)
		     {
		     case 1:
		    	 CreateBook.createNewBook();
		    	 exitInnerLoob = false;
					break;
			 case 2:
				 CreateBook.deleteBook();
					break;
			 case 3:
				 while(true)
				 {
					 System.out.println("Search by what ??");
					 System.out.println("[1] name");
				     System.out.println("[2] ID");
				     System.out.println("[3] amount");
				     System.out.println("[4] author");
				     System.out.println("[5] type");
				     System.out.println("[6] To the previous list");
						System.out.print("_______________\n");
				     searchChoice = in.nextInt();
				     in.nextLine();
				     switch(searchChoice)
				     {
				     case 1:
				    	 CreateBook.getBookByName();
				    	 exitSearchLoob = false;
				    	 break;
				     case 2:
				    	 CreateBook.getBookById();
				    	 exitSearchLoob = false;
				    	 break;
				     case 3:
				    	 CreateBook.getBookByAmount();
				    	 exitSearchLoob = false;
				    	 break;
				     case 4:
				    	 CreateBook.getBookByAuthor();
				    	 exitSearchLoob = false;
				    	 break;
				     case 5:
				    	 CreateBook.getBookByType();
				    	 exitSearchLoob = false;
				    	 break;
				     case 6:
				    	 exitSearchLoob = true;
				    	 break;
				    	 default:
				    	 System.out.print("invalid choice try again\n_______________\n");
				    	 
				    	 
				     }
				     if (exitSearchLoob) {
				            break;
					}
				 }
					break;
			 case 4:
				 CreateBook.allBooks();
				 exitInnerLoob = false;
					break;
			 case 5:
				 exitInnerLoob = true;
					break;
			 default:
					System.out.print("invalid choice try again\n_______________\n");	
		     }
		     if (exitInnerLoob) {
		            break;
			}
			}
			break;
		case 2:
			CreateTransactions.borrowBook();
			break;
		case 3:
			CreateTransactions.returnBook();
			break;
		case 4:
			for(User x: CreateUserAccount.userAccounts)
			{
				if(userName.equals(x.getName()))
				{
					x.getUserInfo();
				}
			}
			break;
		case 5:
			CreateUserAccount.changePassword(password);
			break;
		case 6:
			System.out.println("logging out the account. ");
			return;
		case 7:
			System.out.println("Exiting the program. Goodbye!");
            System.exit(0);
			break;
		case 8:
			CreateTransactions.getIncome();
			break;
		case 9:
			CreateTransactions.sellBook();
			break;
			default:
				System.out.println("invalid choice try again");
		}
		        
      }
	}

}
