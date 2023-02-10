package office.staff;

import office.utility.Person;

public class Emp extends Person
{
	private int empid;
	private double salary;
	
	public Emp() {
		super();
	}

	public Emp(String name, int dd, int mm, int yy, int empid, double salary) {
		super(name, dd, mm, yy);
		this.empid = empid;
		this.salary = salary;
	}
	
	public void display()
	{
		super.display();
		System.out.println("Empid : "+empid);
		System.out.println("Salary : "+salary);
	}
	
	
	
	
}
