package com.mphasis.myutils;

import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;


public class MyUtility {
	
	private static Connection con = null;
	private static DataSource mydataSource;
	
	

public static DataSource getMydataSource() {
		return mydataSource;
	}

	public static void setMydataSource(DataSource mydataSource) {
		MyUtility.mydataSource = mydataSource;
	}

	//	public static Connection getConnection() {
////		String url="jdbc:mysql://localhost:3306/mphasis";
////		String user="root";
////		String pass="root";
//		try {
////			Class.forName("com.mysql.jdbc.Driver");
//			if(con==null) {
//				con = getMydatasource().getConnection();
//			}} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			System.out.println(con);
//			return con;
//		
//	}
	private static SessionFactory mySessionFactory;

	public static SessionFactory getMySessionFactory() {
		return mySessionFactory;
	}

	public static void setMySessionFactory(SessionFactory mySessionFactory) {
		MyUtility.mySessionFactory = mySessionFactory;
	}

}
