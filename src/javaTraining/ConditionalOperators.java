package javaTraining;

public class ConditionalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 	1. Take four numbers from the user and print the greatest number.

				Test Data
				Input the 1st number: 25
				Input the 2nd number: 78
				Input the 3rd number: 87
				Input the 4th number: 101
				Expected Output :
				The greatest: 101
		 */
		
		System.out.println("<------------Assignment 1------------>");
		System.out.println("                 ");
		int a1=400;
		int b1=400;
		int c1=400;
		int d1=400;
		
		if(a1>b1 && a1>c1 && a1>d1) {
			System.out.println("The greatest a1: "+a1);
		}
		else if(b1>c1 && b1>d1 && b1>a1) {
			System.out.println("The greatest b1: "+b1);
		}
		else if (c1>d1 && c1>b1 && c1>a1){
			System.out.println("The greatest c1: "+c1);
		}
		else if (c1==d1 && a1==b1 && a1==c1){
			System.out.println("a1,b1,c1 and d1 are equal: "+a1);
		}
		else if(a1==b1 && a1>c1 && a1>d1) {
			System.out.println("a1 and b1 are equal and greatest: "+a1);
		}
		else if(a1==c1 && a1>d1 && a1>b1) {
			System.out.println("a1 and c1 are equal and greatest: "+a1);
		}
		else if(a1==d1 && a1>c1 && a1>b1) {
			System.out.println("a1 and d1 are equal and greatest: "+a1);
		}
		else if(b1==c1 && b1>d1 && b1>a1) {
			System.out.println("b1 and c1 are equal and greatest: "+b1);
		}
		else if(b1==d1 && b1>a1 && b1>c1) {
			System.out.println("b1 and d1 are equal and greatest: "+b1);
		}
		else if(c1==d1 && c1>a1 && c1>b1) {
			System.out.println("c1 and d1 are equal and greatest: "+b1);
		}
		else if(a1==b1 && a1==c1 && c1>d1) {
			System.out.println("a1, b1 and c1 are equal and greatest: "+a1);
		}
		else if(b1==c1 && b1==d1 && b1>a1) {
			System.out.println("b1, c1 and d1 are equal and greatest: "+b1);
		}
		else if(c1==d1 && c1==a1 && c1>b1) {
			System.out.println("c1, d1 and a1 are equal and greatest: "+c1);
		}
		else if(d1==a1 && d1==b1 && d1>c1) {
			System.out.println("d1, a1 and b1 are equal and greatest: "+d1);
		}
		else {
			System.out.println("The greatest d1: "+d1);
		}
		
		
		/*
		 * 	2. Write a Java program to check the eligibility for vote.
			if age is equal and above 18 then only you can vote else you can't.
			if you have not been living for more than 3 years, you can't vote.
		 */
		System.out.println("                 ");
		System.out.println("<------------Assignment 2------------>");
		System.out.println("                 ");
		int age=25;
		int yearsInCountry=3;
		
		if(age>=18 && yearsInCountry>=3) {
			System.out.println("Citizen can vote");
		}
		else if(age>=18 && yearsInCountry<3){
			System.out.println("Citizen cannot vote. Not in the country for 3 years");
		}
		else {
			System.out.println("Citizen is not adult and cannot vote. Citizen need to be atleast 18 years to vote.");
		}
		
		/*
		 * 	3. Maintain one Student name and do the following conditions:
				Please maintain a score number variable here.
				if student name is "Virat" then score is 100
				if student name is "Smith" then score is 90
				if student name is "Sachin" then score is 200
				if student name is "Werner" then print this player is not found
				
				Solve the same with If-ElseIf and Switch-Case statements.
		 */
		System.out.println("                 ");
		System.out.println("<------------Assignment 3------------>");
		System.out.println("                 ");
		System.out.println("<-----If Else Statemet----->");
		String studentName="Virat";
		
		if(studentName=="Virat") {
			System.out.println("Student score is 100");
		}
		else if(studentName=="Smith") {
			System.out.println("Student score is 90");
		}
		else if(studentName=="Sachin") {
			System.out.println("Student score is 200");
		}
		else {
			System.out.println("Student not found");
		}
		System.out.println("                 ");
		System.out.println("<-----Switch Statemet----->");
		
		switch (studentName) {
		case "Virat":
			System.out.println("Student score is 100");
			break;
		case "Smith":
			System.out.println("Student score is 90");
			break;
		case "Sachin": 
			System.out.println("Student score is 200");
			break;

		default:
			System.out.println("Student not found");
			break;
		}
		
				
		/*
		 * 4. Java Program to Swap Two Numbers with and without 3rd variable
		 */
		System.out.println("                 ");
		System.out.println("<------------Assignment 4------------>");
		
		System.out.println("<-----Without Using 3rd Variable----->");
		System.out.println("                 ");
		int e1=10;
		int f1=40;
		
		e1=e1+f1;
		f1=e1-f1;
		e1=e1-f1;
		
		System.out.println("E1 = "+e1);
		System.out.println("F1 = "+f1);
		
		System.out.println("<-----Using 3rd Variable----->");
		System.out.println("                 ");
		
		int g1;
		
		g1=e1;
		e1=f1;
		f1=g1;
		
		System.out.println("E1 = "+e1);
		System.out.println("F1 = "+f1);
		
		/*
		 * 5. Java Program to Check Whether a Number is Even or Odd
		 */
		System.out.println("                 ");
		System.out.println("<------------Assignment 5------------>");
		System.out.println("                 ");
		
		int h1=101;
		
		if (h1%2==0) {
			System.out.println("Number is even");
		}
		else {
			System.out.println("Number is odd");
		}
		System.out.println("                 ");
		/*
		 * 6. Java Program to Check Whether an Alphabet is Vowel or Consonant
		 */
		
		System.out.println("<------------Assignment 6------------>");
		System.out.println("                 ");
		
		char i1='b';
		
		if (i1=='a' || i1=='e' || i1=='i' || i1=='o' || i1=='u' || i1=='A' || i1=='E' || i1=='I' || i1=='O' || i1=='U') {
			System.out.println("Alphabet is Vowel");
		}
		else {
			System.out.println("Alpahet is Consonant");
		}

	}

}
