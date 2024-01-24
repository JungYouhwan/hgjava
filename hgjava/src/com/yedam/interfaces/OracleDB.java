package com.yedam.interfaces;

// 인터페이스를 구현하는 클래스.
public class OracleDB implements DAO{
	
	public void insert() {
		System.out.println("[Oracle] 입력.");
	}
	public void update() {
		System.out.println("[Oracle] 수정.");
	}
	public void delete() {
		System.out.println("[Oracle] 삭제.");
	}
}
