package arraysq_z;

import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		showScores();
		int[]num= {1,2,3,4,5,6,7,8,9,10};
		showReversed(num);
		showOccurances(10);
//		System.out.println(Math.r(5/2));
	}
//	(Assign grades) Write a program that reads student scores, gets the best score, and
//	then assigns grades based on the following scheme:
//	Grade is A if score is > best -5;
//	Grade is B if score is > best -10;
//	Grade is C if score is > best -15;
//	Grade is D if score is > best -20;
//	Grade is F otherwise.
//			The program prompts the user to enter the total number of students, and then
//	prompts the user to enter all of the scores, and concludes by displaying the grades.
	public static int getBestScore(int[] scores) {
		int bestScore = scores[0];
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] > bestScore) {
				bestScore = scores[i];
			}
		}
		return bestScore;
	}

	public static void getGrades(int[]scores) {
		int best=getBestScore(scores);
		for(int i=0;i<scores.length;i++) {
			if(scores[i]>=(best-5)) {
				System.out.printf("%s %d %s %d %s\n","Student" 
						,i, "score is" ,scores[i] ,"and grade is A");
			}else if(scores[i]>=(best-10)) {
				System.out.printf("%s %d %s %d %s\n","Student" 
						,i, "score is" ,scores[i] ,"and grade is B");
			}else if(scores[i]>=(best-15)) {
				System.out.printf("%s %d %s %d %s\n","Student" 
						,i, "score is" ,scores[i] ,"and grade is C");
			}else if(scores[i]>=(best-20)) {
				System.out.printf("%s %d %s %d %s\n","Student" 
						,i, "score is" ,scores[i] ,"and grade is D");
			}else {
				System.out.printf("%s %d %s %d %s\n","Student" 
						,i, "score is" ,scores[i] ,"and grade is F");
			}
		}
		
	}
	
	public static void showScores() {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter number of students");
			int num=scanner.nextInt();
			int[] students = new int[num];
			for(int i=0;i<students.length;i++) {
				System.out.println("ENTER SCORE OF STUDENT "+i);
				students[i]=scanner.nextInt();
			}
			getGrades(students);
		}
	}
//	(Reverse the numbers entered) Write a program that reads 10 integers then dis-
//	plays them in the reverse of the order in which they were read.
	public static void reverse(int[]num) {
//		int[]reversed= new int[num.length];
		for(int i=0;i<=num.length/2;i++) {
			int temp=num[i];
			num[i]=num[(num.length-1)-i];
			num[(num.length-1)-i]=temp;
		}
		
	}
	public static void showReversed(int []num) {
		System.out.println("ORIGINAL ARRAY");
		for(int i=0;i<num.length;i++) {
			System.out.printf("%d ", num[i]);
		}
		System.out.println();
		reverse(num);
		System.out.println("REVERSED ARRAY");
		for(int i=0;i<num.length;i++) {
			System.out.printf("%d ", num[i]);
		}
		System.out.println();
		
	}
//	(Count occurrence of numbers) Write a program that reads the integers between 1
//	and 50 and counts the occurrences of each. Assume the input ends with 0. Here is
//	a sample run of the program.
	public static int[] countOccurence(int[]numbers) {
		int[]occurance= new int[numbers.length];
		for(int i=0;i<numbers.length;i++) {
			for(int j=0;j<numbers.length;j++) {
				if(numbers[i]==j) {
					occurance[j]+=1;
				}
			}
		}
		return occurance;
	}
	public static int[] createNumbers(int size) {
		int[]numbers= new int[size];
		for(int i=0;i<size;i++) {
			numbers[i]=(int)(Math.random()*(size+1));
		}
		return numbers;
	}
	public static void showOccurances(int size) {
		System.out.println("Print Array");
		int[]num=createNumbers(size);
		for(int i=0;i<num.length;i++) {
			System.out.printf("%d ", num[i]);
		}
		System.out.println();
		System.out.println("Occurances of Integers in the Array");
		int []num1=countOccurence(num);
		for(int i=0;i<num1.length;i++) {
			if(num1[i]==0) {
				continue;
			}
			System.out.printf("%d %s%s %d\n", i,"-".repeat(5),">", num1[i]);
		}
		System.out.println();
		
	}
}
