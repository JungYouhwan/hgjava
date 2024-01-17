package com.yedam.operator;

//은행계좌. 10만원이 초과하는 금액 입금시 입금이 안되도록 설정
//55000 -60000 마이너스 계좌가 되는 출금 금지.
import java.util.Scanner;
// 은행계좌.

public class BankExe {
	public static void main(String[] args) {
		
		//입금, 출금, 잔고, 종료.
		Scanner scn = new Scanner(System.in);
		int balance = 0;
		boolean run = true;
		
		
		while(run) {
			System.out.println("1.입금 2.출금 3.잔고 4.종료");
			int menu = Integer.parseInt(scn.nextLine());
			
		switch(menu) {
			case 1:
				System.out.println("입금액>>");
				int a = Integer.parseInt(scn.nextLine());
				if(balance + a > 100000 ) {
					System.out.println("10만원이 넘는 금액은 입금이 안됩니다.");
					break;
				} 
				
				balance += a;
				break;
			case 2:
					System.out.println("출금액>>");
					int b = Integer.parseInt(scn.nextLine());
					if (balance < b) {
						balance += Integer.parseInt(scn.nextLine());
					}else {System.out.println("출금액이 부족합니다.");
					break;
					}
				balance -= b;
				System.out.println("저장성공!");
				break;
					
			case 3: 
				System.out.printf("잔액: %d\n", balance);
				break;
			case 4: run = false;
			}
		}
		System.out.println("end of prog.");
	}
}
