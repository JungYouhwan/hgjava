package com.yedam.interfaces;

public class MysqlDB implements DAO{
	
	@Override
	public void insert() {
		System.out.println("[Mysql] 입력.");
	}
	@Override
	public void update() {
		System.out.println("[Mysql] 수정.");
	}
	@Override
	public void delete() {
		System.out.println("[Mysql] 삭제.");
	}
}
