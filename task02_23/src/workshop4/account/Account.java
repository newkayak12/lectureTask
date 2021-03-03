package Workshop4.account;

public class Account {
	private String account = "";
	private int balance =0;
	private double interestRate =0;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(String account, int balance, double interestRate) {
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	
	public double calculateInterest() {
		
		return (double) balance * interestRate;
	}
	
	public void deposit (int money) {
		balance += money;
	}
	
	public void withdraw (int money) {
		
		if(balance >= money) {
			balance -= money;
		}
	}
	
	
	public void accountInfo() {
		System.out.println("account " + account + "balance " + balance + "interestRate " +interestRate);
	}
	
}
