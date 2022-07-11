package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.model.NoteCount;
import com.greatlearning.service.MergeSort;

public class CurrencyPayment {
	
public static void main(String[] args) {
		
		NoteCount notesCount = new NoteCount();
		System.out.println("Enter the size of the currency in denomination");
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt(); // 3 values
		int[] currency = new int[size];
		
		System.out.println("Enter the currency denomination value");
		for (int i = 0; i < size; i++) {
			currency[i] = sc.nextInt(); // Input of currency from the screen

		}
		System.out.println("Enter the amount to be paid");
		int amount = sc.nextInt();

		MergeSort sort = new MergeSort();
		sort.sort(currency, 0, currency.length-1); 
		
		notesCount.notesCountImplementation(currency,amount); 
		sc.close();
	
 }
}
