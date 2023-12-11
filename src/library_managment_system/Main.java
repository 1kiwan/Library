package library_managment_system;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		/*Book b1 = new Book();
		
		System.out.println("enter the title of the book ==> ");
		b1.setName(in.nextLine());
		
		System.out.println("enter the price of the book ==> ");
		b1.setPrice(in.nextInt());
		in.nextLine();
		
		System.out.println("enter the amount of the book ==> ");
		b1.setAmount(in.nextInt());
		in.nextLine();
		
		System.out.println("enter the description of the book ==> ");
		b1.setDescription(in.nextLine());
		
		System.out.println("enter the type of the book ==> ");
		b1.setType(in.nextLine());
		
		System.out.println("enter the author of the book ==> ");
		b1.setAuthor(in.nextLine());
				
		b1.getBookInfo();
		
		User u1 = new User();
		
		System.out.println("enter the name of the user ==> ");
		u1.setName(in.nextLine());
		
		System.out.println("enter the contact info of the user ==> ");
		u1.setContactInfo(in.nextLine());
		
		System.out.println("enter the type of the user ( student / librarian ) ==> ");
		u1.setType(in.nextLine());
		
		u1.getUserInfo();	*/
		
		Transaction t1 = new Transaction(1,1);
		System.out.println(t1.getCheckOutDate());
		System.out.println(t1.getReturnDate());


	}

}
