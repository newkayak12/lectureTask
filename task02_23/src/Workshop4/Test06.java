package Workshop4;

public class Test06 {
	public static void main(String[] args) {
		int result = 0;

		
		if(args.length<2 || args.length>2) {
			
			System.out.println("다시 입력하세요");
			
		} else if ( args.length ==2) {
			
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			
				if((num1>5 || num1<1) || (num2>5 || num2<1)) {
					System.out.println("숫자를 확인하세요");
				
				} else {
					
					int [][] arr = new int[num1][num2];
					
					for(int i =0; i<arr.length; i++) {
						for( int j =0; j<arr[i].length; j++) {
							arr[i][j] = (int) (Math.random()*5)+1;
						}
					}
					
					for(int i =0; i<arr.length; i++) {
						for( int j =0; j<arr[i].length; j++) {
							System.out.println("num : "+ arr[i][j]);
							result += arr[i][j];
						}
					}
					
					System.out.println("sum :" + result);
					System.out.println("avg :"+((double)result/(arr[0].length+arr[1].length)));
					
					
					
				}
			
		}
		
		
		
		
	}

}
