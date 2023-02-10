package util.apps;

public class Point
{
	 int xcor;
	 int ycor;
	public Point()
	{
	}
	public Point(int x,int y)
	{
		this.xcor=x;
		this.ycor=y;
	}
	public void Display()
	{
		System.out.println("[ "+xcor+" , "+ycor+" ]");
	}
}