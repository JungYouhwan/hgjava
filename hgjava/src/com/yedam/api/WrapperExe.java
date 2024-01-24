package com.yedam.api;

import java.util.ArrayList;
import java.util.List;

public class WrapperExe {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
//		list.add(Integer.vaLueOf(1));	// 기본타입 <-> 래퍼클래스
		
		double d1 = Double.valueOf("2.3");
		
		System.out.println(Math.round(-10));
	}// main
}
