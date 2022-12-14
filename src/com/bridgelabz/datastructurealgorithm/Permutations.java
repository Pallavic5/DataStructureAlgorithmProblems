package com.bridgelabz.datastructurealgorithm;
/*
 * Problem Statement
 * Write static functions to return all permutations of a String using iterative method and
   Recursion method. Check if the arrays returned by two string functions are equal.
 */
import java.util.Scanner;
/*
 * if the given string is n then number of possibilities are n!.
 * height/depth = length of string.
 */
public class Permutations {
	/*
	 * permutation function
     * strInput string to calculate permutation for
     * leftIndex starting index
     * rightIndex end index
	 */
	public static void permute(String stringInput, int leftIndex, int rightIndex) {
		if (leftIndex == rightIndex)
			System.out.println(stringInput);
		else {
			for (int i = leftIndex; i <= rightIndex; i++) {
				stringInput = swap(stringInput, leftIndex, i);		
				permute(stringInput, leftIndex + 1, rightIndex);	//first character does not swap.Keep as it is.
				stringInput = swap(stringInput, leftIndex, i);		//initiate backtrack.
			}
		}
	}
		//method for swapping character into string
	public static String swap(String stringInput, int i, int j) {
		char temp;
		char[] charArray = stringInput.toCharArray();	//split string into character type array.		
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);   //convert char array into string using valueOf method.
	}

	// main code
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String resultString = scanner.next();
		int lengthOfString = resultString.length();
		/*
		 * recursive function call.
		 * 0 -> left(starting index of string)
		 * lengthOfString - 1 -> right(ending index of string)
		 */
		permute(resultString, 0, lengthOfString - 1);		
		scanner.close();
	}
}
