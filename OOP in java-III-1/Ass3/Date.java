
public class Date{
	
	// instance variables 
		int dd,mm,yy;
		static int cnt;
		
		//default constructors
	public Date() 
	{
		dd=6;
		mm=10;
		yy=2020;
		cnt++;
	}

	//parameterized constructor
	public Date(int dd, int mm, int yy) 
	{
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
		cnt++;
	
	}
	
	

	//method for display date
		public void showDate()
		{
			System.out.println("Your Date:"+dd+'/'+mm+'/'+yy);
		}
public static void countObject()
		{
			System.out.println("Number Of Object : "+cnt);
		}
}
