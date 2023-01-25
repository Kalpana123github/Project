package com.quiz.miniproject;

import java.util.Scanner;

public class Question  {
		int Marks;
		String ques;
		String answer;
		String Grade;
		String k;
		
		public String getGrade() {
			return Grade;
		}
		
		public int getMarks() {
			return Marks;
		}
		
		public Question(String ques, String answer) {
			this.ques = ques;
			this.answer = answer;
		}
		public Question() {
			
		}
		
	public  void quizSet() throws Exception {
		String Q1="Which one of the following is not a Java feature?\n"
				+"a)Object-oriented\nb)Use of pointers\nc)Portable\nd)Dynamic and Extensible";
		
		String Q2="Which of the following is not an OOPS concept in Java?\n"
				+ "a)Polymorphism\nb)Inheritance\nc)Compilation\nd) Encapsulation";
		
		String Q3="Which of the following are not Java keywords?\n"
				+ "a)double\nb)switch\nc)then\nd)instanceOf\n";
				
		String Q4="Which of the following is a superclass of every class in Java?\n"
				+"a)ArrayList\nb)Abstract class\nc)Object class\nd)String\n";
		
		String Q5="Which of the following is a mutable class in java?\n"
				+ "a)java.lang.String\nb)java.lang.Byte\nc)java.lang.Short\nd)java.lang.StringBuilder\n";
		
		String Q6="Which of the following is a marker interface?\n"
				+ "a)Runnable interface\nb)Remote interface\nc)Readable interface\nd)Result interface\n";
		
		String Q7="Which keyword is used for accessing the features of a package?\n"
				+ "a)package\nb)import\nc)extends\nd)export\n";
		
		String Q8="Which one of the following is not an access modifier?\n"
				+ "a)Protected\nb)Void\nc)Public\nd)Private\n";
		
		String Q9="Which exception is thrown when java is out of memory?\n"
				+ "a)MemoryError\nb)OutOfMemoryError\nc)MemoryOutOfBoundsException\nd)MemoryFullException\n";
		
		String Q10="Which component is used to compile, debug and execute the java programs?\n"
				+  "a)JRE\nb)JIT\nc)JDK\nd)JVM";
			
	
				Question [] que= {
				new Question(Q1,"b"),
				new Question(Q2,"c"),
				new Question(Q3,"c"),
				new Question(Q4,"c"),
				new Question(Q5,"d"),
				new Question(Q6,"b"),
				new Question(Q7,"b"),
				new Question(Q8,"b"),
				new Question(Q9,"b"),
				new Question(Q10,"c"),		

		};

	
		takeTest(que);
	
}	
	
	public  void takeTest(Question [] questions) throws Exception {
			
			Scanner sc=new Scanner(System.in);
			
			for(int i=0;i<questions.length;i++) {
				System.out.println(questions[i].ques);
				String answer=sc.nextLine();
				
				if(answer.equals(questions[i].answer)) {
					Marks ++;
					
				}
				
				if(Marks>=8) {
					k="Congratulations";
					Grade="A";
				}
				else if (Marks>=6&&Marks<=8) {
					k="Congratulations";
					 Grade="B";
				}
				else if(Marks==5) {
					k="Congratulations";
					 Grade="C";
				}
				else {
					k="Oops You are Fail";
					 Grade="D";
				}
			}
			Thread.sleep(1000);
			System.out.println(k+ "..!You got"+Marks+"/"+questions.length+" Your Grade =>>"+Grade);
		}
			
		}
		
		
