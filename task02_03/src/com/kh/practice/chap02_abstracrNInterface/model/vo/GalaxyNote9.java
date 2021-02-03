package com.kh.practice.chap02_abstracrNInterface.model.vo;

import com.kh.practice.chap02_abstracrNInterface.model.vo.abstarctOne.SmartPhone;
import com.kh.practice.chap02_abstracrNInterface.model.vo.interfaces.NotePen;

public class GalaxyNote9 extends SmartPhone implements NotePen{
	
	public GalaxyNote9() {
		super.setMaker("SamSung");
	}
	
	@Override
	public String printInformation() {
		// TODO Auto-generated method stub
		
		String result ="갤럭시 노트9은" + super.getMaker() +"에서 만들어졌고 제원은 다음과 같다.\n" +makeCall()+takeCall()
		+picture()+ charge()+touch()+bluetoohPen() ;
		return result;
	}
	@Override
	public String makeCall() {
		// TODO Auto-generated method stub
		return "번호를 누르고 통화버튼을 누름 \n";
	}

	@Override
	public String takeCall() {
		// TODO Auto-generated method stub
		return "전화 받기 버튼을 누름 \n";
	}

	@Override
	public String picture() {
		// TODO Auto-generated method stub
		return "1300만 듀얼 카메라\n";
	}
	@Override
	public String charge() {
		// TODO Auto-generated method stub
		return "고속 충전, 고숙 무선 충전 \n";
	}
	
	@Override
	public String touch() {
		// TODO Auto-generated method stub
		return "정전식, 와콤펜 지원 \n 블루투스 펜 탑재 여부  ";
	}

	@Override
	public boolean bluetoohPen() {
		// TODO Auto-generated method stub
		return true;
	}

}
