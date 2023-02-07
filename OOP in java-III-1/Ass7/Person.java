public class Person
{
  private String name;
  private Date bdate;

  public Person()
  {
    
  }
  
  public Person(String name,int dd,int mm,int yy)
  {
    this.name=name;
    this.bdate=new Date(dd,mm,yy);
  }
  
  public void display()
  {
    System.out.println("The name = "+this.name);
    if(bdate!=null)
    {
      System.out.print("The DOB = ");
      bdate.showDate();
      bdate.showDate('-');
    }
  }  
}