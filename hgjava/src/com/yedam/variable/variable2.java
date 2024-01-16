package com.yedam.variable;

import java.util.Scanner;

public class variable2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in); //System.in <= 키보드입력값
		// 이름입력 (=name), 연락처(=phone)
		System.out.println("이름을 입력 >>>");
		
		String name = scn.nextLine();
		int phone = scn.nextInt();
		
		int eng = scn.nextInt();
		int mat = scn.nextInt();
		int sum = eng + mat;
		
		// 영어(=eng), 수학(=mat) => 합계(=sum) : scn.nextInt()
		
		
		// 이름: 홍길동, 연락처: 010-1111-2222
		// 영어 : 80, 수학: 85. 합계: 165.
		
	
		
		System.out.println("이름: "+ name + ", 연락처: 010-1111-2222");
		System.out.println("영어:"+ eng + "수학:" + mat + "합계:" + sum);
//		
//		System.out.println("이름을 입력>>> ");
//		String result = scn.nextLine(); //입력값을 문자열로 반환.
//		System.out.println("당신의 이름은 " + result + "입니다");
//		
//		System.out.println("나이를 입력>>> ");
//		int result2 = scn.nextInt();
//		System.out.println("당신의 나이는 " + result2 + "세 입니다");
	}
}