public class Line
{ 
  private Point start_point,end_point;
  
  public Line()
  {
  }
  
  public Line(int x1, int y1,int x2,int y2)
  {
    this.start_point=new Point(x1,y1);
    this.end_point=new Point(x2,y2);
  }
  
  public void display()
  {
    if(this.start_point!=null)
    {
      System.out.print("The Start point Co-ordinates = ");
      start_point.display();
      System.out.println();
      System.out.print("The End point Co-ordinates = ");
      end_point.display();
    }
  }
}