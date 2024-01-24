package com.yedam.interfaces;

public class DataExe {
	public static void main(String[] args) {
		// Mysql vs Oracle
		// MysqlDB mysql = new MysqlDB();
		DAO dao = new OracleDB();
		int menu = 0;
		
		if (menu == 1) {
			//mysql.insert();
			//Oracle.add();
			dao.insert();
		} else if (menu == 2) {
			//mysql.update();
			//Oracle.modify();
			dao.update();
		} else if (menu == 3) {
			//mysql.delete();
			//Oracle.remove();
			dao.delete();
		}
	}
}
