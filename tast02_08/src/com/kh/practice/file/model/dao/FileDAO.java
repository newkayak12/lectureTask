package com.kh.practice.file.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class FileDAO {
	File f = null;
	
	public boolean checkName(String file) {
		f = new File(file);
			if(f.exists()) {
				return true;
			} else {
				return false;
			}
			
		
	}
	
	public void fileSave(String file, String s)  {
		f = new File(file);
	
		try
			( Writer	w = new FileWriter(f);
			 BufferedWriter bw = new BufferedWriter(w);) {
				
			bw.write(s);
			
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public StringBuilder fileOpen(String file)  {
		f = new File(file);
		StringBuilder stb  = null;
		try
		
		(Reader r = new FileReader(f);
		BufferedReader br = new BufferedReader(r);){
		
		int data = -1;
			while ( (data = br.read()) != -1) {
				String temp = "";
				stb = new StringBuilder(temp.valueOf(data));
				
				return stb;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return stb;
		
	}
	
	public void fileEdit(String file, String s) {
		
	}
}
