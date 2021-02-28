package Workshop4;

public class Calc {
	
	int result = 0;
	
	public int calculate (int data) {
			for(int i =1; i<=data; i++) {
				
				if(data%2==0) {
				
					result += i;
					
				}
				
			
			}
	
			return result;
	}
}
