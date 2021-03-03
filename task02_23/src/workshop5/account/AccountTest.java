package workshop5.account;

import workshop5.account.exception.WrongNumberException;

public class AccountTest {

	public static void main(String[] args) {
		Account a = new Account("441-0290-12203", 500000, 7.3);
		
				System.out.println(a.getAccount()+ " / " +a.getBalance()+ " / " + a.getInterestRate());
				try {
					a.deposit(-10);
				} catch (WrongNumberException e) {
					System.out.println(e.getMessage());
				}
				
				
				try {
					a.withdraw(6000000);
				} catch (WrongNumberException e) {
					System.out.println(e.getMessage());
				}
				
				System.out.println(a.calculateInterest());
				
				
	}

}
