
public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount testAccount = new BankAccount();
		BankAccount testAccount2 = new BankAccount();
		
		testAccount.depositFunds("checking", 0.69);
		testAccount.depositFunds("savings", 4.20);
		testAccount.netFunds();
		testAccount.withdrawFunds("checking", 0.68);
		
		testAccount2.depositFunds("checking", 0.69);
		
		BankAccount.getTotalCustomers();
	}

}
