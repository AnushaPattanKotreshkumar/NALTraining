package javaTraining;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayAndArrayListAssignment {

	public static void main(String[] args) {
		
		// Array Assignment
		
		/* Question 1: Write a program to print the following pattern using for loop:
			00 01 02 03 04 05 06 07 08 09 
			10 11 12 13 14 15 16 17 18 19 
			20 21 22 23 24 25 26 27 28 29 
			30 31 32 33 34 35 36 37 38 39 
		 */
		
		System.out.println("<----------------------Array Assignment---------------------->");
		System.out.println("<------------Array Assignment 1------------>");
		for (int a=0;a<4;a++) {
			for (int b=0;b<10;b++) {
				System.out.print(a+""+b+" ");
			}
			System.out.println();
		}
		
		/* Question 2: Write a program to create a static Array, having following cricket data:
			--name, age, team name, DOB, gender, Strike Rate
			--Try to create multiple Object Arrays for different players 
			--Try to print all the values of each player on the console
		 */
		
		System.out.println("<------------Array Assignment 2------------>");
		Object player1[] = new Object[6];
		player1[0] = "Virat Kohli";
		player1[1] = 28;
		player1[2] = "Team India";
		player1[3] = "01/01/1991";
		player1[4] = 'M';
		player1[5] = 50.55;
		
		Object player2[] = new Object[6];
		player2[0] = "Kane Williamson";
		player2[1] = 29;
		player2[2] = "Team New Zealand";
		player2[3] = "05/29/1992";
		player2[4] = 'M';
		player2[5] = 49.25;
		
		Object player3[] = new Object[6];
		player3[0] = "Eion Morgan";
		player3[1] = 32;
		player3[2] = "Team England";
		player3[3] = "07/11/1995";
		player3[4] = 'M';
		player3[5] = 40.39;
		
		//System.out.println(player1.toString()); //Getting error [Ljava.lang.Object;@15db9742
		//System.out.println(player2.toString()); //Getting error [Ljava.lang.Object;@6d06d69c
		//System.out.println(player3.toString()); //Getting error [Ljava.lang.Object;@7852e922
		
		System.out.println("<-----Player 1------->");
		for (int c=0;c<player1.length;c++) {
			System.out.println(player1[c]);
		}
		
		System.out.println("<-----Player 2------->");
		for (int d=0;d<player2.length;d++) {
			System.out.println(player2[d]);
		}
		
		System.out.println("<-----Player 3------->");
		for (int e=0;e<player3.length;e++) {
			System.out.println(player3[e]);
		}
		
		/* Question 3: Try to print the following pattern on the console:
			n = 4
			n = 3
			n = 2
			n = 1
			n = 0
		 */
		
		System.out.println("<------------Array Assignment 3------------>");
		for (int f=4;f>=0;f--) {
			System.out.println("n = "+f);
		}
		
		System.out.println("<----------------------Array Assignment---------------------->");
		System.out.println("<------------ArrayList Assignment 1------------>");
		
		// ArrayList Assignments
		
		// 1. Write a Java program to create a new array list, add some colors (string) and print out the collection
		
		ArrayList<String> colors = new ArrayList<String>();
		
		colors.add("Violet");
		colors.add("Indigo");
		colors.add("Blue");
		colors.add("Green");
		colors.add("Yellow");
		colors.add("Orange");
		colors.add("Red");
		
		for (String g : colors) {
			System.out.println(g);
		}
		
		System.out.println("<------------ArrayList Assignment 2------------>");
		
		// 2. Write a Java program to insert an element into the array list at the first and last positions.
		colors.add(0, "Black");
		colors.add(colors.size(), "Pink");
		
		for (String g : colors) {
			System.out.println(g);
		}
		
		System.out.println("<------------ArrayList Assignment 3------------>");
		
		// 3. Write a Java program to retrieve an element (at a specified index) from a given array list.
		
		System.out.println(colors.get(0));
		System.out.println(colors.get(3));
		
		System.out.println("<------------ArrayList Assignment 4------------>");
		
		// 4. Write a Java program to update specific array element by given element.
		
		colors.set(3, "Sky Blue");
		System.out.println(colors.get(3));
		
		System.out.println("<------------ArrayList Assignment 5------------>");
		
		// 5. Write a Java program to remove the third element from a array list. 
		
		ArrayList<String> animals = new ArrayList<String>();
		
		animals.add("Tiger");
		animals.add("Lion");
		animals.add("Giraffe");
		animals.add("Buffalo");
		animals.add("Zebra");
		animals.add("Cheetah");
		animals.add("Deer");
		
		System.out.println("<-----Before deleting 3rd element------->");
		for (String g : animals) {
			System.out.println(g);
		}
		
		animals.remove(2); //3rd element has index of 2
		
		System.out.println("<-----After deleting 3rd element------->");
		for (String g : animals) {
			System.out.println(g);
		}
		
		System.out.println("<------------ArrayList Assignment 6------------>");
		
		// 6. Write a Java program to search an element in a array list.
		
		String an = "Zebra";
		if (animals.contains(an) == true) {
			System.out.println(an+" is in the ArrayList");
		}
		else {
			System.out.println(an+" is not in the ArrayList");
		}
		
		System.out.println("<------------ArrayList Assignment 7------------>");
		
		// 7. Write a Java program to reverse elements in a array list
		
		System.out.println("<-----Before revering------->");
		for (String g : animals) {
			System.out.println(g);
		}
		
		System.out.println("<-----After revering------->");
		Collections.reverse(animals);
		for (String g : animals) {
			System.out.println(g);
		}
		
		System.out.println("<------------ArrayList Assignment 8------------>");
		
		// 8. Write a Java program to extract a portion of a array list.
		
		List<String> anm = animals.subList(0,2);
		for (String g : anm) {
			System.out.println(g);
		}
		
		System.out.println("<------------ArrayList Assignment 9------------>");
		
		// 9. Write a Java program of swap two elements in an array list.
		
		System.out.println("<-----Before swap------->");
		for (String g : animals) {
			System.out.println(g);
		}
		
		System.out.println("<-----After swap------->");
		Collections.swap(animals, 1, 3);
		for (String g : animals) {
			System.out.println(g);
		}
		
		System.out.println("<------------ArrayList Assignment 10------------>");
		
		// 10. Write a Java program to empty an array list.
		
		animals.clear();
		System.out.println("ArrayList is empty --> "+animals.isEmpty());
		
		System.out.println("<------------ArrayList Assignment 11------------>");
		
		// 11. Write a Java program to trim the virtual capacity of an array list the current list size.
		
		ArrayList<String> petAnimals = new ArrayList<String>();
		
		petAnimals.add("Cat");
		petAnimals.add("Dog");
		petAnimals.add("Bird");
		petAnimals.add("Monkey");
		petAnimals.add("Pig");
		
		System.out.println("<-----Adding element to ArrayList will reduce Virtual Capacity------->");
		System.out.println("<-----Before adding------->");
		for (String g : petAnimals) {
			System.out.println(g);
		}
		
		System.out.println("<-----After adding------->");
		petAnimals.add("Guinea Pig");
		
		for (String g : petAnimals) {
			System.out.println(g);
		}
		
		System.out.println("<------------ArrayList Assignment 12------------>");
		
		//12. Write a Java program to print all the elements of a ArrayList using the position of the elements
		
		for (int h=0;h<petAnimals.size();h++) {
			System.out.println(petAnimals.get(h));
		}
	}

}