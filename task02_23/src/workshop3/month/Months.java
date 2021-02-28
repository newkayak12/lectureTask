package workshop3.month;

public class Months {
	
	public int getDays(int Months) {
		switch(Months) {
		
			case 1:
				
				return 31;
				
			case 2:
				
				return 28;
				
			case 3:
				
				return 31;
			case 4:
				
				return 30;
			case 5:
				
				return 31;
			case 6:
				
				return 30;
			case 7:
				
				return 31;
			case 8:
				
				return 31;
			case 9:
				
				return 30;
			case 10:
				
				return 31;
			case 11:
				
				return 30;
			case 12:
				
				return 31;
				
			default :
				System.out.println("잘못된 값이 입력됐습니다.");
				
				return 0;
		
		}
	}
}
