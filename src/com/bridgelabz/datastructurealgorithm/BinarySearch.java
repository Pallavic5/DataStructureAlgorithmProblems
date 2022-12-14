package com.bridgelabz.datastructurealgorithm;
/*
 * Problem Statement
 * Binary Search the Word from Word List
 * a. Desc -> Read in a list of words from File. Then prompt the user to enter a word to
search the list. The program reports if the search word is found in the list.
b. I/P -> read in the list words comma separated from a File and then enter the word
to be searched
c. Logic -> Use Arrays to sort the word list and then do the binary search
d. O/P -> Print the result if the word is found or not
 */
import java.util.Scanner;
/*
 * Binary search is the process of searching an element from sorted array by repeatedly
 * dividing the search interval in half. 
 */
public class BinarySearch {
		//Using Selection Sort for sort elements
	public static void sortElements(String[] a) {
		String temp = "";
		int min = 0;
		/*
		 * traversing elements of an array
		 */
		for(int i = 0; i < a.length; i++) {
			min = i;
			for(int j = i + 1; j < a.length; j++) {
				if(a[j].compareTo(a[min]) < 0) {
					min = j;
				}
			}	
			temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}	
	}
			
	public static int binarySearch(String[] arrayElements, String search) {
		int lowerIndex = 0, higherIndex = arrayElements.length - 1;
		while (lowerIndex <= higherIndex) {
			int middleIndex = (lowerIndex + higherIndex ) / 2;
			/*
			 * compare searching string is equal to middle index string or not.
			 */
			int searchWord = search.compareTo(arrayElements[middleIndex]);
			if (searchWord == 0) {
				return middleIndex;
			}	
			else if(searchWord > 0) {
				lowerIndex = middleIndex + 1;
			}
			else {
				higherIndex = middleIndex - 1;
			}
			middleIndex = (lowerIndex + higherIndex ) / 2;   //new value of middle index.
		}
		if(lowerIndex > higherIndex) {
			System.out.println("Element Not Found");
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of an array: ");
		int lengthOfArray = scanner.nextInt();
		String[] array = new String[lengthOfArray];
		System.out.println("Enter the values of an array : ");
		for (int i = 0; i < lengthOfArray; i++) {
			array[i] = scanner.next();
		}
		System.out.println("Sorted Array: ");
		sortElements(array);
		System.out.println("\nEnter a string:");
		String searchWord = scanner.next();
		int result = binarySearch(array, searchWord);	//call method and store into the result variable.
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at " + "index " + result);
		scanner.close();
	}

}
