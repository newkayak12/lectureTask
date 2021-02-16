package com.kh.practice.file.controller;

import com.kh.practice.file.model.dao.FileDAO;

public class FileController {
	
	
	FileDAO fd = new FileDAO();
	
	public boolean checkName(String file) {
		
		
		return fd.checkName(file);
		
	}
	
	public void fileSave(String file, StringBuilder sb) {
		
		String push = sb.toString();
		fd.fileSave(file, push);
	}
	
	public StringBuilder fileOpen(String file) {
		
		return fd.fileOpen(file);
	}
	
	public void fileEdit(String file, StringBuilder sb) {
		String push ="";
		push += sb.toString();
		fd.fileEdit(file, push);
	}
}
