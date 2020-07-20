package javaTraining;

public class DataTypesAssignment1 {

	public static void main(String[] args) {
	
	//1. Write a Java program to print 'Hello' on screen and 
	//then print your name on a separate line.

	System.out.println("Hello");
	System.out.println("Naveen K");
	
	//2. Write a Java program to print the sum of two numbers.
	
	int i = 74;
	int j = 36;
	System.out.println(i+j);

	//3. Write a Java program to divide 
	//two numbers and print on the screen.
	
	int a = 50;
	int b = 3;
	int c = a/b;
	System.out.println(c); 
	
	//4. Write a Java program to print the result of the following operations.
	//Change your test data accordingly.
	
	//a. 5 + 8 * 6
	int x = -5;
	int y = 8;
	int z = 6;
	System.out.println(x + y * z);
	
	//b.(55+9) % 9
	int h1 = 55;
	int h2 = 9;
	System.out.println((h1 + h2) % h2);
	
	//c. 20 + -3*5 / 8
	//System.out.println(20 + -3*5 / 8);
	//OR
	int m = 20;
	int n = (-3*5);

	System.out.println(m + n / y);
	
	//d. 5 + 15 / 3 * 2 - 8 % 3
	int i1 = 5;
	int i2 = 15;
	int i4 = 2;
	int i6 = (i1 + i2 / b * i4 - y % b);
	System.out.println(i6);

//5. Write a Java program to compute the specified expressions and print the output. Go to the editor
	double f1 = 25.5d;
	double f2 = 3.5d;
	double f3 = 40.5d;
	double f4 = 4.5d;
	double f5 = ((f1 * f2 - f2 * f2) / (f3 - f4));
	System.out.println(f5);
	
	
//	6. Try to concatenate "Hello Selenium" with a character 't'.
	String s1 = "Hello";
	String s2 = "Selenium";
	char c1 = 't';
	System.out.println((s1 + " " + s2) + " " + c1);
	
	
//	7. Create three int variables having values like : 100, 200, 3400. Add them and concatenate and generate this output String :
//	"Your Total amount is. 3700".
	int g1 = 100;
	int g2 = 200;
	int g3 = 3400;
	int g4 = (g1 + g2 + g3);
	System.out.println("Your Total amount is. " + g4);

//	8. What should be the output for :

	byte b3 = 065;
	System.out.println(b3);
	
	
	}

}
