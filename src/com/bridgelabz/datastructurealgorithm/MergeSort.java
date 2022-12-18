package com.bridgelabz.datastructurealgorithm;
/*
 * Problem Statement
 * Write a program to do Merge Sort of list of Strings.
 */
import java.util.Scanner;

public class MergeSort {
	String[] originalArray; // declare instance array.
	String[] tempMergeArray;
	int length;				//declare variable for length of an array.

	public void sortArray(String[] inputArray) {
		this.originalArray = inputArray;
		this.length = inputArray.length;
		this.tempMergeArray = new String[length];
		divideArray(0, length - 1);
	}
		/*
		 * Divide Array
		*/
	public void divideArray(int lowerIndex, int higherIndex) {
		/*
		 * divide list in two parts
		 */
		if (lowerIndex < higherIndex) {
			int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
			/*
			 * It will sort the left side of an array 
			 * recursion call
			 */
			divideArray(lowerIndex, middle);
			/*
			 * It will sort the right side of array
			 * recursion call
			 */
			divideArray(middle + 1, higherIndex);

			mergeArray(lowerIndex, middle, higherIndex); //calling merge array.
		}
	}
		/*
		 * MergeArray
		*/
	public void mergeArray(int lowerIndex, int middle, int higherIndex) {
		for (int i = lowerIndex; i <= higherIndex; i++) {
			tempMergeArray[i] = originalArray[i];		//originalarray value stored into the temporary array
		}
		//here store in the value because original values of lowerIndex and middle does not change.
		int i = lowerIndex;
		int j = middle + 1;
		int k = lowerIndex;
		while (i <= middle && j <= higherIndex) {
			/*
			 * compare tempMergeArray value.
			 */
			if (tempMergeArray[i].compareTo(tempMergeArray[j]) <= 0) {
				/*
				 * replace value in original array.
				 */
				originalArray[k] = tempMergeArray[i];
				i++;
			} else {
				/*
				 * replace value in original array.
				 */
				originalArray[k] = tempMergeArray[j];
				j++;
			}
			k++;
		}
		while (i <= middle) {
			originalArray[k] = tempMergeArray[i];
			k++;
			i++;
		}
	}
		//main method
	public static void main(String[] args) {
		MergeSort merge = new MergeSort();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of an array: ");
		int lengthOfArray = scanner.nextInt();
		String[] inputArray = new String[lengthOfArray];
		System.out.println("Enter the Values Of an Array: ");
		for (int i = 0; i < lengthOfArray; i++) {
			inputArray[i] = scanner.next();
		}
		System.out.println("\nSorted Elements are: ");
		merge.sortArray(inputArray);
		for (String i : inputArray) {
			System.out.println(i + " ");
		}
		scanner.close();
	}

}
