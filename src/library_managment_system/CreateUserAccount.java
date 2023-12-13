package library_managment_system;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateUserAccount {
	
	public static ArrayList<User> userAccounts = new ArrayList<>();
	
	private static void addUser(String name, String type, String contactInfo, String password)
	{
		User newUser = new User( name,  type, contactInfo,password);
		userAccounts.add(newUser);
	}
	
	public static void createUserAccount()
	{
		String name,type,contactInfo,password;
		Scanner in = new Scanner(System.in);
		System.out.println("enter the name of the user ==> ");
		name = in.nextLine();
		
		System.out.println("enter the password of the user ==> ");
		password = in.nextLine();
		
		System.out.println("enter the contact info of the user ==> ");
		contactInfo = in.nextLine();
		
		System.out.println("enter the type of the user ( Student / Admin ) ==> ");
		type = in.nextLine();
		
		
		System.out.println("now you can login.");
		
		addUser( name,  type,  contactInfo,password);
		
	}
	
	private static void removeUser(User x)
	{
		userAccounts.remove(x);
	}
	
	public static void deleteUserAccount()
	{
		Scanner in = new Scanner(System.in);
		int indexOfDelete;
		System.out.println("what is the id of the user you want to delete: ");
		int x = in.nextInt();
		in.nextLine();
		for(User i: userAccounts)
		{
			if(x==i.getId())
			{
				removeUser(i);
			}	
		}
	}
	
	
	public static void getUserById()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("enter the id of the user you want: ");
		int id = in.nextInt();
		in.nextLine();
		boolean found = false;
		for(User x: userAccounts)
		{
			if(id == x.getId())
			{
				x.getUserInfo();
				found = true;
				break;
			}	
		}
		if(!found) {System.out.println("invlaid");}
	}
	
	public static void getUserByName()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("enter the name of the user you want: ");
		String name = in.nextLine();
		in.nextLine();
		boolean found = false;
		for(User x: userAccounts)
		{
			if(name.equals(x.getName()))
			{
				x.getUserInfo();
				found = true;
				System.out.println("_______________________");
			}	
		}
		if(!found) {System.out.println("invlaid");}
	}
	
	public static void getUserByContactInfo()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("enter the contact info of the user you want: ");
		String contactInfo = in.nextLine();
		in.nextLine();
		boolean found = false;
		for(User x: userAccounts)
		{
			if(contactInfo.equals(x.getContactInfo()))
			{
				x.getUserInfo();
				found = true;
				System.out.println("_______________________");
			}	
		}
		if(!found) {System.out.println("invlaid");}
	}
	
	public static void getUserByType()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("enter the type of the user you want(student/admin): ");
		String type = in.nextLine();
		in.nextLine();
		boolean found = false;
		for(User x: userAccounts)
		{
			if(type.equals(x.getType()))
			{
				x.getUserInfo();
				found = true;
				System.out.println("_______________________");
			}	
		}
		if(!found) {System.out.println("invlaid");}
	}
	
	public static void allUsers()
	{
		for(User x: userAccounts)
		{
			x.getUserInfo();;
			System.out.println("_________________________");
		}
	}
	
	public static void changePassword(String password)
	{
		Scanner in = new Scanner(System.in);
		String currentPassword, newPassword;
		System.out.println("enter the crrent password: ");
		currentPassword = in.nextLine();
		
		if(currentPassword.equals(password))
		{
			for(User x: userAccounts)
			{
				if(password.equals(x.getPassword()))
				{
					System.out.println("enter the new password: ");
					newPassword = in.nextLine();
					x.setPassword(newPassword);
					System.out.println("the password got updated successfully");
				}
			}
		}else {System.out.println("wrong password ");}
	}

}
