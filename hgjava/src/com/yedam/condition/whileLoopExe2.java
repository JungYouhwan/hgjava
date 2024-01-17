package com.yedam.condition;

import java.util.Scanner;

public class whileLoopExe2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// 어떤 조건일 동안 반복.
		int random = (int) (Math.random() * 100) +1;	//1 ~ 10 정수.
		
		while (true) {
			System.out.println("값입력>>");
			int Num = scn.nextInt();
			if (random == Num) {
			System.out.printf("임의값 %d\n", random);
			break;
			}	if (random > Num) {
				System.out.println("임의의 값보다 올려야합니다.");
				continue;
			}	else {
				System.out.println("임의의 값보다 줄여야합니다."); 
			}
		
		
	}
	System.out.println("end of prog.");
}
}