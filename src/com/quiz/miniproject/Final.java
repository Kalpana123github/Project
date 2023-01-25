package com.quiz.miniproject;

import java.util.Scanner;

public class Final {
	
	Question app=new Question();
	
	public static void main(String[] args){
		try {
			QuestionSet que=new QuestionSet();
			que.getInsert();
			Student stu=new Student();
			Scanner sc=new Scanner(System.in);
			System.out.println("--------------------Online EXamination System--------------------");
			
			Thread.sleep(500);
			System.out.println("Enter your Details first");
			Thread.sleep(500);
			System.out.println("Enter your Roll Number");
			stu.Roll_No=sc.nextInt();
			Thread.sleep(500);
			System.out.println("Enter your Name ");
			stu.Student_Name=sc.next();
			Thread.sleep(500);
			System.out.println("                                                               ");
			System.out.println("Welcome  "+stu.Student_Name+",");
			Thread.sleep(500);
			String str="Rules and Regulations for exam\na)You must use a functioning webcam and microphone\nb)No cell phones or other secondary devices in the room or test area"
					+ "\nc)No one else can be in the room with you\nd)No dual screens/monitors\ne)No use of additional applications or internet";
			System.out.println(str);
			Thread.sleep(500);
			System.out.println("********************************ALL THE BEST********************************");
			Thread.sleep(500);
			System.out.println("--------------------------------------------------------------------------------------------");
			Thread.sleep(500);
			stu.getInsert();
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
