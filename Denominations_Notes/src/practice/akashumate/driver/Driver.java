package practice.akashumate.driver;

import java.util.Arrays;
import java.util.Scanner;

import practice.akashumate.services.MergeSort;
import practice.akashumate.services.NoteCount;

public class Driver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MergeSort mergeSort = new MergeSort();
		NoteCount noteCount = new NoteCount();
		System.out.println("Enter the size of currency denominations");
		int noOfDenomination = scanner.nextInt();
		
		System.out.println("Enter the currency denominations value");
		int[] denominationValues = new int[noOfDenomination];
		
		for(int i=0; i<noOfDenomination; i++) {
			denominationValues[i] = scanner.nextInt();
		}
		System.out.println("Enter the amount you want to pay");
		int amount = scanner.nextInt();
		
		mergeSort.sort(denominationValues, 0, denominationValues.length-1);
//		System.out.println(Arrays.toString(denominationValues));
		noteCount.noteCounter(denominationValues,amount);
	}

}
