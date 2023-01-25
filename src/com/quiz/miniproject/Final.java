package com.quiz.miniproject;

import java.util.Scanner;

public class Final {
	
	Question app=new Question();
	
	public static void main(String[] args) throws Exception {
		try {
			Student stu=new Student();
			Scanner sc=new Scanner(System.in);
			System.out.println("--------------------Online EXamination System--------------------");
			
			
			System.out.println("Enter your Details first");
			
			System.out.println("Enter your Roll Number");
			stu.Roll_No=sc.nextInt();
			
			System.out.println("Enter your Name ");
			stu.Student_Name=sc.next();
			
			System.out.println("                                                               ");
			System.out.println("Welcome  "+stu.Student_Name+",");
			
			String str="Rules and Regulations for exam\na)You must use a functioning webcam and microphone\nb)No cell phones or other secondary devices in the room or test area"
					+ "\nc)No one else can be in the room with you\nd)No dual screens/monitors\ne)No use of additional applications or internet";
			System.out.println(str);
			
			System.out.println("********************************ALL THE BEST********************************");
			
			System.out.println("--------------------------------------------------------------------------------------------");
			Thread.sleep(500);
			stu.getInsert();
			
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

}
