package javaTraining;

public class MethodAssignment {
	//1.Write a program to print the sum of two numbers entered by user by defining your own method.
	
	public int add(int a, int b) {
		int c = a + b;
		System.out.println("Print the sum of two numbers  " + c);
		return c;
	}
	
	//2. Define a method that returns the product of two numbers entered by user.
	
	public int multiply(int m, int n) {
		int o = m * n;
		System.out.println("Print the product of two numbers  " + o);
		return o;
	}
	//3.Write a program to print the circumference and area of 
	//a circle of radius entered by user by defining your own method.
	
	public static final double r = 5.5;
	
	public void circumference() {
	

    double perimeter = 2 * Math.PI * r;
    double area = Math.PI * r * r;

    System.out.println("Perimeter is = " + perimeter);
    System.out.println("Area is = " + area);
	}
	
	//4. Define two methods to print the maximum and the 
	//minimum number respectively among three numbers entered by user.
	
	public int max() {
		int m1 = 8800;
		int m2 = 600;
		int m3 = 400;
		
		if(m1>m2 && m1>m3) {
			System.out.println(m1 + " M1 is the greatest number");
		}
		else if(m2>m1 && m2>m3) {
			System.out.println(m2 + " M2 is the greatest nuber");
		}
		else if(m3>m1 && m3>m2) {
			System.out.println(m3 + " M3 is the greatest sumber");
		}
		else {
			System.out.println("");
		}
		return 0;	
	}
	
	public int min() {
		int m1 = 8800;
		int m2 = 600;
		int m3 = 400;
		
		if(m1<m2 && m1<m3) {
			System.out.println(m1 + " M1 is the lowest number");
		}
		else if(m2<m1 && m2<m3) {
			System.out.println(m2 + " M2 is the lowest nuber");
		}
		else if(m3<m1 && m3<m2) {
			System.out.println(m3 + " M3 is the lowest sumber");
		}
		else {
			System.out.println("");
		}
		return 0;	
	}
	
	//5. Define a program to find out whether a given number is even or odd.
	
	public int num() {
		int n1 = 200;
		
		if(n1%2==0) {
			System.out.println(n1 + " is even number");
		}
		else {
			System.out.println(n1 + " is odd number");
		}
		return n1;
		
	}
	
	
	public static void main(String[] args) {
	
		MethodAssignment ob = new MethodAssignment();
		ob.add(10, 20);
		ob.multiply(100, 500);
		ob.circumference();
		ob.max();
		ob.min();
		ob.num();
	}
}
