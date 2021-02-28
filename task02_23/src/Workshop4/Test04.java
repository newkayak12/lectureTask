package Workshop4;

public class Test04 {
	public static void main(String[] args) {
		Calc cal = new Calc();
		int num = Integer.parseInt(args[0]);
		
			if(num>=5 && num <= 10) {
				
				cal.calculate(num);
				
			}
	}
	
}
