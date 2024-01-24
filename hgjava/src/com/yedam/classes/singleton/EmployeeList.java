package com.yedam.classes.singleton;

import java.util.Scanner;

public class EmployeeList {
	// 싱글턴.
	private static EmployeeList instance = // 필드
			new EmployeeList();

	Employee[] list; // 사원배열.
	int empNum; // 사원사원수.
	Scanner scn = new Scanner(System.in);

	private EmployeeList() {
	} // 생성자

	public static EmployeeList getInstance() { // 메서드
		return instance;
	}

	// 사원수 추가 입력.
	public void init() {
		System.out.println("사원수>> ");
		int num = scn.nextInt();
		list = new Employee[num];
	}

	// 사원정보 입력 => 배열추가.
	public void input() {
		if (empNum == list.length) { // empNum 초기값 0
			System.out.println("입력초과");
			return;
		}
		System.out.printf("%d 사번", empNum);
		int no = scn.nextInt();

		System.out.print("이름>");
		String name = scn.next();

		System.out.print("급여>");
		int sal = scn.nextInt();

		list[empNum++] = new Employee(no, name, sal); // list empNum 증감
	}

	// 사번에 해당하는 이름 출력.
//	public String search(int empId) {
//		System.out.println("조회할 사번>>");
//		String name = scn.nextLine();
//		for (int i = 0; i <= list.length; i++) {
//			if (list[i] != null) {
//				System.out.println("사번 : " + list[i].getEmployeeId() + "이름 : " + list[i].getName());
//			}
//		}
//	}
	// 해당사번이 있으면 이름 반환. 없으면 "".

	// 전체출력.

} // 사원번호, 이름, 급여 출력.