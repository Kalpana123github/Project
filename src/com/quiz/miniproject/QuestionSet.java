package com.quiz.miniproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class QuestionSet {

	Connection con=null;
	PreparedStatement ps=null;
	int queNo;
	String question;
	String answer;
	
	public Connection getconnection()  throws Exception{
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz_project","root","root");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	//SELECT EXISTS(SELECT * FROM yourTableName WHERE yourCondition);
	
	public void getInsert() throws Exception{
		String k="SELECT EXISTS(SELECT * FROM question WHERE queNo)";
		
		
		
		try {
			getconnection();
		ps=con.prepareStatement("truncate question");
		ps.execute();
		ps=con.prepareStatement("insert into question(queNo,question,answer)values(?,?,?)");
		ps.setInt(1,1);
		ps.setString(2,"Which of the following is not a java feature?");
		ps.setString(3, "use of pointer");
		ps.execute();
		ps.setInt(1, 2);
		ps.setString(3,"Which of the following is not a OOPS concept in java?");
		ps.setString(3,"Compilation");
		ps.execute();
		ps.setInt(1,3);
		ps.setString(2,"Which exception is thrown when java is out of memory?");
		ps.setString(3, "OutOfMemoryError");
		ps.execute();
		ps.setInt(1,4);
		ps.setString(2,"Which of these keyword is used to define interfaces in java?");
		ps.setString(3, "interface");
		ps.execute();
		ps.setInt(1,5);
		ps.setString(2,"Which of the following is a superclass of every class in java?");
		ps.setString(3, "Object Class");
		ps.execute();
		ps.setInt(1,6);
		ps.setString(2,"Which of the following is not an access modifier?");
		ps.setString(3, "void");
		ps.execute();
		ps.setInt(1,7);
		ps.setString(2,"Which of the following is a marker interface?");
		ps.setString(3, "Remote Interface");
		ps.execute();
		ps.setInt(1,8);
		ps.setString(2,"Which of the is a mutable class in java?");
		ps.setString(3, "java.lang.StringBuilder");
		ps.execute();
		ps.setInt(1,9);
		ps.setString(2,"Which keyword is used for accessing the features of the package?");
		ps.setString(3, "import");
		ps.execute();
		ps.setInt(1,10);
		ps.setString(2,"Which of the following is not a java keyword?");
		ps.setString(3, "then");
		ps.execute();
	
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
				
		
		
	}
	public static void main(String[] args) {
		QuestionSet ques=new QuestionSet();
		try {
			ques.getInsert();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
