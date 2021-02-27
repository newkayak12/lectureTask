package workshop1;

public class Test02 {
	public static void main(String[] args) {
		Integer num = Integer.parseInt(args[0]);
		double result = 0;
		double result1 = 1;
		double result2 = 0;
		
		
		if(num>=5 && num <=10) {
			for( int i= 1; i<=num; i++) {
				result += (double)i;
			}
			
			for( int i= 1; i<=num; i++) {
				result1 *= (double)i;
			}
			
			result2 = (double)result / num;
			
			
			
			
			System.out.println("합 : " + result+" 곱 : "+result1+" 평균 : "+result2);
		
		} else {
			
			System.out.println("다시 입력하세요");
			
		}
	}
	
}
