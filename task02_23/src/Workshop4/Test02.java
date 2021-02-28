package Workshop4;

public class Test02 {

	
	public static void main(String[] args) {
		int[] arr3 = new int[5];
		int result = 0;
		
			for(int i =0; i<arr3.length; i++) {
				arr3[i] = (int) (Math.random()*10)+1;
				System.out.println(arr3[i]);
				result += arr3[i];
			}
			
			System.out.println(result);
			System.out.println(result/arr3.length);
			
	}
}
