package com.lg.jdbc.ui;
import java.sql.*;
import java.util.Scanner;
public class Corona {

	public static void main(String[] args) throws SQLException {
		Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","M@@ri1312");
		PreparedStatement ps=conn.prepareStatement("insert into coronavirus values(?,?,?);");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++) {
		System.out.println("enter dno");
		int dno=sc.nextInt();
		System.out.println("enter dname");
		String dname=sc.next();
		System.out.println("enter pcount");
		int pcount=sc.nextInt();
		ps.setInt(1,dno); 
		ps.setString(2,dname);
		ps.setInt(3,pcount);
		int count=ps.executeUpdate();
		if(count>0) {
			System.out.println("data updated succesfully");
		}
		}
		sc.close();
		ps.close();
		conn.close();

	}

}
