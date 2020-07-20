package javaTraining;

public class StringManipulation {

	public static void main(String[] args) {
		
		//1.  Write a program to check two different strings equality.
		System.out.println("<--------------Assignment 1------------->");
		System.out.println("Write a program to check two different strings equality");
		
		String str1 = "AnushaPattan";
		String str2 = "docker";
		
        System.out.println(str1.equals(str2));
		
        //2. Remove all  spaces in a String . 
        //For example  : “         Hello      Everyone       “ .     Expected result: “HelloEveryone”.
        System.out.println("<--------------Assignment 2------------->");
        System.out.println("Remove all  spaces in a String ");
        
         String str4 = "           Automation Testing        ";
         System.out.println(str4.trim().replace(" ", ""));

      
         //3. Write a program that will  print out last character and first character of a word.
         System.out.println("<--------------Assignment 3------------->");
         System.out.println("print out last character and first character of a word");
         
         String str33 = "Naveen";
        
         System.out.println(str33.substring(0, 1));
         System.out.println(str33.substring(5, 6));

         //4. Write a program to verify a word or a character contains in the sentence.
         System.out.println("<--------------Assignment 4------------->");
         System.out.println(" to verify a word or a character contains in the sentence.");
         String str11 = " Naveen Automation Labs";
         System.out.println(str11.contains("Labs"));

         //5.Write a function/ method to reverse your own name.
         System.out.println("<--------------Assignment 5------------->");
         System.out.println("a function/ method to reverse your own name");
         
         String s1="Anusha";  
         char[] ch=s1.toCharArray();  
         for(int i=ch.length-1;i>=0;i--){  
         System.out.print(ch[i]);  
         }  
         System.out.println("                       ");
         
         //6. Write a program that gives you last half of the string.
         System.out.println("<--------------Assignment 6------------->"); 
         System.out.println("program that gives you last half of the string.");
         
         String str6 = "I am Learning Automation testing";
         System.out.println(str6.substring(14));

		 //7.Write a program to get the 3rd  “ e “ of the string .
         //For example: “Welcome to Naveen Automation Lab ! “.

         System.out.println("<--------------Assignment 7------------->"); 
         System.out.println("Write a program to get the 3rd  “ e “ of the string ");
         
         String str7 = "Welcome to Naveen Automation Lab ! ";
         System.out.println(str7.indexOf('e'));

         System.out.println(str7.indexOf("e", str7.indexOf('e')+4));

		
		//8. Write a method which gives index of (-1) if string is not available. . 
		//it should return integer. if String is present, then it should return the specific index.
         System.out.println("<--------------Assignment 8------------->"); 	
         System.out.println("Write a method which gives index of (-1) if string is not available");
         
         String str3 = "Hello java;, welcome to automation testing....";
         System.out.println(str3.indexOf("docker"));

         System.out.println("return integer. if String is present, then it should return the specific index.");
         System.out.println(str3.indexOf('a'));
         System.out.println(str3.indexOf('a', 8));	
         
         
        //9. Write a program that breaks a whole string into small strings, 
         //and print out its all values . (Hint: split, loop).
         System.out.println("<--------------Assignment 9------------->");
         System.out.println("program that breaks a whole string into small strings");
         
         String str9 = "Hint: split, loop";

 		 String c1[] = str9.split(":");
         System.out.println(c1[0]);
         
         System.out.println(str9.substring(6, 11));
         System.out.println(str9.substring(13));
         
         //10. Assume that a string consists of 3 words, print out the middle one.
         System.out.println("<--------------Assignment 10------------->");
         System.out.println("print out the middle one.");
         
         String str10 = "Anusha love herself";
         System.out.println(str10.contains("love"));
 		
 		if(str10.contains("love")){
 			System.out.println("love is present....");
 		}
        System.out.println(str10.substring(7, 11));

        //11. get only numeric part from this String:
        //String s = "your transaction id is: 12345 and reference id is 34567";
        System.out.println("<--------------Assignment 11------------->");
        System.out.println("get only numeric part from this String");
        
        String s = "your transaction id is: 12345 and reference id is 34567";

		System.out.println(s.substring(s.indexOf("is")+4, s.indexOf(" and")));
		System.out.println(s.substring(50, 55));
	}

}
