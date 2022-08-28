package ver2;

public class Account {
	
	// Instance variable, only available inside this class.
		private double balance;		//new comment for balance
		private String name;
		
		
		public Account(String name, double balance) {
			this.name = name;
			this.balance = balance;
		}
		// Decreases the balance by amount
		public void withdraw(double amount) {
			if(amount>0) {
				balance -= amount;
			}
		}
		public void mergeAccount(Account a) {
			if(this.getName().equals(a.getName())) {
				this.balance += a.getBalance();
			}
		}


		// A "getter" method that simply returns the balance.
		public double getBalance() {
			return balance;
		}
		public String getName()	{
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
	// A method that increases the balance by amount
	public void deposit(double amount) {
		if(amount>0) {
			balance += amount;
		}
	}
	@Override
	public String toString() {
		String msg = "name=" + name + "balance=$" + balance;
		return msg;
	}

		// Informal test code
	private static void testAccountCreationWithNameAndBalance() {
		System.out.println("-->testAccountCreationWithNameAndBalance()");
		Account a1 = new Account("Ceasar", 1000.0);
		System.out.println("balance should be $1000, balance=$" + a1.getBalance());
		System.out.println("name should be 'Ceasar', name=" + a1.getName());
	}

	private static void testAccountCreationWithBalanceOnly() {
		System.out.println("-->testAccountCreationWithBalanceOnly()");
		Account a1 = new Account(1000.0);
		System.out.println("balance should be $1000, balance=$" + a1.getBalance());
		System.out.println("name should be 'Unknown', name=" + a1.getName());
	}

		public static void main(String[] args) {
			Account a1 = new Account(1000.0);
			System.out.println("Balance=$" + a1.getBalance());
			a1.deposit(500.0);
			System.out.println("Balance=$" + a1.getBalance());
			a1.withdraw(200.0);
			System.out.println("Balance=$" + a1.getBalance());
			System.out.println(a1.toString());
			System.out.println(a1);
			testAccountCreationWithNameAndBalance();
			testAccountCreationWithBalanceOnly();

	}
}
