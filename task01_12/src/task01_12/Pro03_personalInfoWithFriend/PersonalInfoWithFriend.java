package task01_12.Pro03_personalInfoWithFriend;

public class PersonalInfoWithFriend {

	public static void main(String[] args) {
		String name, gender, addr, pNo, email;
		int age;
		
		
			name = "홍두깨";
			age = 22;
			gender = "남";
			addr = "서울";
			pNo = "01012345678";
			email = "myemail@email.com";
			System.out.println("  name   age gender address   phone         e-mail                  ");
			System.out.println("-------------------------------------------------------------------------");
			System.out.printf("%5s%5d%5s%7s%14s%20s\n", name, age, gender,addr, pNo, email);
			name = "고길동";
			age = 50;
			gender = "남";
			addr = "경기도";
			pNo = "01098765432";
			email = "mrgogo@email.com";
			
			System.out.println("-------------------------------------------------------------------------");
		System.out.printf("%5s%5d%5s%7s%14s%20s\n", name, age, gender,addr, pNo, email);
}
}
