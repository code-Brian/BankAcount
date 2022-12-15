
public class BankAccount {
	private double checkingBalance;
	private double savingsBalance;
	private static int totalCustomers;
	
	// Basic constructor
	public BankAccount() {
		this.checkingBalance = 0.0;
		this.savingsBalance = 0.0;
		totalCustomers++;
	}
	
	// Getter
	public double getCheckingBalance() {
		return checkingBalance;
	}
	
	public double getSavingsBalance() {
		return savingsBalance;
	}
	
	public void depositFunds(String account, double depositAmt) {
		if(account == "savings") {
			savingsBalance+= depositAmt;
		} else if (account == "checking") {
			checkingBalance += depositAmt;
		}
	}
	
	public void withdrawFunds(String account, double withdrawAmt) {
		if(account == "savings" && withdrawAmt <= savingsBalance) {
			savingsBalance -= withdrawAmt;
			System.out.println("You withdrew " + withdrawAmt +" from savings.");
			System.out.println("You have " + savingsBalance + " remaining in your savings account.");
		} else if (account == "savings" && withdrawAmt >= savingsBalance) {
			System.out.println("Transaction not approved. You requsted " + withdrawAmt + ".");
			System.out.println("Available balance is: " + savingsBalance);
		} else if (account == "checking" && withdrawAmt <= checkingBalance) {
			checkingBalance -= withdrawAmt;
			System.out.println("You withdrew " + withdrawAmt +" from checking.");
		} else if (account == "checking" && withdrawAmt >= checkingBalance) {
			System.out.println("Transaction not approved. You requsted " + withdrawAmt + ".");
			System.out.println("Available balance is: " + checkingBalance);
		}
	}
	
	public void netFunds() {
		double totalBalance = getSavingsBalance() + getCheckingBalance();
		System.out.println("Your combined account balance is: $ " + totalBalance);
	}
	
	public static void getTotalCustomers() {
		System.out.println("The total amount of customers is: " + totalCustomers);
	}
}
