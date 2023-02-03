
public class Date {
	
	// instance variables 
	int dd,mm,yy;

	public Date() 
	{
		dd=9;
		mm=8;
		yy=2020;
		System.out.println("default constructor getting called..");
	}
	
		
	//method for display date
	//shows default values here
	public void showDate()
	{
		System.out.println("Your Date:"+dd+'/'+mm+'/'+yy);
	}
	
	//method with arguments
	public void display(int d,int m,int y)
	{
		System.out.println("In display method");
		System.out.println("Your date:"+d+"/"+m+"/"+y);
	}

}
