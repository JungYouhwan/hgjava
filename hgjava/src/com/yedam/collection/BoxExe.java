package com.yedam.collection;

import java.util.ArrayList;
import java.util.List;

public class BoxExe {
	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.setobj("Hong");
		String result = box.getObj();
		
		Box<Integer> boxi = new Box<>();
		boxi.setobj(100);
		Integer resulti = boxi.getObj();
		
		List<String> list = new ArrayList<>();
		list.add("");
		
		
		for (int i = 0; i < list.size(); i++) {
			String result1 = list.get(i);
		}
		
//		box.setobj(100);
//		box.setobj("Hong");
//		Integer result = (Integer) box.getObj();
		
	}
}
