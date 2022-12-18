package com.bridgelabz.datastructurealgorithm;

public class PrimeNumbersList {

	public static void findPrimeNumbers() {
		int temp = 0;
		// i is a number to search prime number or not.
		for (int i = 1; i <= 1000; i++) {
			for (int j = 2; j <= i - 1; j++) {
				if (i % j == 0) {
					temp++;			//temp value increement.
				}
			}
			/*
			 * if condition for temp value is 0 then it print prime number
			 */
			if (temp == 0) {
				System.out.println(i);		
			} else {
				temp = 0;
			}
		}
	}
			//main function
	public static void main(String[] args) {
		//method calling
		findPrimeNumbers();
	}

}
