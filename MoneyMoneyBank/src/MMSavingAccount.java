
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
		public void withDraw(float money) {
			if(super.getSalary()- money > minimumBalance)
			{
				super.setAccountBalance(super.getSalary()-money) ;
			}
			
		}
		
		
}
