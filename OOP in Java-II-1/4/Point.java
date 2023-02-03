
public class Point 
{
	//instance data members 
	private int x,y;

public Point() {
	//default constructor
	x=0;
	y=0;
}


//parameterized constructor
public Point(int x, int y) {
	super();
	this.x = x;
	this.y = y;
}

//instance member method 
public void showPoint(char ch,char ch1)
{
	System.out.println(ch+""+x+','+y+""+ch1);
}
}
