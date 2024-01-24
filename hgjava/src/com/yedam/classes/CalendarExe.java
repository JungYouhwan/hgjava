//package com.yedam.classes;
//
//import java.util.Date;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//
//public class CalendarExe {
//	public static void main(String[] args) {
//		// drawCalendar(2022, 1); // 2024년 5월 달력.
//		Date date = new Date();	// 1900년
//		// 2024-10-5
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		try {
//		date = sdf.parse("2024-01-01");	// String -> Date
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println(date.getDate());
//	}
//		
//		
//	static void drawCalendar(int year, int month) {
//		Calendar cal = Calendar.getInstance();
//		cal.set(year, month -1, 1);
//		System.out.println("year: " + cal.get(Calendar.DAY_OF_WEEK));
//		System.out.println("last Date: " + cal.getActualMaximum(Calendar.DATE));
//		
//		drawCalendar(2024, 1);
//	}
//	
////		// 2024, 1)
//
//		String[] days = {"Sun", "Mon", "Tue", "Wed", "Thd", "Fri", "Sat"};
//		for(int i =0; i < days.length; i++) {
//		System.out.printf("%4s", days[i]);
//		}
//		// 요일
////		System.out.println("year: " + cal.get(Calendar.DAY_OF_WEEK));
////		System.out.println("last Date: " + cal.getActualMaximum(Calendar.DATE));
//			System.out.printf("");
//			
//		// 1일 요일지정	
//		for(int i = 0;  i <=days.length;  i++) {
//			System.out.printf("%4d",d);
//			if (cal) % 7 == 0) {
//				System.out.println("\n");
//			}
//		}
//		// 마지막 요일지정
//		for(int i = 0;  i <=days.length;  i++) {
//			System.out.printf("%4d",d);
//			if (cal) % 7 == 0) {
//				System.out.println("\n");
//			}
//		}
//		System.out.println("\n\n==========end of prog.==========");
//		}
//	}
//}
//}