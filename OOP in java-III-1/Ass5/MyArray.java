
public class MyArray
{
    public static  int findMax(int a[])
	{
	    int max=a[0];
		for(int i=1;i<a.length;i++)
		{
		    if(max>a[i])
			    max=a[i];
		}
		return max;
	}
	 public static  int findMin(int a[])
	{
	    int min=a[0];
		for(int i=1;i<a.length;i++)
		{
		    if(min<a[i])
			    min=a[i];
		}
		return min;
	}
	public static void display(int a[])
	{
	   for(int i=0;i<a.length;i++)
	       System.out.println("   "+a[i]);
	}
    public static void main(String []args)
	{
	      int []a={32,43,65,23,-4};
		  int res;
		  display(a);
		  res=findMax(a);
		  System.out.println("Max : "+res);
		  res=findMin(a);
		  System.out.println("Max : "+res);
    }
}