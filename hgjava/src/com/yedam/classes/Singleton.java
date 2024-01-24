package com.yedam.classes;


//전체프로그램에서 인스턴스를 하나만 생성해서
//인스턴스를 계속 만들지 않겠다고 말하는거랑 같음
public class Singleton {
	// 1. 생성자 private 선언
	// 2. Singleton
	// 3. 인스턴스를 반환하도록 getInstance() 제공.
	private static Singleton instance = new Singleton();
	
	private Singleton() {		//private는 외부에서 바꾸지못함
	
	}
	
	public static Singleton getInstance() {
		return instance;
	}
}
