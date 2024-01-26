package com.yedam.thread;

public class BeepThread extends Thread {

	public void run() {
		
		Thread thread = new BeepThread();
		thread.start();
		//메인쓰레드가 실행.
		for (int i = 0; i < 5; i++) {
		System.out.println("print");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}