package com.lg.jdbc.ui;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.Driver;

public class Emp12 {

	public static void main(String[] args) throws SQLException{
		
		Driver d=new com.mysql.cj.jdbc.Driver();
	      DriverManager.registerDriver(d);
	      Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","M@@ri1312");
	      PreparedStatement ps=conn.prepareStatement("update employee set salary=? where salary=?;");
	      Scanner sc=new Scanner(System.in);
	      System.out.println("please enter  sal ");
	     // String name=sc.nextLine();
	      int salary=sc.nextInt();
	      System.out.println("please enter new sal");
	      int nsalary=sc.nextInt();
	     // int empid=sc.nextInt();
	     // ps.setString(1,name);
	      ps.setInt(1,salary);
	      ps.setInt(2,nsalary);
	      int count=ps.executeUpdate();
	      if(count>0) {
	    	  System.out.println("data is updated succesfully");
	      }
	      ps.close();
	      conn.close();

	}

}
