import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
	}

	public static void q1() {
		//Write question 1 code here
		System.out.print("In: ");
		Scanner a = new Scanner(System.in);
		String input = a.nextLine();
		if (input.length() > 0) {
			System.out.println(input.charAt (0));
		} else {
			System.out.println();
		}
	}


	public static void q2() {
		//Write question 2 code here
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("In: ");
		boolean joe = s.nextBoolean();
		boolean b = !joe;
		System.out.println(b);

		s.close();

	}

	public static void q3() {
		//Write question 3 code here
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("In: ");
		int number = s.nextInt();
		boolean numberIsGreaterThanFive = (number > 5);
		System.out.println(numberIsGreaterThanFive);
		
		s.close();
	}

	public static void q4() {
		//Write question 4 code here
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("In: ");
		if(s.hasNextDouble()) {
			double number2 = s.nextDouble();
			boolean result = (number2 >= -2) && (number2 <= 2);
			System.out.println(result);
		
		} else {
			System.out.println("false");
		}
		s.close();
	}

	public static void q5() {
		//Write question 5 code here
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("In: ");
		String input = s.nextLine();
		boolean result = input.equals("Hello World");
		System.out.println(result);
		s.close();
	}

	public static void q6() {
		//Write question 6 code here
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("In: ");
		int firstInt = s.nextInt();

		System.out.print("In: ");
		int secondInt = s.nextInt();

		boolean result = (firstInt <= secondInt);
		System.out.println(result);
		s.close();
	}

	public static void q7() {
		//Write question 7 code here
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("In: ");
		double firstDouble = s.nextDouble();

		System.out.print("In: ");
		double secondDouble = s.nextDouble();

		System.out.println(firstDouble > secondDouble);
		s.close();
	}

}
