package com.greatlearning.model;

public class NoteCount {

	public void notesCountImplementation(int[] currency, int amount) { 
		
		int [] noteCounter = new int[currency.length];
		
		try {
			for(int i=0;  i < currency.length; i++ ) {
				if(amount >= currency[i]) {
					noteCounter[i] = amount / currency[i];
					amount = amount - noteCounter[i] * currency[i]; 
					System.out.println("note counter " + noteCounter[i]);		
					
				}
			}	
			if (amount > 0) {
				System.out.println("Denomination value given is higher");	
			}
			else {
			    System.out.println("Payment is above the order");
			} 
			
			for (int i=0; i < currency.length; i++) {
				if(noteCounter[i]!=0 ) {
					System.out.println(currency[i]+ ":" + noteCounter[i]);
				}
		}
								
	}catch (Exception ex) {
	  System.out.println("Exeception " + ex);	
	}

 }

	
}
