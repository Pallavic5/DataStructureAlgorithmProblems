package com.bridgelabz.datastructurealgorithm;
/*
 * Problem Statement
 * An Anagram Detection Example
	a. Desc -> One string is an anagram of another if the second is simply a
	rearrangement of the first. For example, 'heart' and 'earth' are anagrams...
	b. I/P -> Take 2 Strings as Input such abcd and dcba and Check for Anagrams
	c. O/P -> The Two Strings are Anagram or not....
 */
import java.util.Scanner;

public class Anagram {
		//check two strings Anagram or not.
	public static void isAnagramString() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a First String: ");
		String firstString = scanner.nextLine();
		System.out.println("Enter a Second String: ");
		String secondString = scanner.nextLine();
		testString(firstString, secondString);
		scanner.close();
	}

	public static void testString(String firstString, String secondString) {
		int result = 0;
		/*
		 * compare both string length
		 */
		if (firstString.length() != secondString.length()) {
			System.out.println("'" + firstString + "' and '" + secondString + "' are not anagrams.");
			return;
		}
		for (int i = 0; i < firstString.length(); i++) {
			result += firstString.charAt(i);		
			result -= secondString.charAt(i);
		}
		if (result == 0) {
			System.out.println("'" + firstString + "' and '" + secondString + "' are anagrams.");
		} else {
			System.out.println("'" + firstString + "' and '" + secondString + "' are not anagrams.");
		}
	}
			//main method
	public static void main(String[] args) {
		isAnagramString();                       // calling method
	}
}
