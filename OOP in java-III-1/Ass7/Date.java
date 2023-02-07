public class Date
{
  private int dd;
  private int mm;
  private int yy;
 
  public Date()
  {
     int dd=25;
     int mm=5;
     int yy=2021;
  }

  public Date(int dd,int mm,int yy)
  {
     this.dd=dd;
     this.mm=mm;
     this.yy=yy;
  }

  public void showDate()
  {
     System.out.println(dd+"/"+mm+"/"+yy);
  }
  
  public void showDate(char ch)
  {
     System.out.println(dd+""+ch+mm+""+ch+yy);
  }
}