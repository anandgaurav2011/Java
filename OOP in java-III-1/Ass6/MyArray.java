class MyArray
{
     void display(int a[][])
	 {
	       int i,j;
		   int sum;
		   for(i=0;i<a.length;i++)
		   {
		        sum=0;
				System.out.println(" ");
				for(j=0;j<a[i].length;j++)
				    {
					  System.out.print("   "+a[i][j]);
					 }
			}
	 }
	 void rowSum(int a[][])
	 {
	       int i,j;
		   int sum;
		   System.out.println("*********** Row wise Sum ************** ");
		   for(i=0;i<a.length;i++)
		   {
		        sum=0;
				System.out.println(" ");
				for(j=0;j<a[i].length;j++)
				    {
					 sum=sum+a[i][j];
					 }
					System.out.println("  "+sum);
			}
	 }
	 void columnSum(int a[][])
	 {
	       int i,j;
		   int sum;
		   System.out.println("*********** Column wise Sum ************** ");
		   for(i=0;i<a.length;i++)
		   {
		        sum=0;
				System.out.println(" ");
				for(j=0;j<a[i].length;j++)
				    {
					  sum=sum+a[j][i];
					 }
				System.out.println("   "+sum);
			}
	 }
}