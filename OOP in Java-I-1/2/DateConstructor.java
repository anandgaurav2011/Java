
public class DateConstructor {
	
	// instance variables 
		int dd,mm,yy;
		
		//default constructors
	public DateConstructor() 
	{
		System.out.println("default constructor get called");
		dd=6;
		mm=10;
		yy=2020;
	}

	//parameterized constructor
	public DateConstructor(int dd, int mm, int yy) 
	{
		System.out.println("Parameterized Constructor called");
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	
	public DateConstructor(DateConstructor d)
	{
		System.out.println("Copy construtor get called");
		this.dd=d.dd;
		this.mm=d.mm;
		this.yy=d.yy;
	}

	//method for display date
		public void showDate()
		{
			System.out.println("Your Date:"+dd+'/'+mm+'/'+yy);
		}

}
