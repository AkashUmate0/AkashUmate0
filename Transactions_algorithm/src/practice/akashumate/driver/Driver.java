package practice.akashumate.driver;


import java.util.Scanner;

import practice.akashumate.service.Transactions_target_algo;

public class Driver {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Transactions_target_algo TransactionsTargetAlgo = new Transactions_target_algo();
		System.out.println("Enter the size of transaction array");
		int transactionSize = scanner.nextInt();
		
		int[] transactions = new int[transactionSize];
		
		System.out.println("Enter the values of array");	
		
		for(int i=0; i<transactionSize; i++) {
			transactions[i] = scanner.nextInt();
		}
		
		System.out.println("Enter the total no of targets that needs to be achieved");
		int targetCount = scanner.nextInt();
		
		System.out.println("Enter the value of target");
		int target;
		for (int i=0; i<targetCount; i++) {
			target = scanner.nextInt();
			TransactionsTargetAlgo.processTransactions(transactions, target);
		}

	}

}
