 class Account
{
      private int accno;
	  private double balance;
	  static float int_rate;
	  public Account()
	  {
	     accno=0;
		 balance =0;
	  }
	  static
	  {
		  int_rate=8;
	  } 
	  public Account(int accno,double balance)
	  {
	     this.accno=accno;
		 this.balance=balance;
	  }
	  public static void updateIntRate(float rate)
	  {
		  int_rate=rate;
	  }
	  public void display()
	  {
	      System.out.println("Account No    : "+accno);
		  System.out.println("Balance       : "+balance);
		  System.out.println("Interest Rate : "+int_rate);
	  
	  }
}