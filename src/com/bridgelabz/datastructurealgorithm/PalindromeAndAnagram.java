package com.bridgelabz.datastructurealgorithm;

import java.util.ArrayList;
import java.util.List;

public class PalindromeAndAnagram {
	public static void findAnagramOrPalindrome() {
		/*
		 * this arraylist stored the all prime numbers
		 */
		List<Integer> primeNumbers = new ArrayList<>();
		generatePrimes(primeNumbers);			//method call
		System.out.println("primes: " + primeNumbers);
				/*
				 * Listed all Primes which is Palindrome.
				 */
		System.out.print("Primes that are palindrome: ");
		for (int i : primeNumbers) {
			if (i > 10 && i == getReverseNumbers(i)) {
				System.out.print(i + " ");
			}
		}
			/*
			 * Listed all Primes which is Anagram.
			 */
		System.out.print("\nPrimes that are anagrams: ");
		for (int i : primeNumbers) {
			int reverseNumber = getReverseNumbers(i);
			if (i > 11 && checkPrime(reverseNumber)) {
				System.out.print(i + " and " + reverseNumber + "; ");
			}
		}
			/*
			 * Listed all Primes which Palindrome and Anagrams also
			 */
		System.out.print("\nPrimes that are both palindrome and anagrams: ");
		for (int i : primeNumbers) {
			int reverseNumber = getReverseNumbers(i);
			if (i > 11 && i == getReverseNumbers(i) && checkPrime(reverseNumber)) {
				System.out.print(i + " ");
			}
		}

	}
			/*
			 * Method to store the all prime number in list.
			 */
	public static void generatePrimes(List<Integer> primeNumbers) {
		for (int i = 1; i <= 1000; i++) {
			if (checkPrime(i))
				primeNumbers.add(i);
		}
	}
		/*
		 * Method to get get reverse number to check Palindrome and Anagram
		 */
	public static int getReverseNumbers(int number) {
		int reverseNumber = 0, r = 0;
		while (number > 0) {
			r = number % 10;
			reverseNumber = reverseNumber * 10 + r;
			number /= 10;
		}
		return reverseNumber;
	}
		/*
		 * Method to check number is prime number or not.
		 */
	public static boolean checkPrime(int number) {
		boolean isPrime = true;
		for (int j = 2; j <= Math.sqrt(number); j++) {
			if (number % j == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
		//main method
	public static void main(String[] args) {
			//method call
		findAnagramOrPalindrome();
	}

}
