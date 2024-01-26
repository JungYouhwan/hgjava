package com.yedam.io.emp;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;



public class EmpExe {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
		boolean run = true;
		EmpApp app = new EmpApp();
		
		while(run) {
			System.out.println("1.등록 2.목록 9.종료");
			System.out.println("선택>>");
			
			int menu = Integer.parseInt(scn.nextLine());
			switch(menu) {
			case 1: // "사원번호 이름 입사일자 급여."
				String[] strAry = emp.split(" ");
				Employee emp = null;
				
				try {
					emp = new Employee(Integer.parseInt(strAry[0]), strAry[1], // 이름
							sdf.parse(strAry[2]), // 입사일
							Integer.parseInt(strAry[3]) // 급여
					
				} catch (Exception e) {

				}
				if (app.add(emp)) {
					System.out.println("등록완료.");
				} else {
					System.out.println("등록에러.");
				}
				break;
			case 2:
				List<Employee> list = app.list();
				for (Employee std : list){
					System.out.println(std.toString());
				}
		
				break;
			case 9:
				System.out.println("프로그램 종료.");
				app.save();
				run = false;
		}
		
			System.out.println("end of prog.");

	
			System.out.println(std.toString());
		} // end of main.
	}

	}
}
