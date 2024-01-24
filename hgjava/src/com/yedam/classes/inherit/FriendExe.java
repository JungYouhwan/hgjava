//package com.yedam.classes.inherit;
//
//import java.util.Scanner;
//
//public class FriendExe {
////	사용자입력/처리결과 출력 => 컨트롤.
//	public static void main(String[] args) {
//		Scanner scn = new Scanner(System.in);
//		boolean run = true;
//		FriendApp app = new FriendApp();
//		while (run) {
//			int menu = 0;
//		while (true) {
//			System.out.println("1.등록 2.조회 9.종료");
//			try {
//				menu = Integer.parseInt(scn.nextLine());
//				break;
//			} catch (NumberFormatException ne2) {
//				System.out.println("숫자값이 아님.");
//			}
//		}
//			switch (menu) {
//			case 1: // 등록 1)이름연락처 2)학교친구 3)회사친구
//				System.out.println("1.친구 2.학교 3.회사");
//				int subMenu = Integer.parseInt(scn.nextLine());
//				System.out.print("이름>> ");
//				String name = scn.nextLine();
//				System.out.print("연락처>> ");
//				String phone = scn.nextLine();
//
//				Friend friend = null;
//				if (subMenu == 1) {
//					friend = new Friend();
//					friend.setFname(name);
//					friend.setPhone(phone);
//
//				} else if (subMenu == 2) {
//					UnivFriend ufriend = new UnivFriend();
//					ufriend.setFname(name);
//					ufriend.setPhone(phone);
//
//					System.out.print("학교>> ");
//					String univ = scn.nextLine();
//					System.out.print("전공>> ");
//					String major = scn.nextLine();
//					ufriend.setUniv(univ);
//					ufriend.setMajor(major);
//
//					friend = ufriend;
//
//				} else if (subMenu == 3) {
//					CompFriend cfriend = new CompFriend();
//					cfriend.setFname(name);
//					cfriend.setPhone(phone);
//
//					System.out.print("회사>> ");
//					String company = scn.nextLine();
//					System.out.print("부서>> ");
//					String dept = scn.nextLine();
//					cfriend.setCompany(company);
//					cfriend.setDept(dept);
//
//					friend = cfriend;
//				}
//				if (app.add(friend)) {
//					System.out.println("정상 등록.");
//				} else {
//					System.out.println("등록 실패.");
//				}
//				break;
//
//			case 2: // 목록 (이름)
//				System.out.println("조회할 이름>>> ");
//				String fname = scn.nextLine();
//				Friend[] list = app.list(fname);
//				for (int i = 0; i < list.length; i++) {
//					if (list[i] != null) {
//						System.out.println(list[i].toString());
//					}
//				}
//				break;
//
//			case 9:
//				System.out.println("종료합니다");
//				run = false;
//
//			}// end of switch
//		} // end of while
//
//		System.out.println("end of prog.");
//	}// end of main
//}
