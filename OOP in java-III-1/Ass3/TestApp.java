
public class TestApp {

	public static void main(String[] args)
	{
		System.out.println("-------------------");
		
		Date defaultC=new Date();
		defaultC.showDate();
		Date.countObject();
		System.out.println("-------------------");
		
		Date paraC=new Date(3, 10 ,2020);
		paraC.showDate();
		Date.countObject();
		
	
	}



}
