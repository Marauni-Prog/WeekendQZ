package exceptionHandling;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		myMath();
	}

	public static void myMath() {
		var scan = new Scanner(System.in);
		String q = "";
		while (!q.equalsIgnoreCase("q")) {
			System.out.println("""
					Enter your arithmethic problem.
					In the format:
					 a{MADS}b
					   where a=first number;
					   b=second number;
					   MADS==multiply,Add,divide,subtract
					""");
			try {
				int a = scan.nextInt();
				String b = scan.next().toUpperCase();
				int c = scan.nextInt();
				switch (b) {
				case "M" -> System.out.println(a + " X " + c + " = " + a * c);
				case "A" -> System.out.println(a + " + " + c + " = " + a + c);
				case "D" -> System.out.println(a + " / " + c + " = " + a / c);
				case "S" -> System.out.println(a + " - " + c + " = " + (a - c));
				default -> System.out.println("PLEASE ENTER MADS");
				}

			} catch (Exception e) {
				System.out.println("Invalid input");
				scan.nextLine();
			}
			System.out.println("Enter q to quite");
			q=scan.next();
		}
	}
}
