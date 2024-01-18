package com.yedam.reference;

import java.util.Scanner;

public class ArrayExe3 {
	public static void main(String[] args) {
		Friend f1 = new Friend(); // 초기화.
		f1.name = "홍길동";
		f1.weight = 67.8;
		f1.score = 80;
		
		Friend f2 = new Friend();
		f2.name = "김길동";
		f2.weight = 77.8;
		f2.score = 86;
		
		Friend f3 = new Friend();
		f3.name = "김민석";
		f3.weight = 79.8;
		f3.score = 89;
		
		String name = "김말숙";
		double weight = 55.5;
		int score = 88;
		
		Friend f4 = new Friend();
		f4.name = name;
		f4.weight = weight;
		f4.score = score;
		
		
		// 새로운 친구.
		
		//김말숙 => 88 -> 90점 변경.		
		
		
		Friend[] friends = {f1, f2, f3, f4};
		friends = new Friend[5]; //{null,null,null,null,null}
		friends[0] = f1;
		friends[1] = f2;
		friends[2] = f3;//{f1,f2,f3,null,null}
		friends[3] = f4;
		
//		for(int i= 0; i< friends.length; i++) {
//			if (friends[i] != null) {
//				System.out.printf("%s 의몸무게는 %1.fkg 점수는%d",friends[i].name,friends[i].weight,friends[i].score);
//				
//			}
//		}
		for(int i=0; i< friends.length; i++) {
			if (friends[i] != null && friends[i].name.equals("김말숙")) {
				friends[i].weight = 90;
				System.out.println(friends[i].weight);
			}
		}
		Scanner name3 = new Scanner(System.in);
//		int a = a.nextInt();
		
//		for(int i=0; i< friends.length; i++) {
//			if()
//			System.out.println("이름을 입력해주세요");
//			System.out.println("수정할 점수를 입력해주세요");
//			
//		}
		
		
		for(int i=0; i< friends.length; i++) {
			if (friends[i] != null && friends[i].name.equals("김말숙")) {
				friends[i].weight = 90;
				System.out.println(friends[i].weight);
			}
		}
		for(int i=0; i< friends.length; i++) {
			if (friends[i] != null && friends[i].name.equals("김말숙")) {
				System.out.printf("몸무게는 %.1fkg 점수는 %d",friends[i].weight, friends[i].score);
			}
		}
	}
}
