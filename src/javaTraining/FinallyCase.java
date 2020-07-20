package javaTraining;

public class FinallyCase {

	public static int getMarks(String name) {

		if (name.equals("Tom")) {

			try {
				int i = 9 / 0;
			} catch (Exception e) {
				return -1;
			}

			finally{
				System.out.println("you can not get away from me....");
				return -10;
			}

		}

		else if (name.equals("steve")) {
			return 50;
		}

		else {
			return -1;
		}
		

	}

	public static void main(String[] args) {

		int m = getMarks("steve");
		System.out.println(m);

	}

}
