package workshop2;

public class Test02 {

	public static void main(String[] args) {
		
//		int inx = 0; while(inx <= 6) {
//			int jnx = 0; while(jnx <= inx) {
//			System.out.print("*");
//			jnx++; }
//			System.out.print("@");
//			inx++; }
		
		
		
		
		
		
		for(int i =0; i<7; i++) {
			
			for(int j =0; j<7; j++) {

				if(j<=i) {
					
					System.out.print("*");
				}
			}
			
			
			System.out.print("@");
		}
	}

}
