package com.quiz.miniproject;

/* This class also contains main method why?
 * Unused class 
 * 
 */
public class Marks {

	
		int marks=00;
		public void DisplayResult() {
			
			if(marks>=8 && marks<=10) {
				System.out.println("class A");
			}
			else if(marks>=6 && marks<=8) {
				System.out.println("class B");
			}
			else if(marks==5) {
				System.out.println("class C");
			}
			else if (marks<5){
				System.out.println("Fails");
			}
			
		}
		public static void main(String[] args) {
			
			Marks D1 = new Marks();
			D1.DisplayResult();
			
		}

	}


