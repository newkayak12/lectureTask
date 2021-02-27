package com.kh.practice.map.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.kh.practice.map.model.vo.Member;

public class MemberController {
	Map<String, Member> member = new HashMap<>();
	Map<String, Member> result = new TreeMap<>();
	
	
	public boolean joinMembership (String id, Member m) {
		if(!member.containsKey(id)) {
			member.put(id, m);
			return true;
		} else {
			return false;
		}
	}
	
	public String login(String id, String password) {
		if(member.containsKey(id)) {
			Set<Map.Entry<String, Member>> entry = member.entrySet();
			Iterator<Map.Entry<String, Member>> it = entry.iterator();
				while(it.hasNext()) {
					Map.Entry<String, Member> temp = it.next();
					
					if(temp.getKey().equals(id)) {
						if((temp.getValue().getPassword()).equals(password)) {
							System.out.println("log in success");
							return temp.getKey();
						}
					}
				}
		}
		return null;
	}
	
	public boolean changePassword(String id, String oldPw, String newPw) {
		if(member.containsKey(id)) {
			Set<Map.Entry<String, Member>> entry = member.entrySet();
			Iterator<Map.Entry<String, Member>> it = entry.iterator();
				while(it.hasNext()) {
					Map.Entry<String, Member> temp = it.next();
					
					if(temp.getKey().equals(id)) {
						if((temp.getValue().getPassword()).equals(oldPw)) {
							temp.getValue().setPassword(newPw);
							return true;
						}
					}
				}
		}
		return false;
	}
	
	public void changeName(String id , String newName) {
		if(member.containsKey(id)) {
			Set<Map.Entry<String, Member>> entry = member.entrySet();
			Iterator<Map.Entry<String, Member>> it = entry.iterator();
				while(it.hasNext()) {
					Map.Entry<String, Member> temp = it.next();
					
						if(temp.getKey().equals(id)) {
							temp.getValue().setName(newName);
						}
				}
				
		}
	}
	
	public TreeMap sameName(String name){
//		Set<Map.Entry<String, Member>> entry = member.entrySet();
		
//		Iterator<Map.Entry<String, Member>> it = entry.iterator();
		
//			while(it.hasNext()) {
//				Map.Entry<String, Member> temp = it.next();

		
//					if( ((temp.getValue()).getName()).equals(name)) {
//						result.put(temp.getKey(), temp.getValue());
//						
//					}
//			}
		
		Set<String> ls = member.keySet();
		Iterator<String> it = ls.iterator();
		
		
			while(it.hasNext()) {
				String keies = it.next();
					if(member.get(keies).getName().equals(name)) {
						result.put(keies, member.get(keies));
						
						
					}
			}
			return (TreeMap<String,Member>) result;
		
//		return null;
	}
}
