package com.iom.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class db_getConnect {
	public static String username;
	public static String password;

	public db_getConnect() {
	}

	public db_getConnect(String userName, String passWord) {
		username = userName;
		password = passWord;
	}

	// ͨ����¼���������������ݿ�
	public static Connection getConnection() throws Exception {
		// JDBC������
		String drivername = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		// JDBCURL
		String dburl = "jdbc:sqlserver://localhost:50218;DatabaseName=access_system";
		// �������ݿ�����
		Class.forName(drivername);
		// ��ȡ���ݿ�����
		Connection con = DriverManager.getConnection(dburl, username, password);
		System.out.println("���ӳɹ�");
		return con;
	}

}
