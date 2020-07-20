package javaTraining;

public class MethodAssignment1 {
	/*
	*6. A person is elligible to vote if his/her age is
	*greater than or equal to 18. Define a method to find out if he/she is elligible to vote
	*/
	
		
public int vote() {
	int age = 18;
	
	if(age>=18) {
		System.out.println("Elligible to vote");
	}
	else
	{
		System.out.println("Not Elligible to vote");
	}
	return age;	
}

//7. Define a method to find out if number is prime or not.



	public static void main(String[] args) {
		
		MethodAssignment1 m1 = new MethodAssignment1();
		m1.vote();
	}

}
