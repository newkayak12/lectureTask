package workshop2.com.test3_re;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {

	public static void main(String[] args) {
		Student studentArray [] = new Student[3];
		double age= 0;
		double weight = 0;
		double height =0;
		
		int topAge = 0;
		int botAge = 0;
		
		int topHei = 0;
		int botHei = 0;
		
		int topWei = 0;
		int botWei = 0;
		
		int tm1 = 0;
		int tm2 = 0;
		
		
		studentArray[0] = new Student("홍길동", 15, 170, 80); 
		studentArray[1] = new Student("한사람", 13, 180, 70);
		studentArray[2] = new Student("임걱정", 16, 175, 65);
		
			for(Student temp : studentArray) {
				
				temp.studentInfo();
				
				age += temp.getAge();
				weight += temp.getWeight();
				height += temp.getHeight();
			}
			
			System.out.println("avg age");
			System.out.printf("%.1f\n\n",age/3);
			
			System.out.println("avg weight");
			System.out.printf("%.1f\n\n",weight/3);
			
			System.out.println("avg height");
			System.out.printf("%.1f\n\n",height/3);
			
			
			
			
				// 
				// 
				// 학생들 중 나이가 가장 적은 학생과 많은 학생 출력
//			 A>B = A else B
			
//			[0] > 15  [1] 13 [2] 16           15/ 16
//			[1] > 13         [2] 16			  15/ 16
//						  
			System.out.println("\n");
			
			
				for (int i =0; i<studentArray.length; i++) {
					for( int j = i+1; j<studentArray.length; j++) {
							if( studentArray[i].getAge()> studentArray[j].getAge()) {
									topAge = studentArray[i].getAge();
							} else {
								topAge = studentArray[j].getAge();
							}
					}
				}
				
				System.out.println("Greatest Age");
				System.out.println(topAge);
				
				
				for (int i =0; i<studentArray.length; i++) {
					for( int j = i+1; j<studentArray.length; j++) {
							if( studentArray[i].getAge()> studentArray[j].getAge()) {
								botAge = studentArray[j].getAge();
							} else {
								botAge = studentArray[i].getAge();
							}
					}
				}
				System.out.println("Lowest Age ");
				System.out.println(botAge);
				
				
				
				
				
				
				
				// 학생들 중 신장이 가장 적은 학생과 큰 학생 출력
				System.out.println("\n");
				
				
					for (int i =0; i<studentArray.length; i++) {
						for( int j = i+1; j<studentArray.length; j++) {
								if( studentArray[i].getHeight()> studentArray[j].getHeight()) {
										
										if(i==0) {
											tm1 = studentArray[i].getHeight();
											
										} else {
											tm2 = studentArray[i].getHeight();
										}
										
								} else {
									
										if(i==0) {
											tm1 = studentArray[i].getHeight();
											
										} else {
											tm2 = studentArray[i].getHeight();
										}
											
									
									
								}
						}
					}
					
					if(tm1>tm2) {
						topHei =tm1;
						
					} else {
						topHei = tm2;
					}
					
					System.out.println("Largest Height");
					System.out.println(topHei);

					
					for (int i =0; i<studentArray.length; i++) {
						for( int j = i+1; j<studentArray.length; j++) {
								if( studentArray[i].getHeight()> studentArray[j].getHeight()) {
									
									
									
									if(i==0) {
										tm1 = studentArray[i].getHeight();
										
									} else {
										tm2 = studentArray[i].getHeight();
									}
									
								} else {
									
									
									if(i==0) {
										tm1 = studentArray[i].getHeight();
										
									} else {
										tm2 = studentArray[i].getHeight();
									}
								}
						}
					}
					
					
					if(tm1>tm2) {
						botHei =tm2;
						
					} else {
						botHei = tm1;
					}
					System.out.println("Smallest Heigth ");
					System.out.println(botHei);
				
//				170 180 175
//				[0]170 180 175   180  175
//				[1]180 175       180
				
				
				// 학생들 중 몸무게가 가장 적은 학생과 많이 나가는 학생 출력 
					
					
					
					
					System.out.println("\n");
					
					
					
					
						for (int i =0; i<studentArray.length; i++) {
							for( int j = i+1; j<studentArray.length; j++) {
									if( studentArray[i].getWeight()> studentArray[j].getWeight()) {
											
											if(i==0) {
												tm1 = studentArray[i].getWeight();
												
											} else {
												tm2 = studentArray[i].getWeight();
											}
											
									} else {
										
											if(i==0) {
												tm1 = studentArray[i].getWeight();
												
											} else {
												tm2 = studentArray[i].getWeight();
											}
												
										
										
									}
							}
						}
						
						if(tm1>tm2) {
							topWei = tm1;
							
						} else {
							topWei = tm2;
						}
						
						System.out.println("Largest Weight");
						System.out.println(topWei);
						
						
						for (int i =0; i<studentArray.length; i++) {
							for( int j = i+1; j<studentArray.length; j++) {
									if( studentArray[i].getWeight()> studentArray[j].getWeight()) {
										
										
										
										if(i==0) {
											tm1 = studentArray[i].getWeight();
											
										} else {
											tm2 = studentArray[i].getWeight();
										}
										
									} else {
										
										
										if(i==0) {
											tm1 = studentArray[i].getWeight();
											
										} else {
											tm2 = studentArray[i].getWeight();
										}
									}
							}
						}
						
						
						if(tm1>tm2) {
							botWei =tm2;
							
						} else {
							botWei = tm1;
						}
						System.out.println("Smallest Weigth ");
						System.out.println(botWei);
					
					
					
					
					
					
					
					
			
	}

}
