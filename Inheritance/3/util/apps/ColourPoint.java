package util.apps;

public class ColourPoint extends Point
{
	private String color;
	static String [] colors;
	
	static
	{
		colors = new String [5];
		colors[0]="red";
		colors[1]="blue";
		colors[2]="orange";
		colors[3]="yellow";
		colors[4]="black";
	}

	public ColourPoint() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ColourPoint(int x, int y, String color ) {
		super(x, y);
		this.color = color;
		boolean flag = false;
		for(int i=0;i<colors.length;i++)
		{
			if(colors[i].equals(color))
			{
				this.color = color;
				flag = true;
				break;
			}
		}
		if(flag==false)
			this.color = "white";				
	}

	@Override
	public void Display() {
		// TODO Auto-generated method stub
		super.Display();
		System.out.println(color);
	}
	
	
}
