package com.kh.practice.book.model.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.practice.book.model.vo.Book;

public class BookDao {
	private Book[] bArr = new Book[10];
	File f = new File("book.txt");

	public void fileSave(Book[] bArr) {
			
				if(f.exists()) {
					for(int i =0; i<this.bArr.length; i++) {
						if(fileRead()[i] != null) {
							
							this.bArr = fileRead();
							break;
						}
						
					}
					
					
				}
		
		
		
		
				for(int i = 0; i<this.bArr.length; i++) {
					
					 if(this.bArr[i]==null) {
						this.bArr[i]=bArr[0];
						break;
					}
				}
			
				
				
				try(FileOutputStream fos = new FileOutputStream(f);
					ObjectOutputStream oos = new ObjectOutputStream(fos);	
					){ oos.writeObject(this.bArr);
					
						oos.flush();
					
					
				
				} catch ( IOException e	) {
					e.printStackTrace();
				}
	}
	
	
	
	
	public Book[] fileRead() {
		Object o =null;
		try(FileInputStream fis = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(fis);	){
				
			try {
				o = ois.readObject();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
				
				
			
			
		} catch ( IOException e) {
			e.printStackTrace();
		}
			
		
		return ( Book[] )o;
	}
}
