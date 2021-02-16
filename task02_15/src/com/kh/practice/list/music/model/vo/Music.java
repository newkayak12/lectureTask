package com.kh.practice.list.music.model.vo;

import java.util.Objects;

public class Music implements Comparable<Music>{
	private String title, singer;
	
	public Music() {
		// TODO Auto-generated constructor stub
	}

	public Music(String title, String singer) {
		this.title = title;
		this.singer = singer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	@Override
	public int hashCode() {
		return Objects.hash(title, singer);
	}

	@Override
	public boolean equals(Object obj) {
			if(this == obj) {
				return true;
			} else if( obj instanceof Music ) {
				Music other = (Music) obj;
				if( this.title.equals(other.title)  && this.singer.equals(other.singer)) {
					return true;
				}
			}
			
			return false;
	}

	@Override
	public String toString() {
		return "title : " + title +" "+ "singer : " +singer;
	}

	@Override
	public int compareTo(Music o) {
		return o.singer.compareTo(this.singer);
	}
	
	
	
	
	
}
