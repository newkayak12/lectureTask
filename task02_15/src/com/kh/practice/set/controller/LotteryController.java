package com.kh.practice.set.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.kh.practice.set.model.compare.SortedLottery;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryController {
	private Set<Lottery> lottery = new HashSet<>();
	private Set<Lottery> win = new HashSet<>();
	
	public boolean insertObject(Lottery l ) {
		
		
		return lottery.add(l);
	}
	
	public boolean deleteObject(Lottery l) {
		if( lottery.remove(l) && win!=null) {
			win.remove(l);
			return true;
		}

		
		return false;
	}
	
	public HashSet winObject()	{
		Iterator<Lottery> it = lottery.iterator();
		ArrayList<Lottery> temp = new ArrayList<>();
		
			while(it.hasNext()) {
				temp.add(it.next());
			}
			
			if(temp.size() >= 4) {
				
				for(int i=0; i<temp.size(); i++) {
					if(win.size()<=4) {
						
						win.add(temp.get(i));
					}
				}
			}
			
			return (HashSet<Lottery>) win;
	}
	
	public TreeSet SortedWinObject() {
		List<Lottery> temp = new ArrayList<>();
		Iterator<Lottery> it = win.iterator();
		TreeSet<Lottery> tree = new TreeSet<>()	;
		
			while(it.hasNext()) {
				temp.add(it.next());
			}
		
		
			Collections.sort(temp, new SortedLottery());
			
			
			for(int i=0; i<temp.size(); i++) {
				Lottery tempor = temp.get(i);
				System.out.println(temp.get(i));
				tree.add(tempor);
			}
			
			
			
			
			
			
//				전화번호??
		return (TreeSet<Lottery>)tree;
	}
	
	public boolean searchWinner (Lottery l) {
		
			winObject();
		
		return win.contains(l);
	}
	
}
