package com.quiz.miniproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/* 1 Formatting not done properly for code.
 * 2 We told to create the common connection class not to create connection each and every time.
 * 3 unwanted code are kept pls remove it.
 */
public class Display {

	Connection con = null;
	PreparedStatement ps = null;

	public void getQuestion() throws Exception {
		Student stu = new Student();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz_project", "root", "root");
			ps = con.prepareStatement("select * from question");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.print("Question no => " + rs.getInt(1));

				System.out.println("=" + rs.getString(2));

				System.out.println("Correct Answer=> " + rs.getString(3));
				// Thread.sleep(400);
				System.out.println("-------------------------------------------------------------");

			}

		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			if (ps != null && con != null) {
				try {
					ps.close();
					con.close();
				} catch (Exception e) {

					e.printStackTrace();
				}

			}
		}

	}

	public void getStudent() throws Exception {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz_project", "root", "root");
			ps = con.prepareStatement("select * from result");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println("Roll Number =>  " + rs.getInt(1));

				System.out.println("Student name=>" + rs.getString(2));

				System.out.println("obtained Marks is =>" + rs.getInt(3));

				System.out.println("Grade is =>" + rs.getString(4));

				System.out.println("-------------------------------------------------------------");
			}

		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			if (ps != null && con != null) {
				try {
					ps.close();
					con.close();
				} catch (Exception e) {

					e.printStackTrace();
				}

			}
		}

	}

}
