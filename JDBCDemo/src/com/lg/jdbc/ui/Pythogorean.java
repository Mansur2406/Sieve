package com.lg.jdbc.ui;

import java.util.Scanner;
import java.lang.Math;

public class Pythogorean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int x,y,z;
       Scanner scan=new Scanner(System.in);
       x=scan.nextInt();
       y=scan.nextInt();
       int nx=x*x;
       int ny=y*y;
       z=(int)Math.sqrt(nx+ny);
       System.out.println("distance from school to home is:"+z);
      // System.out.println(Math.sqrt(x));
      // System.out.println(Math.sqrt(y));
	}

}
