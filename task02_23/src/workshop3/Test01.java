package workshop3;

public class Test01 {
	public static void main(String[] args) {
		while(true) {
			int dice1 = (int) (Math.random()*6)+1;
			int dice2 = (int) (Math.random()*6)+1;
			
			int result = (dice1 - dice2);
			
				if( result >0 && result <=3 ) {
					System.out.println(dice1+" - "+ dice2 +" = "+ result);
					return;
				}
		}
	}
}
