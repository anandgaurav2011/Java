public class Customer
{
  private String email;
  private Address address;
  
  public Customer()
  {
 
  }
  
  public Customer(String email,String area,String city,String pincode)
  {
    this.email=email;
    this.address=new Address(area,city,pincode);
  }
 
  public void display()
  {
    System.out.println("The email id = "+this.email);
    System.out.print("The Address = ");
    address.showAdd();  
  } 
}
