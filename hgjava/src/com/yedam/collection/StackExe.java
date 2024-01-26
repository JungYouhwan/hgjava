package com.yedam.collection;

import java.util.Stack;

public class StackExe {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<> ();
		stack.push("홍길동");
		stack.push("김민석");
		stack.push("최만석");
		
		stack.pop();
		while(!stack.isEmpty()) {
			String result = stack.pop();	//peek 무한반복
			System.out.println(result);
		}
		
	}
}
