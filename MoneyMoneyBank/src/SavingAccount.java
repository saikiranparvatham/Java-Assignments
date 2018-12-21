
public abstract class SavingAccount extends BankAccount {
	
	private boolean isSalaried;
	private float MINIMUM_BALANCE;
	
	public SavingAccount(int AccountNumber,String accountHolderName,double accountBalance,boolean isSalaried)
	{
		super(AccountNumber,accountHolderName,accountBalance);
		this.isSalaried = isSalaried;
	}
	
	public abstract void withDraw(float money);

	@Override
	public String toString() {
		return "SavingAccount [isSalaried=" + isSalaried + ", MINIMUM_BALANCE="
				+ MINIMUM_BALANCE + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	public double getSalary()
	{
		
		return super.getAccountBalance();
		
	}
}
