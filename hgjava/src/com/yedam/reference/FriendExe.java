package com.yedam.reference;

import java.util.Scanner;

// 친구의 정보를 저장하고 변경하고 ... 관리.
// Create, Read, Update, Delete.
public class FriendExe {
	
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	boolean run = true;
	Friend[] friends = new Friend[5]; // {null, null, null, null,null,}
	
	int score = 0;
	double weight = 0;
	while (run) {
		System.out.println("1.등록 2.조회 3.수정. 4.삭제 5.점수조회 6.분석 9.종료");	
		int menu = Integer.parseInt(scn.nextLine());
		switch(menu) {
		case 1: //등록.
			System.out.print("이름>>>");
			String name = scn.nextLine();
			System.out.print("몸무게>>>");
			weight = Double.parseDouble(scn.nextLine());
			System.out.print("점수>>>");
			score = Integer.parseInt(scn.nextLine());
			//비어있는 위치 한건 입력 종료.
			Friend friend = new Friend();
			friend.name = name;
			friend.weight = weight;
			friend.score = score;
		for(int i = 0; i < friends.length; i++) {
		if(friends[i] == null) {
			friends[i] = friend;
			break;
			}
		}
			System.out.println("정상적 입력.");
			break;
			
		case 2: // 조회.
			for( int i =0; i < friends.length; i++) {
				if(friends[i] != null) {
					System.out.printf("이름:%s, 몸무게:%.1f, 점수: %d점.\n",friends[i].name,friends[i].weight,friends[i].score);
					}
			}
			// 전체목록.. 이름:홍길동, 몸무게:77.2kg, 점수 : 80점.
			break;
		case 3:	//수정
			// 친구이름 -> 점수 수정.
			weight = 0;
			score = 0;
			System.out.print("조회할이름>>>");
			name = scn.nextLine();
			System.out.print("수정할 몸무게>>>");
			String sweight = scn.nextLine();
//			score = Integer.parseInt(scn.nextLine());
			if(!sweight.equals("")) {		
				weight = Integer.parseInt(sweight); 
			}
			System.out.println("수정할 점수>>>");
			String sscore = scn.nextLine();
			if(!sscore.equals("")) {
				score = Integer.parseInt(sscore); 
			}
			boolean isExist = false;
			for(int i =0; i < friends.length; i++) {
				if(friends[i] != null && friends[i].name.equals(name)) {
					friends[i].score = (score != 0) ? score : friends[i].score;
					friends[i].weight = (weight != 0) ? weight : friends[i].weight;
					isExist = true;
				}
			}
			System.out.println("수정완료.>>>");
			break;
			case 4:	//삭제
				System.out.print("수정하고 싶은 이름>>>");
				name = scn.nextLine();
				for(int i =0; i < friends.length; i++) {
					if(friends[i] != null && friends[i].name.equals(name)) {
						friends[i] = null;
						
					}
				}
				System.out.println("삭제완료!");
			case 5:		// 점수 조회 
			//입력 점수 이상인 친구
				System.out.print("조회할 점수 입력.>>>");
				score = Integer.parseInt(scn.nextLine());
				boolean name1 = true;
				for(int i =0; i < friends.length; i++) {
					if(friends[i] != null && friends[i].score >= score) {
						System.out.printf("이름:%s, 몸무게:%.1f, 점수: %d점.\n",friends[i].name,friends[i].weight,friends[i].score);
						name1 = false;
					}
				}
				if(name1) {
					System.out.println("조회할 사람이 없습니다.");
				}
				System.out.println("조회완료");
				break;
				
			case 6:		//분석
				// 평균 점수: 85, 최고점수: 90점
				int max = 0;
				int sum = 0;
				int avg = 0;
				int count = 0;
				for( int i =0; i < friends.length; i++) {
					if(friends[i] != null) {
						sum += friends[i].score;
						count ++;
					}					
					if (friends[i] != null && max < friends[i].score) {
						max = friends[i].score;
					}
				}
				avg = sum / count;
				System.out.printf("최고 점수는 %d점, 평균 점수는 %d점\n", max, avg);
				break;
			case 9: //종료.
			run = false;
			System.out.println("종료합니다.");
		}
	}// end if while.
	System.out.println("end of prog.");
}// end of main.
}
