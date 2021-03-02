package Workshop4;

public class Test05 {
	
	public static void main(String[] args) {
		int result = 0;
		
		for( int i = Integer.parseInt(args[0]); i<=10; i++ ) {
			if(!(i%3 ==0) && !(i%5==0)) {
				result += i;
				
			}
		}
		
		
		System.out.println(result);
	}
	
	
}
