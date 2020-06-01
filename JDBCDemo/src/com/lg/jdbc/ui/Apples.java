package com.lg.jdbc.ui;

import java.util.Scanner;

public class Apples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a,b;
       Scanner scan=new Scanner(System.in);
       a=scan.nextInt();
       b=scan.nextInt();
        
       if(a==b+2) {
    	   System.out.println("true");
    	   System.out.println(--a);
       }
    	   else {
    		   System.out.println("false");
    		   System.out.println(Math.abs(a-b));
    		   
    	   }
       }
	}

