package com.yedam.io;

import java.io.*;

public class ByteStreamExe {
	public static void main(String[] args) {
		// 입력출력 => 복사.
		try {
			FileInputStream fis = new FileInputStream("c:/temp/KakaoTalk_Setup.exe");	//입력 스트림
			FileOutputStream fos = new FileOutputStream("c:/temp/copyKakao.exe");		// 출력 스트림
//			byte[] byteAry = new byte[100];	//배열활용한 속도향상.
			
			// 보조스트림. buffered....
			
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			
			while (true) {
				int buf = bis.read();	// fis.read();
				if (buf == -1) {
					break; // 종료.
				}
//				fos.write(buf);
				bos.write(buf);
			}
			bos.flush(); bos.close();
			fos.flush();fos.close();
			bis.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("end if file");
	}

	public void read() {
		try {
			FileInputStream fis = new FileInputStream("c:/temp/sample.dat");
			while (true) {
				int bytes = fis.read(); // eof => -1 반환.
				if (bytes == -1) {
					break;
				}
				System.out.println(bytes);
			}
			fis.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("end of file");
	}

	static void write() {

		// 바이트 출력 스트림.
		try {
			FileOutputStream fos = new FileOutputStream("c:/temp/sample.dat");
			fos.write(10);
			fos.write(20);
			fos.write(30);
			fos.flush();
			fos.close(); // 자원환원.

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
