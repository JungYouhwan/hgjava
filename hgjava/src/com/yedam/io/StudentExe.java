package com.yedam.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentExe {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		StudentApp app = new StudentApp();
		while(run) {
			System.out.println("1.등록 2.목록 9.종료");
			System.out.println("선택>>");
			
			int menu = Integer.parseInt(scn.nextLine());
			switch(menu) {
			case 1: // 번호 이름 점수 (엔터)
				System.out.println("번호, 이름, 점수입력");
//				try {
//					Student.add(new (Integer.parseInt(valAry[0]), valAry[1], // 이름
//							sdf.parse(valAry[2]), // 입사일
//							Integer.parseInt(valAry[3])) // 급여
//					);
//				} catch (Exception e) {
//
//				}
//				
//				if (app.add(null)) {
//					System.out.println("등록완료.");
//				} else {
//					System.out.println("등록에러.");
//				}
//				break;
			case 2:
				List<Student> list = app.list();
				(Student std : list){
					System.out.println(std.toString());
				}
				Student std = new Student(//
						Integer.parseInt(readAry[0]), // 학생번호.
						readAry[1], // 학생이름.
						Integer.parseInt(readAry[2]) // 점수
				);
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

	static void read() {
		List<Student> storage = new ArrayList<>();
		try {
			FileReader fr = new FileReader("c:/temp/text.dat");
			BufferedReader br = new BufferedReader(fr);

			while (true) {
				String read = br.readLine(); // 101 name 90
				if (read == null) {
					break;
				}
				String[] readAry = read.split(" "); // 공백을 기준으로 나눔

				Student std = new Student(//
						Integer.parseInt(readAry[0]), // 학생번호.
						readAry[1], // 학생이름.
						Integer.parseInt(readAry[2]) // 점수
				);
				storage.add(std);
			}
			br.close();
			fr.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		List<Student> storage = new ArrayList<>();
		try {
			FileWriter fw = new FileWriter("c:/temp/text.dat");
			BufferedWriter bw = new BufferedWriter(fw);
			
			// 반복.
			for (Student std : storage) {
				String str = std.getSno() + " " + std.getSname() + " " + std.getScore();
				bw.write(str + "\n");
			}
			bw.flush();
			fw.flush();
			bw.close();
			fw.close();
			
		} catch (IOException e) {
			e.prinStackTrace();
		}
		List<Student> storage = new ArrayList<>();
		storage.add(new Student(201, "김민규", 80));
		storage.add(new Student(202, "박민규", 85));
		storage.add(new Student(203, "최민규", 88));
		storage.add(new Student(204, "이민규", 90));
		// text.dat 파일 읽어서 => Student 컬렉션저장.
		// 컬렉션정보 출력.
		for (Student std : storage) {
		}
	}
}
