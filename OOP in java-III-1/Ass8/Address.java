public class Address
{
  private String area;
  private String city;
  private String pincode;
  
  public Address()
  {
    
  }
  
  public Address(String area,String city,String pincode)
  {
    this.area=area;
    this.city=city;
    this.pincode=pincode;    
  }

  public void showAdd()
  {
    System.out.println(area+","+city+"-"+pincode);
  }
}