


public abstract class BankAccount {
	
	private int accountNumber;
	private String accountHolderName;
	private double accountBalance;
	private int number=10000;
	public BankAccount(int accountNumber, String accountHolderName, double accountBalance)
	{
		this.accountNumber = number++;
		this.accountHolderName = accountHolderName;
		
		this.setAccountBalance(accountBalance);
	}
	
	public boolean withDraw(double money)
	{
		if(getAccountBalance() < money )
		{
		 return false;
		}
		else
		{
			setAccountBalance(getAccountBalance()-money);
			return true;
		}
	}
	
	public boolean deposite(double money)
	{
		if(money>0)
		{
		setAccountBalance(getAccountBalance()+money);
		return true;
		}
		else
			return false;
	}
	
	
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber
				+ ", accountHoldrName=" + accountHolderName
				+ ", accountBalance=" + getAccountBalance() + "]";
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	} 
	
}
