package com.yedam.classes.inherit;

import lombok.Data;

// 이름, 연락처 (Friend)
// 이름, 연락처, 학교, 전공 (UnivFriend)
// 이름, 연락처, 회사, 부서	(CompFriend)

//@Data - Ctrl+space - lombok 
@Data
public class Friend extends Object{
	private String name;
	private String phone;
	
	public void changeInfo(String info1, String info2) {
		return;
	}
	@Override
	public String toString() {
		return "이름은 " + name + ", 연락처는" + phone;
			this.univ = info1;
			this.major = info22;
	}
	@Override
	public String changeInfo(String) {
		return super.toString() + ", 학교는 " + nuvi + ", 전공은" + major;
	}
	
	

	public Friend(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	
}
