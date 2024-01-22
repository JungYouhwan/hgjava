package com.yedam.classes;

public class HighStudent  extends Student {
	private String teacher;
	
//	public HighStudent() {
//		super();
//	}
	public HighStudent(String sno, String name) {
		super(sno, name);
	}
	public HighStudent(String sno, String name, int score, String teacher) {
		super(sno, name, score);
		this.teacher = teacher;
		
		
	}
	// getter/setter.
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	
	// 부모메소드를 재정의(overriding)
	public void showInfo() {
		// 자식클래스: teacher추가 출력.
		System.out.printf("번호는 %s, 이름은%s, wjatnsms %d, 선생님은 %s"
				+ "입니다.\n", getSno(), getSname(), getScore(), teacher);
	}
	
}
