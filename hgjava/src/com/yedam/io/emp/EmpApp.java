package com.yedam.io.emp;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

// 초기화(데이터 활용 컬렉션)
// 추가
// 목록
// 종료(컬렉션 -> 파일저장)
public class EmpApp {
	List<Employee> storage = new ArrayList<>(Employee);
	
	public void EmpApp() {
		init();
	}
	public void init() {
		try {
			
//			FileInputStream fis = new FileInputStream("c:/temp/emp.dat");
			File file = new File("c:/temp/emp.dat");
			if (!file.exists()) {
				file.createNewFile();
			} else {
				System.out.println(file.lastModified()/1000/60/60/24/365);
				// val/1000/60/60/24/365
			}
			
			
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			storage = (List<Employee>) ois.readObject(); // 바이트 -> 객체생성.(역직렬화)
			ois.close();
			fis.close();
		} catch (Exception e) {
			System.out.println("초기파일없음.");
		}
	}
	
	// 등록
	public boolean add(Employee emp) {
		return storage.add(emp);
	}
	
	// 목록.
	public List<Employee> list() {
		return storage;
	}
	
	public void save() {
		// 기본스트림 -> 보조스트림 -> 저장.
		try {
			FileOutputStream fos = new FileOutputStream("c:/temp/emp.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			storage = (List<Employee>) ois.readObject();
			ois.close();
			fis.close();
			oos.writeObject(storage); // 객체파일에 쓰기.
			
			oos.flush();fos.flush();
			oos.close();fos.close();
		} catch (EOFException e) {
			
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println("파일 없음.");
			
		} catch (Exception ee) {
			System.out.println("알수없는 오류.");
		}
		
	}
}
