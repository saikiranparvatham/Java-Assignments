
public class MMCurrentAccount extends CurrentAccount {
	
	public MMCurrentAccount(int AccountNumber,String accountHolderName,double accountBalance,double creditLimit)
	{	
		super(AccountNumber,accountHolderName,accountBalance,creditLimit);
		
	}

	@Override
	public String toString() {
		return "MMCurrentAccount [toString()=" + super.toString()
				+ ", getAccountBalance()=" + getAccountBalance() + "]";
	}

	@Override
	public boolean withDraw(double money) {
		if(super.getAccountBalance() >= super.creditLimit+super.getAccountBalance())
		{
		super.setAccountBalance(super.getAccountBalance()-money);
		return true;
		}
		else
		{
			return false;
		}		
	}

}
