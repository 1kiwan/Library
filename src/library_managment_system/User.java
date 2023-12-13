package library_managment_system;

import java.util.Scanner;

public class User {
	
	//attributes
	private int id;
	private static int nextId=1;
	private String name;
	private String contactInfo;
	private String type;
	private String password;
	static private int numberOfUsers;
	
	//constructors
	User()
	{
		numberOfUsers++;
		this.id  = nextId++;
	}
	
	User(String name, String type,String contactInfo,String password)
	{
		numberOfUsers++;
		this.id  = nextId++;
		this.contactInfo = contactInfo;
		this.name = name;
		this.type = type;
		this.password = password;
	}
	
	User(String name,String password)
	{
		this.name = name;
		this.password = password;
	}
	
	//getters
	
	//1-id
		public int getId()
		{
			return id;
		}
		
		//2-name
		public String getName()
		{
			return name;
		}
		
		//3-type
		public String getType()
		{
			return type;
		}
		
		//4-user info
				public void getUserInfo() 
			{
				System.out.println("name is " + name);
				
				System.out.println("ID is " + id);
				
				System.out.println("type is " + type);
				
				System.out.println("contact info is " + contactInfo);
			}
				
			//5-number of users
				public int getNumberOfUsers()
			{
				return numberOfUsers;
			}
				
				//6-contact info
				public String getContactInfo()
			{
				return contactInfo;
			}
				
				//7- password
				public String getPassword()
			{
				return password;
			}
	//setters
				
				//1-id
				public void setId(int id)
				{
					this.id = id;
				}
				
				//2-name
				public void setName(String name)
				{
					this.name = name;
				}
				
				//3-type
				public void setType(String type)
				{
					this.type = type;
				}
				
				//4-contact info
				public void setContactInfo(String contactInfo)
				{
					this.contactInfo = contactInfo;
				}
				
				//5-password
				public void setPassword(String password)
				{
					this.password = password;
				}
				
				//methods
				
				

}
