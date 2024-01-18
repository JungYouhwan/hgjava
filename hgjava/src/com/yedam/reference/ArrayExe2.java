package com.yedam.reference;

import java.util.Scanner;

public class ArrayExe2 {
	public static void main(String[] args) {
		int[] scores = new int [10];
		int[] st = new int [5];
		
		System.out.println(scores[0]);
		 
		double[] dblary = {67.3, 72.5, 88.3, 79.3, 90.4};
		// 배열의 값 중에서 제일 큰값을 출력.
		
		double max = 0;
		
		for (int z=0; z < dblary.length; z++) {
			if (max < dblary[z]) {
				max = dblary[z];
			}
		}
		System.out.println("최대값은" + max +"입니다.");
		System.out.println("\n==========end of prog.========");
		Scanner scn = new Scanner(System.in);
		System.out.println("친구 입력>>");
		String name = scn.nextLine();
		String[] friends = {"길동이", "삼순이", "복돌이", "석박이", "홍근이"};
		// 길동이는 1번쨰 있습니다.
		int a = friends.length;
		for(int i=0; i < friends.length; i++) {
			if (name.equals(friends[i])) {
				System.out.println(name + "는"+ i +"번쨰 있습니다.");
			}//if (a != friends[i]) {
//				System.out.println(name + "는 없습니다.");
		}
		System.out.println("\n==========end of prog.========");
		double avg = 0;
		double sum = 0;
		// 친구의 평균몸무게는 78.8 입니다.
		 
		for (int k=0; k < dblary.length; k++) {
			sum += dblary[k];
			
		}
		avg = sum / dblary.length;
		System.out.printf("친구의 몸무게는 %.1f 입니다.",avg);
		
		System.out.println("\n==========end of prog.========");
		//String[] friends = {"길동이", "삼순이", "복돌이", "석박이", "홍근이"};
		//double[] dblary = {67.3, 72.5, 88.3, 79.3, 90.4};
		st[0] = 55;
		st[1] = 78;
		st[2] = 84;
		st[3] = 86;
		st[4] = 70;
		
		
		for (int i=0; i < friends.length; i++) {
		System.out.println("이름: " + friends[i]);
		System.out.println("몸무게: " + st[i]);
		System.out.println("성적: " + dblary[i]);
		System.out.println("============");
		}
		System.out.println("\n==========end of prog.========");
//		int mx = 0;
//		String name2 = "";
//		double weight = 0;
//		for (int i =0; i <friends.length; i++) {
//			if(mx == i) {
//				name2 = friends;
//				mx = max;
//				
//				System.out.printf("최고점수 이름 %s, 몸무게: %f" + friends[i], st[i]);
//			}
//		}
		//학생 이름, 몸무게, 성적 출력
		System.out.println("\n==========end of prog.========");
		// 80점 이상인 학생은 3명입니다.
		// 90점 이상 학생은 없습니다.
		for (int i = 0; i < st.length; i++) {
//			System.out.println("scores[" + i + "]=> " + scores[i]);
			if (st[i] >= 90) {
				System.out.println("90점 이상인 학생은 "+ i +"명 입니다");
				break;
			}else  
				if (st[i] > 80) {
				System.out.println("80점 이상인 학생은 " + i +"명 입니다");
				break;
//				System.out.println("인덱스: " + i);
		}System.out.println("90점 이상인 학생은 없습니다.");
	
		
	}
}
}
