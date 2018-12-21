
public abstract class CurrentAccount extends BankAccount {

	private double creditLimit;
	public CurrentAccount(int accountNumber, String accountHolderName, double accountBalance,double creditLimit) {
		super(accountNumber, accountHolderName, accountBalance);
		
		this.creditLimit = creditLimit;
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public String toString() {
		return "CurrentAccount [creditLimit=" + creditLimit + ", toString()="
				+ super.toString() + "]";
	}


	@Override
	public abstract boolean withDraw(double money);
}
