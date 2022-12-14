package com.bridgelabz.datastructurealgorithm;
/*Problem Statement
 * a. Desc -> Reads in integers prints them in sorted order using Bubble Sort
b. I/P -> read in the list ints
c. O/P -> Print the Sorted List
 */
import java.util.Scanner;
/*
 * In BubbleSort compare two adjacent element and sort it.
 */
public class BubbleSort {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of an array: ");
		int lengthOfArray = scanner.nextInt();
		int[] array = new int[lengthOfArray];
		System.out.println("Enter the values of an array : ");
		for (int i = 0; i < lengthOfArray; i++) {
			array[i] = scanner.nextInt();
		}
		System.out.println("\nSorted Elements are: ");
		sortArray(array);
		scanner.close();
	}
	
	public static void sortArray(int[] myArray) {
		int temp;
		/*
		 * first for loop is for no.of round or phase.
		 * second for loop for traverse two adjacent elements.
		 */
		for (int i = 0; i < myArray.length; i++) {
			int flag = 0;
			/*
			 * this helps to do not repeat traverse & compare sorted number														
			 */
			for (int j = 0; j < myArray.length - 1 - i; j++) {
				/*
				 * condition for compare two elements.
				 */
				if (myArray[j] > myArray[j + 1]) {
					temp = myArray[j];
					myArray[j] = myArray[j + 1];
					myArray[j + 1] = temp;
					flag = 1; // if elements get swap then flag value is equal to 1.
				}
			}
			/*
			 * this condition is true when list get sorted. and break first for loop.
			 */
			if (flag == 0) {
				break;
			}
		}
		// printing array
		for (int i = 0; i < myArray.length; i++) {
			System.out.print(myArray[i] + " ");
		}

	}

}
