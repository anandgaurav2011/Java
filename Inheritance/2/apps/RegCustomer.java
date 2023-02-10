package apps;

public class RegCustomer extends Customer 
{
	int reg_no;
	
	
	
	public RegCustomer(String email, String name, int reg_no) {
		super(email, name);
		this.reg_no = reg_no;
	}



	public float giveDiscount(float sprice)
	{
		System.out.println("5% DISCUONT");
		return sprice- sprice*5/100 ;
	}
}
