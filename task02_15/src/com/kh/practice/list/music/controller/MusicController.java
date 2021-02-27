package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.practice.list.music.compare.AscTitle;
import com.kh.practice.list.music.model.vo.Music;

public class MusicController {
	private List<Music> list = new ArrayList<>();
	
	
	
	
	public List<Music> getList() {
		return list;
	}

	public int addList(Music music) {
		list.add(music);
		
		return 1;
	}
	
	public int addAtZero(Music music) {
		list.add(0, music);
		
		return 1;
		
	}
	
	public List printAll()	{
		
		return list;
		
	}
	
	public Music searchMsuic(String title) {
		for(int i = 0; i<list.size(); i++) {
			String temp = list.get(i).getTitle();
				if(temp.equals(title)) {
					return list.get(i);
				}
		}
		
		return null;
		
	}
	
	public Music removeMusic(String title) {
		for(int i = 0; i<list.size(); i++) {
			String temp = list.get(i).getTitle();
				
				if(temp.equals(title)) {
//					list.remove(i);
					return list.get(i);
				}
		}
		
		return null;
		
	}
	
	public Music setMusic(String title, Music music) {
		for(int i = 0; i<list.size(); i++) {
			String temp = list.get(i).getTitle();
				if(temp.equals(title)) {
					list.set(i,music);
					
					return list.get(i);
				}
		}
		return null;
	}
	
	public int ascTitle() {
		Collections.sort(list,new AscTitle());
		
		return 1;
	}
	
	public int descSinger() {
		
		Collections.sort(list);
		return 1;
	}
}
