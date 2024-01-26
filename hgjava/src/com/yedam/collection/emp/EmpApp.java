package com.yedam.collection.emp;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class EmpApp {
	public static void main(String[] args) {

		List<Employee> storage = new ArrayList<>();

		Scanner scn = new Scanner(System.in);
		
		boolean run = true;
		
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
		
		while (run) {
			// "23-03-01"
			System.out.println("1.등록 2.조회(입사일자) 9.종료");
			int menu = 0;
			try {
				menu = Integer.parseInt(scn.nextLine());
				break;
			} catch (NumberFormatException ne2) {
				System.out.println("숫자값이 아님.");
			}
			// "101 홍길동 23-05-08 100"
			switch (menu) {
			case 1: // 등록
				System.out.println("사원번호, 이름, 날짜, 급여를 입력해주세요.");
//				String name = members.get(i).getName();
//				members.set(i, new Member(4, "김길동")
				String[] valAry = scn.nextLine().split(" ");
				try {
					storage.add(new Employee(Integer.parseInt(valAry[0]), valAry[1], // 이름
							sdf.parse(valAry[2]), // 입사일
							Integer.parseInt(valAry[3])) // 급여
					);
				} catch (Exception e) {

				}

			case 2: // 조회(입사일자)
				Date searchCondition;
				System.out.println("조회일 입력>>");
				while (true) {
					try {
						searchCondition = sdf.parse(scn.nextLine());
						break;
					} catch (Exception e) {

						System.out.println("날짜 포맷이 부정확.");
					}
				}
				
//				for (int i = 0; i < storage.size(); i++) {
//					Date day = storage.get(i).getHireDate();
//					if(day.equals(searchCondition)) {
//						System.out.println(day.get().toString());
//					}
//				}
					System.out.println();
			case 9: // 종료

			}
			System.out.println("end of prog.");
		}

	}// main

	void method() {

		String val = "101 홍길동 23-05-08 100";
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");

		String[] valAry = val.split(" "); // 번호, 이름, 날짜, 급여 나누기
		for (String value : valAry) {
			System.out.println(value);
		}
		try {
			new Employee(Integer.parseInt(valAry[0]), // 사번
					valAry[1], // 이름
					sdf.parse(valAry[2]), // 입사일
					Integer.parseInt(valAry[3]) // 급여
			);
		} catch (Exception e) {

		}

	}

}