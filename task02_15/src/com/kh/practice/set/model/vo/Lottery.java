package com.kh.practice.set.model.vo;

import java.util.Objects;

public class Lottery  implements Comparable<Lottery> {
	private String name, phone;
	
	public Lottery() {
		// TODO Auto-generated constructor stub
	}

	public Lottery(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, phone);
	}

	@Override
	public boolean equals(Object obj) {
		if( this == obj) {
			return true;
		} else if( obj instanceof Lottery) {
			Lottery temp = (Lottery) obj;
			
				if( name.equals(temp.name)  &&   phone.equals(temp.phone)) {
					return true;
				}
		}
		return false;
	}

	@Override
	public String toString() {
		return "name : " + name + " phone : " + phone;
	}

	@Override
	public int compareTo(Lottery o) {
		
		return	this.name.compareTo(o.name);
	}
	
	
	
}
