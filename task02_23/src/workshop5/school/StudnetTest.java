package workshop5.school;

import javax.annotation.processing.RoundEnvironment;

public class StudnetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] studentArray = new Student[3];
		double totalAge = 0;
		double totalHeight = 0;
		double totalWeight = 0;
		
		studentArray[0] = new Student("홍길동", 15, 171, 81);
		studentArray[1] = new Student("한사람", 13, 183, 72);
		studentArray[2] = new Student("임걱정", 16, 175, 65);
		
		
			for( Student temp : studentArray) {
				System.out.println(temp.getName()+" "+temp.getAge()+" "+
									temp.getHeight()+" "+temp.getWeight());
				
				totalAge += (double)temp.getAge();
				totalHeight += (double) temp.getHeight();
				totalWeight += (double)temp.getWeight();
				
			}
			
			System.out.printf("%.2f  %.2f   %.2f", totalWeight/3, totalHeight/3 ,totalWeight/3);
			
			
	}

}
