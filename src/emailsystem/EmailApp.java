package emailsystem;

import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter Firstname : ");
		String fname = sc.nextLine();
		System.out.print(" Enter Lastname : ");
		String lname = sc.nextLine(); 
		Email em = new Email(fname,lname);
		while(true)
		{
			System.out.print("\n---------------\n 1. Add Alternate Email\n 2. Change Password\n 3. Set Mailbox Capacity\n 4. Display Details \n Enter your Choice : ");
			int choice = sc.nextInt();
			if(choice == 1)
			{
				System.out.print(" Enter your Alternate Email : ");
				String mail = sc.next();
				em.AlternateMail(mail);
				System.out.println(" Successfully added Alternate Email : " + em.getAlternateMail());
			}
			else if(choice == 2)
			{
				System.out.print(" Enter your New Password : ");
				String pass = sc.next();
				em.changePassword(pass);
				System.out.println(" Successfully Change Password : " + em.getPassword());
			}
			else if(choice == 3)
			{
				System.out.print(" Enter new Mailbox Capacity : ");
				int cap = sc.nextInt();
				em.SetCapacity(cap);
				System.out.println(" Successfully added new Capacity : " + em.getmailboxCapacity());
			}
			else if(choice == 4)
			{
				em.getInfo();
			}
			else
			{
				System.out.println(" Please Enter your valid Choice");
			}
		}
		
	}

}
