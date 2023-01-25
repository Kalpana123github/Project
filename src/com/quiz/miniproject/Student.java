package com.quiz.miniproject;

import java.sql.*;
import java.util.Scanner;

public class Student {
	
	Question que=new Question();
	int Marks=que.getMarks();
	int Roll_No;
	String Student_Name;
	Connection con=null;
	PreparedStatement ps=null;
	int select;
	Scanner sc=new Scanner(System.in);
	Display dis=new Display();
	
	public Connection getconnection()  throws Exception{
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz_project","root","root");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public void getInsert() throws Exception{
		
		try {
			getconnection();
		ps=con.prepareStatement("insert into result(Roll_No,Student_Name,Marks,Grade)values(?,?,?,?)");
		ps.setInt(1,Roll_No);
		
		ps.setString(2, Student_Name);
		
		que.quizSet();
		ps.setInt(3,que.getMarks());
		ps.setString(4, que.Grade);
		ps.executeUpdate();
		Thread.sleep(1000);
		System.out.println("Record Added...");
		Thread.sleep(50);
		System.out.println("Please press 1 for answerkey");
		select=sc.nextInt();
		if(select==1) {
		System.out.println("Check Answerkey and verify your answers");
		System.out.println("**************************************************************");
		
		dis.getQuestion();
		}
		else {
			System.out.println("Thank You...!");
			Thread.sleep(500);
		}
		
		System.out.println("----------Admin Login----------");
		
		System.out.println("Enter UserName");
		String username=sc.next();
		
		System.out.println("Enter Password");
		String pwd=sc.next();
		
		
		if(username=="admin"&&pwd=="admin@123") {
		System.out.println("Please press 1 for answerkey");
		select=sc.nextInt();
		
		System.out.println("**************************************************************");
		System.out.println("Student List with Grade....!");
		
		dis.getStudent();
		}
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if(ps!=null&&con!=null) {
				try {
					ps.close();
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
			}
		}
		
	
	}

	
}
