package workshop5.account;

import workshop5.account.exception.WrongNumberException;

public class Account {
	private String account = "";
	private double balance = 0.0;
	private double interestRate=0.0;
	
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(String account, double balance, double interestRate) {
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	
	public double calculateInterest() {
		
		return balance * interestRate;
	}
	
	public void deposit (double money) throws WrongNumberException {
		if(money<0) {
			throw new WrongNumberException("잘못된 금액!");
		} else {
			balance += money;
		}
	}
	public void withdraw (double money) throws WrongNumberException{
		if(money>balance) {
			throw new WrongNumberException("금액 초과!");
		} else {
			balance -= money;
		}
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	

}
