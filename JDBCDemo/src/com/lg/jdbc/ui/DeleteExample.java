package com.lg.jdbc.ui;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import java.sql.Statement;
public class DeleteExample {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		 Driver d=new com.mysql.cj.jdbc.Driver();
	      DriverManager.registerDriver(d);
	      Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","M@@ri1312");
	      PreparedStatement ps=conn.prepareStatement("delete from employee where empid=102;");
	      int count=ps.executeUpdate();
	      if(count>0) {
	    	  System.out.println("data is deleted succesfully");
	      }
	      ps.close();
	      conn.close();
	}

}