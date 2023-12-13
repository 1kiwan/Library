package library_managment_system;

import java.util.Scanner;

public class library_managment_system_app {
	
	public static void main(String[] args) {
		
		User u1 = new User("admin","admin");
		CreateUserAccount.userAccounts.add(u1);
		Book b1 = new Book(5,150,"a very good book.","the first book.","Eng:ahmed kiwan.","scietific.");
		CreateBook.bookList.add(b1);
		Scanner in = new Scanner(System.in);
		int choice;
		
		while(true)
		{
			MainMenu.mainMenu();
			choice = in.nextInt();
			in.nextLine();
			switch(choice)
			{
			case 1:
				CreateUserAccount.createUserAccount();
				break;
			case 2:
				MainMenu.login();
				break;
			case 3:
				System.out.println("Exiting the program. Goodbye!");
                //System.exit(0);
			default:
					System.out.println("invalid choice try again");
			}
		}
		
		
		
	}

}
