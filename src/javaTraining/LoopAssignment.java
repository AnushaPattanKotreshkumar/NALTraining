package javaTraining;

public class LoopAssignment {

public static void main(String[] args) {
		
		/*
		 * 1. WAP to print following output:
				I am Batman
				I am Batman
				I am Batman
				I am Batman
				I am Batman
		 */
		
		System.out.println("<------------Assignment 1------------>");
		String batman="I am Batman";
		
		for(int i=0;i<5;i++) {
			System.out.println(batman+"\n");
		}
		
		/*
		 * 2. WAP to print following output:
				I am Batman 1
				I am Batman 2
				I am Batman 3
				I am Batman 4
				I am Batman 5
				I am Batman 6
				I am Batman 7
				I am Batman 8
				I am Batman 9
		 */
		System.out.println("         ");
		System.out.println("<------------Assignment 2------------>");
		System.out.println("         ");
		
		for(int j=1;j<10;j++) {
			System.out.println(batman+" "+j+"\n");
		}
		
		// 3. WAP to print 10 to 1 using for, while and do-while loop
		
		System.out.println("         ");
		System.out.println("<------------Assignment 3------------>");
		System.out.println("<-----For Loop----->");
		System.out.println("         ");
		for(int n=10;n>=1;n--) {
			System.out.println(n);
		}
		
		System.out.println("<-----While Loop----->");
		System.out.println("         ");
		int k=10;
		while (k>=1) {
			System.out.println(k);
			k--;
		}
		
		System.out.println("<-----Do-While Loop----->");
		System.out.println("         ");
		int l=10;
		do
		{
			System.out.println(l);
			l--;
		}
		while (l>=1);
		
		//4. Write a program in Java to print "Hello World" ten times using while loop
		System.out.println("         ");
		System.out.println("<------------Assignment 4------------>");
		System.out.println("         ");
		int m=1;
		while (m<=10) {
			System.out.println("Hello World");
			m++;
		}
		
		/* 
		 * 5. Write a program in Java to print 1 to 10 using while 
		*loop but quit if multiple of 7 is encountered
		*/
		System.out.println("         ");
		System.out.println("<------------Assignment 5------------>");
		System.out.println("         ");
		int p=1;
		while(p<=10) {
			System.out.println(p);
			if(p%7==0) {
				break;
			}
			p++;
		}
			

	}

}
