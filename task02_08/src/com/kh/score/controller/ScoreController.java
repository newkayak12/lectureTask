package com.kh.score.controller;

import java.io.FileNotFoundException;

import com.kh.score.model.dao.ScoreDAO;

public class ScoreController {
	ScoreDAO sd = new ScoreDAO();

	
	public void saveScore(String name, int kor, int eng, int math, int sum, double avg) {
		
		sd.saveScore(name, kor, eng, math, sum, avg);
	}
	
	public void readScore() throws FileNotFoundException {
		sd.readScore();
	}


}
