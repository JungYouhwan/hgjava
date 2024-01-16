package com.yedam.variable;

public class variable4 {
	public static void main(String[] args) {
		//true / false.
		boolean isTrue = 10 > 20;		//타입 boolean 변수 isTrue
		
		isTrue = update(10);
		
		
			if(isTrue) {
				System.out.println("참값.");
			}else {
				System.out.println("거짓값.");
				}
			
			
			Mamber m1 = new Mamber();
			m1.name = "홍길동";
			m1.age = 20;
			m1.height = 167.8;
			
			Mamber m2 = new Mamber();
			m2.name = "홍길동";
			m2.age = 20;
			m2.height = 167.8;
			
			isTrue = m1.height > m2.height;
			isTrue = m1.age == m2.age;
			isTrue = m1 == m2;			//m1과 m2의 값이 같아도 주소값이 달라 false.가 나옴
			
			System.out.println(isTrue);
			System.out.println(m1); //16진수로 주소가 나옴
			
			byte a = 10;
			int b = (int) a; //변환가능
			
			// 큰 허용 범위 타입 = 작은 허용 범위 타입
			//byte < short < int < long < float < double 크기 순서	
			//정수는 기본 int 값
			
			
		} //end of main
	
	public static boolean update(int arg) {		//static 메모리에 미리 준비시키는 필수명령어 boolean 불린은 참과 거짓을 표현한다. 
		return arg % 2 ==0; // f/ t
	
	}	//end of update.
}  //end of class
