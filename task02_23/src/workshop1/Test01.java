package workshop1;

public class Test01 {
	public static void main(String[] args) {
		Double var1 = Double.parseDouble(args[0]);
		Double var2 = Double.parseDouble(args[1]);
		
		double result = var2%var1;
			
			if(result >1 ) {
				System.out.println("나머지가 1보다 크다");
				
			} else {
				
				System.out.println("나머지가 1보다 작거나 같다.");
			}
	}
}
