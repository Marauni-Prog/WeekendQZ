package Methods;

public class Methodsmore {
	public static void main(String[] args) {
//		printSalesCommision();
//		printNumbers(500,22,10);
		sumSeries(19);
	}
//	(Financial application: compute commissions) Write a method that computes the
//	commission, using the scheme in Programming Exercise 5.39. The header of the
//	method is as follows:
//	public static double computeCommission(double salesAmount) 

	public static void printSalesCommision() {
		System.out.printf("%10s%15s\n", "SALES", "COMMISION");
		double commission = 0;
		for (int i = 10000; i <= 100000; i += 5000) {
			commission = commissionCalc(i);
			System.out.printf("%10d%15.2f\n", i, commission);
		}
	}

	public static double commissionCalc(double sales) {
		double commision = 0.0;
		if (sales > 0 && sales <= 5000) {
			commision += getBand1(sales);
		} else if (sales > 5000 && sales <= 10000) {
			commision += (getBand1(5000) + getBand2(sales - 5000));

		} else {
			commision += (getBand1(5000) + getBand2(5000) + getBand3(sales - 10000));
		}
		return commision;
	}

	public static double getBand1(double balance) {
		return balance * 6 / 100;
	}

	public static double getBand2(double balance) {
		return balance * 8 / 100;
	}

	public static double getBand3(double balance) {
		return balance * 0.1;
	}

//	(Display numbers) Write a method that prints numbers using the following header:
//		public static void printNumbers(int num1, int num2, int
//		number Per Line)
//		This method prints the characters between num1 and num2 with the specified
//		numbers per line. Write a test program that prints ten characters per line from 1
//		to 100. Numbers are separated by exactly one space.
	public static void printNumbers(int num1, int num2, int numberPerLine) {
		if (num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		int count = 1;
		for (int i = num1; i <= num2; i++) {
			System.out.printf("%d ", i);
			if (count % numberPerLine == 0) {
				System.out.println();
			}
			count++;
		}
		System.out.println();
	}
//	(Sum series) Write a method to compute the following series:
//		1
//		 2
//		 i
//		m(i) =
//		 3
//		 + 4
//		 + g +
//		 i + 2
//		Write a test program that displays the following table:
	public static void sumSeries(int number) {
		
		System.out.printf("%s%15s\n", "I","m(i)");
		System.out.println("_".repeat(16));
		for(int i=1;i<=number;i++) {
		System.out.printf("%d%15.4f\n",i,m(i));
		}
		System.out.println();
		
	}
	public static double m(int number) {
		double sum=0.0;
		for(int i=1;i<=number;i++) {
			sum+=((double)i/(double)(i+2));//must cast to double unless answer will be 0;
		}
		return sum;
	}
}
