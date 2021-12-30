package practice.akashumate.service;

public class Transactions_target_algo {
	public void processTransactions(int[] transactions, int target) {
		int sum=0, flag = 0;
		for(int i=0; i < transactions.length; i++) {
			sum +=  transactions[i];
			
			if(sum >=target) {
				System.out.println("Target achieved after "+ (i+1)+" transactions");
				flag=1;
				break;
			}
		}
		if(flag == 0) {
			System.out.println("Given target is not achieved");
		}
		
	}
}

