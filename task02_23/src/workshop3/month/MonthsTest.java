package workshop3.month;

public class MonthsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Months month = new Months();
		if(args.length<2) {
			int num = Integer.parseInt(args[0]);
			
			int result = month.getDays(num);
				
				if(result != 0) {
					
					
					System.out.println(num+"월의 마지막 날은 "+result+"일 입니다.");
				}
			
			
			
		}
	}

}
