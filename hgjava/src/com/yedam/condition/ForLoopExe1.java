package com.yedam.condition;

public class ForLoopExe1 {
	public static void main(String[] args) {
		
//		for(int i=1; i <=10; i+=2) {
//			System.out.println(i);
//			if(i > 5) {
//				break;
//			}
//		}
//		// 1 ~10까지 합을 계산
//		int sum = 0;
//		for(int n = 1; n <=10; n++) {
//			if(n % 3 == 0) {
//			
//				sum += n;
//		}
//	}
//		System.out.printf("누적된 값은 %d\n", sum);
		
//		System.out.println(i);

			// 1 ~ 31까지 반복.
			System.out.println("Sun Mon Tue Wed Thd Fri Sat");
			System.out.printf("===========================\n");
			System.out.printf("%4s","");

				System.out.println("\n");
			for(int d=1; d<= 31; d++) {
				System.out.printf("%2d",d);
				System.out.printf("%2s","");
				if (d % 7 == 0 ) {
					System.out.println("\n");
				}
			}System.out.printf("\n===========================");
		}		
	}

