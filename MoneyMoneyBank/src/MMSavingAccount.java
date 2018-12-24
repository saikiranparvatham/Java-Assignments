
public class MMSavingAccount extends SavingAccount{

		private static final double minimumBalance = 2000;
		
		public MMSavingAccount(int AccountNumber,String accountHolderName,double accountBalance,boolean isSalaried)
		{	
			super(AccountNumber,accountHolderName,accountBalance,isSalaried);
			
		}

		@Override
		public String toString() {
			return "MMSavingAccount [toString()=" + super.toString()
					+ ", getClass()=" + getClass() + "]";
		}



		@Override
		public boolean withDraw(double money) {
			if(super.getBalance()- money > minimumBalance)
			{
				super.setAccountBalance(super.getBalance()-money) ;
				return true ; 
			}
			else
			{
				return false;
			}
				
		}

		
		@Override
		public boolean deposite(double money) {
			super.setAccountBalance(super.getAccountBalance()+money);
			return super.deposite(money);
		}

		
		
		
}
