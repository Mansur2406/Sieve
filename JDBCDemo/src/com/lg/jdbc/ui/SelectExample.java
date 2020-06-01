package com.lg.jdbc.ui;
import java.sql.*;
public class SelectExample {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
     Driver d=new com.mysql.cj.jdbc.Driver();
      DriverManager.registerDriver(d);
      Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","M@@ri1312");
      Statement st=conn.createStatement();
      String que="select * from employee;";
      ResultSet rs=st.executeQuery(que);
       while(rs.next())
       {
    	   int id=rs.getInt("empid");
    	   String salary=rs.getString("salary");
    	   System.out.println(id+","+salary);
    	   }
       }

}
