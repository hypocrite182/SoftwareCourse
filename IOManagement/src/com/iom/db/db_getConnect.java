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

	// 通过登录名和密码连接数据库
	public static Connection getConnection() throws Exception {
		// JDBC驱动名
		String drivername = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		// JDBCURL
		String dburl = "jdbc:sqlserver://localhost:50218;DatabaseName=access_system";
		// 加载数据库驱动
		Class.forName(drivername);
		// 获取数据库连接
		Connection con = DriverManager.getConnection(dburl, username, password);
		System.out.println("连接成功");
		return con;
	}

}
