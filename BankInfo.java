package week1.day4;

public class BankInfo extends AxisBank{

	//private static final BankInfo A = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankInfo B=new BankInfo();
	   B.saving();
	   B.fixed();
      B. deposit();
		
	}
public static void saving()
{
	int saving=400000;
	System.out.println("Saving amount is "+saving);
}
public static void fixed()
{
	int fixed=600000;
	System.out.println("Fixed money is "+fixed);
}
public void deposit()
{
	int deposit=100000;
	System.out.println("Deposit amount is "+deposit);
}
}
