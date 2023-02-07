public class DemoArray
{
     public static void main(String args[])
	 {
	      int [][]a={{1,2,3},{4,5,6},{7,8,9}};
		  MyArray obj=new MyArray();
		  obj.display(a);
		  obj.rowSum(a);
		  obj.columnSum(a);
	}
}