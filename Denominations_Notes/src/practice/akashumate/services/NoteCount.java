package practice.akashumate.services;

public class NoteCount {
	public void noteCounter(int[] denominationValues, int amount) {
		int[] noteCount = new int[denominationValues.length]; 
		try {
			for(int i=0; i<denominationValues.length; i++) {
				if(amount >=denominationValues[i]) {
					noteCount[i]= amount/denominationValues[i];
					amount = amount - noteCount[i]*denominationValues[i];
				}
			}
			
			if(amount > 0) {
				System.out.println("Exact amount cannot be given with the highest denomination");
			}else {
				System.out.println("Your payment approach in order to give min no of notes will be");
				for(int i=0; i<denominationValues.length;i++) {
					if(noteCount[i] !=0) {
						System.out.println(denominationValues[i]+":"+noteCount[i]);
					}
				}
			}
				
		}catch(ArithmeticException e){
			System.out.println(e+" notes of denomination 0 is invalid");
		}
	}
	
}
