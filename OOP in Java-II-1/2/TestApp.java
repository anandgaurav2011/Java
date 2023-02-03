
public class TestApp {

	public static void main(String[] args)
	{
		
		DateConstructor defaultC=new DateConstructor();
		defaultC.showDate();
		System.out.println("-------------------");
		
		DateConstructor paraC=new DateConstructor(3, 10 ,2020);
		paraC.showDate();
		System.out.println("-------------------");
		
		DateConstructor copy=new DateConstructor(defaultC);
		copy.showDate();
	
	}



}
