class Point
{
  private int x;
  private int y;
 
  public Point()
  {
    x=2;
    y=4;
  }

  public Point(int x,int y)
  {
    this.x=x;
    this.y=y;
  }


  public void display() 
  {
    System.out.println("["+x+","+y+"]");
  }

  public void display(char ch,char ch1,char ch2) 
  {
    System.out.println( " "+ch+x+""+ch1+y+""+ch2);  
  }
}