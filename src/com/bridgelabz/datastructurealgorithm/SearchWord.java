package com.bridgelabz.datastructurealgorithm;

import java.util.Scanner;
public class SearchWord {
	public static void searchWord(String[] array) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("\nEnter the word : ");
		String word = scanner.next();
		for (int i = 0; i < array.length; i++) {
			System.out.print(i + "-->" + array[i] + " ");
		}
		System.out.println();
		//here calling binarysearch method from BinarySearch class file.
		if (BinarySearch.binarySearch(array, word) >= 0) {
			System.out.println(word + " is contain in the word list");
		} else {
			System.out.println(word + " is not contain in the word list");
		}
		scanner.close();
	}
		//main method
	public static void main(String[] args) {
		String input = "A linked list is a linear collection of data elements whose order is not determined by the placement in memory.\nInstead, each element is stored in a node which points to the next node.";
		String[] array = input.toLowerCase().split(" "); //split paragraphs into array.
		BinarySearch.sortElements(array);
		searchWord(array);
	}
}
