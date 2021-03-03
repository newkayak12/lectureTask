package Workshop4.account;

public class AccountTest2 {
	public static void main(String[] args) {
		Account[] ac = new Account[5];
			for(int i =0; i < ac.length; i++) {
				ac[i] = new Account("221-0101-221"+(i+1), 100000, 4.5);
				
			}
			
			for( Account pieces : ac) {
				pieces.accountInfo();
			}
			
			for(Account pieces : ac) {
				pieces.setInterestRate(3.7);
				pieces.accountInfo();
					System.out.println("interest" + pieces.getBalance()*pieces.getInterestRate());
			}
		
	}
}
