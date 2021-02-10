package com.kh.score.model.dao;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ScoreDAO {
	public static int num =0;
	public static int load = 0;
	
	String name;
	int kor;
	int eng;
	int math;
	int sum;
	double avg;
	
	public static int sumAll;
	
	
	public void saveScore (String name, int kor, int eng, int math, int sum, double avg) {
		
		File stu = new File("/Users/sanghyeonkim/Downloads/homework/tast02_08/src/com/kh/score/view/StudentData/"+num);
		File count = new File("/Users/sanghyeonkim/Downloads/homework/tast02_08/src/com/kh/score/view/StudentData/data/count");
		if(!count.exists()) {
			try {
				count.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			try(FileInputStream thir = new FileInputStream(count);
					DataInputStream rs = new DataInputStream(thir);){
				
					num = rs.readInt();
				 
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
					if(stu.exists()) {
						
					} else {
						try(FileOutputStream fos = new FileOutputStream(stu);
								BufferedOutputStream bof = new BufferedOutputStream(fos);
								DataOutputStream dos = new DataOutputStream(bof);){
								dos.writeUTF(name);
								dos.writeInt(kor);
								dos.writeInt(eng);
								dos.writeInt(math);
								dos.writeInt(sum);
								dos.writeDouble(avg);
								
								fos.flush();
								bof.flush();
								dos.flush();
								
								
								++num;
								
							} catch ( IOException e) {
								e.printStackTrace();
							} 
					}
					
					
					File count2 = new File("/Users/sanghyeonkim/Downloads/homework/tast02_08/src/com/kh/score/view/StudentData/data/count");
					try (FileOutputStream  sec = new FileOutputStream(count2);
						DataOutputStream ls = new DataOutputStream(sec);){
						
						ls.writeInt(num);
						sec.flush();
						ls.flush();
						sec.close();
						ls.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
	}
	
	
	public void readScore() throws FileNotFoundException{
		
				
		//int load=ScoreDAO.load;
		File stu2 = new File("/Users/sanghyeonkim/Downloads/homework/tast02_08/src/com/kh/score/view/StudentData/"+(load));
			++ScoreDAO.load;
			try(FileInputStream fos = new FileInputStream(stu2);
				BufferedInputStream bos = new BufferedInputStream(fos);
				DataInputStream dis = new DataInputStream(bos);){
				String name1 = dis.readUTF();
				int kor1 = dis.readInt();
				int eng1 = dis.readInt();
				int math1 = dis.readInt();
				int sum1 = dis.readInt();
				double avg1 = dis.readDouble();
				
				System.out.println(name1+"\t"+kor1+"\t"+eng1+"\t"+math1+"\t"+sum1+"\t"+avg1);
				
				sumAll += sum1;
				
			} catch( IOException e) {
				e.printStackTrace();
			}
			
					
					
					
	}
}
