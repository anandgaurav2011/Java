class Box
{
  private int height;
  private int breadth;
  private int depth;

  public Box()
  {
    height=2;
    breadth=4;
    depth=3;
  }
  public Box(int same)
  {
    this.height=this.breadth=this.depth=same;
  }
  public Box(int h,int b,int d)
  {
    this.height=h;
    this.breadth=b;
    this.depth=d;
    
  }

  public void volume()
  {
     System.out.println("Volume = "+height*breadth*depth);
  }
}