package apps;

import office.staff.Emp;
import office.utility.Person;

public class EmpDemo {

	public static void main(String[] args) 
	{
		Person p = new Person("Rahul",11,12,1999);
		p.display();

		Emp e = new Emp("Amit",23,5,1998,1001,10000.00);
		e.display();
	}

}
