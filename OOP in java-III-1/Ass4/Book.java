

public class Book
{
	private int bookid ;
    private float price ;
    
    //declare as static
	private static int count;
	static
	{
		count=0;
	}
	
	//default constructor
	public Book()		
	{
		//increment count
		count++;	
		bookid=count;
		price=0;
	
	}

	//parameterized constructor
	public Book(float price)
	{	
		count++;
		bookid = count;
		this.price=price;
	}

	public void display()
	{
		System.out.println("BookId : "+bookid);
		System.out.println("Cost of the Book  : "+price);
		
	}
	
}	