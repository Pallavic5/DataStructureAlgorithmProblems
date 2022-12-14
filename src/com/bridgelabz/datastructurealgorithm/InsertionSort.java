package com.bridgelabz.datastructurealgorithm;
/*
 * a. Desc -> Reads in strings and prints them in sorted order using insertion sort.
b. I/P -> read in the list words
c. Logic -> Use Insertion Sort to sort the words in the String array
d. O/P -> Print the Sorted List
 */
import java.util.Scanner;
public class InsertionSort {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of an array: ");
		int lengthOfArray = scanner.nextInt();
		String[] array = new String[lengthOfArray];
		System.out.println("Enter the values of an array : ");
		for (int i = 0; i < lengthOfArray; i++) {
			array[i] = scanner.next();
		}
		sortElements(array);
		scanner.close();
	}
	/*
	 * Insertion sort is a simple sorting algorithm.
	 */
	public static void sortElements(String[] array) {
		/*
		 * temp variable store that index value which we have to compares.
		 */
		String temp;
		int j;
		/*
		 * traversing array from first index
		 */
		for (int i = 1; i < array.length; i++) {
			temp = array[i];
			j = i;
			/*
			 * condition for sorting elements
			 * compareTo Method compare two strings lexicographically.
			 */
			while (j > 0 && temp.compareTo(array[j - 1]) < 0) {
				array[j] = array[j - 1];
				j = j - 1;		//decreement j
			}
			array[j] = temp;
		}
		System.out.println("Sorted Elements are: ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
	}
}
