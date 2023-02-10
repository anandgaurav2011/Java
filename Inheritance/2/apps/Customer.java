package apps;

public class Customer {
	String email, name;
	
	
	
	public Customer(String email, String name) {
		super();
		this.email = email;
		this.name = name;
	}



	public float giveDiscount(float sprice)
	{
		System.out.println("No DISCUONT");
		return sprice;
	}
}
