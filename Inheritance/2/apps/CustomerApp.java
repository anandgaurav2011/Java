package apps;

import java.util.Scanner;


public class CustomerApp {

	public static void main(String[] args) {
		
		Scanner sc=  new Scanner(System.in);
		System.out.println("Enter type of customer(c/r)?");
		char custtype = sc.next().charAt(0);
		System.out.println("Enter email : ");
		String email = sc.next();
		System.out.println("Enter name : ");
		String name = sc.next();
		Customer c=null;
		if(custtype == 'c')
		{
			c = new Customer(email,name);
		}
		else if(custtype == 'r')
		{
			System.out.println("Enter reg_no : ");
			int no = sc.nextInt();
			c = new  RegCustomer(email,name,no);
		}
		
		System.out.println("Enter shopping price");
		float p = sc.nextFloat();
		System.out.println("Final price : "+c.giveDiscount(p));
	}

}
