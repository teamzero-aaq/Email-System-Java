package emailsystem;

import java.util.Scanner;

public class Email {
	
	private String Firstname;
	private String Lastname;
	private String department;
	private String password;
	private String email;
	private int mailboxcapacity = 500;
	private int defaultPasswordlenght = 10;
	private String alternateMail = "None";
	private String companySuffix = "companyname.com";
	
	//constructor to Receive Firstname and Lastname
	
	public Email(String firstname, String lastname)
	{
		this.Firstname = firstname;
		this.Lastname = lastname;
		//System.out.println(" Email Created : "+this.Firstname +" "+this.Lastname);	
		
		this.department = setDepartment();
		//System.out.println(" Department Selected : "+this.department);
		
		this.password = randomPassword(defaultPasswordlenght);
		//System.out.println(" Password Generated : "+this.password);
		
		email = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@" + department.toLowerCase() + "." + companySuffix;
		
		System.out.println(" Successfully Generated Email : "+email);
	}
	
	//Ask for Department
	
	private String setDepartment()
	{
		System.out.print("\n---------------\n 1. for Sales \n 2. for Development \n 3. Accounting \n 4. None\n Enter the Department : ");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		if(choice == 1)
		{
			return "Sales";
		}
		else if(choice == 2)
		{
			return "Development";
		}
		else if(choice == 3)
		{
			return "Accounting";
		}
		else
		{  
			return "";
		}
	}
	
	//Generate a Random Password
	
	private String randomPassword(int length)
	{
		String passwordSet = "ABDCEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char password[] = new char[length];
		for(int i = 0; i<length;i++)
		{
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	//Set the Mail Box Capacity
	
	public void SetCapacity(int num) 
	{
		this.mailboxcapacity = num;
	}
	
	//Set the Alternate Email
	
	public void AlternateMail(String mail) 
	{
 		this.alternateMail = mail;
	}
	//change the password

	public void changePassword(String pass) 
	{
		this.password = pass;
	}
	
	public int getmailboxCapacity() { return mailboxcapacity; }
	public String getAlternateMail() { return alternateMail; }
	public String getPassword() { return password; }
	
	public void getInfo() 
	{ 
		System.out.println(" Name : "+ Firstname + " " + Lastname);
		System.out.println(" Password : "+ password);
		System.out.println(" Department : "+ department);
		System.out.println(" Email : "+ email);
		System.out.println(" MailBox Capacity : "+ mailboxcapacity + " mb");
		System.out.println(" Alternate Email : "+ alternateMail);
	}
}
