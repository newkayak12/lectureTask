package com.kh.example.practice5.model.vo;

public class Lotto {
	private int[] lotto;
	
	public int[] getLotto() {
		return lotto;
	}

	public void setLotto(int[] lotto) {
		this.lotto = lotto;
	}

	{
		lotto= new int[6];
			for(int i=0; i<6; i++) {
				lotto[i]=(int)(Math.random()*45)+1;
					for(int j=0; j<6; j++) {
						if((j!=j)&&lotto[i]==lotto[j]) {
							lotto[j]=(int)(Math.random()*45)+1;
						}
					}
			}
		
	}
	
	
	public void lotto() {
		for(int i=0; i<6; i++) {
			System.out.println(lotto[i]);
		}
	}
	
	public void information() {
		lotto();
	}
}
