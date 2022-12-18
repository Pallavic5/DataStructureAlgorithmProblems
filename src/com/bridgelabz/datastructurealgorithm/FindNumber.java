package com.bridgelabz.datastructurealgorithm;

import java.util.Scanner;

public class FindNumber {
	public static void find(int number) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		number = scanner.nextInt();
		int lower = 0;
		int higher = number - 1;
		System.out.println("Think a number between " + lower + " and " + higher + ".");

		while (lower <= higher) {
			int middle = (lower + higher) / 2;
			System.out.print("\n Is your number " + middle + " (y/n): ");
			String result = scanner.next();
			if (result.toLowerCase().equals("y")) {
				System.out.println("Great. thanks for playing. Your Number Found.");
				return;
			}
			
			System.out.print("Is your number less than " + middle + ": ");
			result = scanner.next();
			switch (result.toLowerCase()) {
			case "y":
				higher = middle - 1;
				break;
			case "n":
				lower = middle + 1;
				break;
			default:
				System.out.println("not valid");
			}
		}
		scanner.close();
	}

	public static void main(String[] args) {
		int number = 0;
		find(number);
	}

}
