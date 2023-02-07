 class Account
{
      private int accno;
	  private double balance;
	  public Account()
	  {
	     accno=0;
		 balance =0;
	  }
	  public Account(int accno,double balance)
	  {
	     this.accno=accno;
		 this.balance=balance;
	  }
	  public void display()
	  {
	      System.out.println("Account No : "+accno);
		  System.out.println("Balance    : "+balance);
	  }
}