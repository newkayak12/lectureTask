package workshop3;

public class Test02 {
	public static void main(String[] args) {
		
		Integer num = Integer.parseInt(args[0]);
		Calc calc = new Calc();
		
		if(num>=5 && num<=10) {
			
			System.out.println(calc.calculate(num));
			
		}
		
		
	}
}
