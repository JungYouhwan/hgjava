package com.yedam.classes.nested;

class Parent {

	String name;

	void showName() {
		System.out.println("이름은 " + name);
	}
}

interface Runnable {
	void run(String name); // 함수형 인터페이스 =>(구현해야할 메소드가 하나만 존재.)
}

public class AnonymousExe {
	public static void main(String[] args) {
		
		// 익명규현객체
		Runnable runnable = (name) -> System.out.println("나는 달립니다."); // 익명구현객체.
		runnable.run("홍길동");

		runnable = (name) -> System.out.println(name + "빨리 달립니다.");
		runnable.run("김길동");

		// 익명자식객체.
		Parent parent = new Parent() {
			int age;

			void showInfo(String name, int age) {
				this.name = name;
				this.age = age;

				System.out.println("이름은 " + name + ", 나이는 " + age);
			}
			void showName() {
				showInfo("홍길동",20);
			};

		};
		parent.showName();
//		parent.showInfo(); // 자식메소드.
	}
}
